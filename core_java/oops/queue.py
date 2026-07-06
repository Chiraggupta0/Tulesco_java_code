from collections import deque

class Queue:
    def __init__(self):
        self.queue = deque()


    def enqueue(self, item):
        self.queue.append(item)


    def dequeue(self):
        if not self.is_empty():
            return self.queue.popleft()
        return "Queue is empty!"

    def front(self):
        if not self.is_empty():
            return self.queue[0]
        return "Queue is empty!"

    def is_empty(self):
        return len(self.queue) == 0

 
    def display(self):
        print("Queue:", list(self.queue))


q = Queue()
q.enqueue(10)
q.enqueue(20)
q.enqueue(30)
q.display()
print("Dequeued:", q.dequeue())
print("Front element:", q.front())
q.display()
