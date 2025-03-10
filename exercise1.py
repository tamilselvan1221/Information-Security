def encrypt():
    string = input("\t\tInput String: ")
    encrypted_string = ''.join(chr(ord(char) + 3) for char in string)
    print(f"\n\t\tEncrypted String: {encrypted_string}")

def decrypt():
    string = input("\t\tInput String: ")
    decrypted_string = ''.join(chr(ord(char) - 3) for char in string)
    print(f"\n\t\tDecrypted String: {decrypted_string}")

if __name__ == "__main__":
    print("\t\tConfidentiality")
    while True:
        print("\t\tChoose operation")
        print("\t\t1. Encryption")
        print("\t\t2. Decryption")
        print("\t\t3. Exit")

        choice = input("\t\t")

        if choice == '1':
            encrypt()
        elif choice == '2':
            decrypt()
        elif choice == '3':
            print("\t\tExiting... Goodbye!")
            break
        else:
            print("\t\tInvalid choice, please try again.")

        ch = input("\n\t\tDo you want to continue (Y/N): ")
        if ch.lower() != 'y':
            print("\t\tExiting... Goodbye!")
            break
