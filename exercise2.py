import hashlib

def hash_string():
    user_input = input("Enter a string:\n")
    hashed_result = hashlib.md5(user_input.encode())
    print("The byte equivalent of hash is:", hashed_result.digest())

def list_algorithms():
    print("The available algorithms are:", ', '.join(hashlib.algorithms_guaranteed))

if __name__ == "__main__":
    hash_string()
    list_algorithms()
