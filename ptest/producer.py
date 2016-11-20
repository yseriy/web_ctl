import pika
import json


queue = 'testQueue'
object = {
   'id': 1000000,
   'stepInTask': 2,
   'lastStepInTask': 1,
   'subTasks': [
        {
            'id'     : 100,
            'address': 'txtAddress',
            'command': 'txtCommand',
            'args'   : 'txtArgs',
        },
        {
            'id'     : 101,
            'address': 'txtAddress1',
            'command': 'txtCommand1',
            'args'   : 'txtArgs1',
        },
    ],
}
body = json.dumps(object)

parameters = pika.ConnectionParameters(host='localhost')
properties = pika.BasicProperties(content_type='application/json')

connection = pika.BlockingConnection(parameters)
channel = connection.channel()

channel.queue_declare(queue=queue, durable=True)
channel.publish(exchange='', routing_key=queue, body=body, properties=properties)

print(' [x] Send', "'" + body + "'")
connection.close()
