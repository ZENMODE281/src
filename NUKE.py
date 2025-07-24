import os
ip = input("Enter IP to ping: ")
response = os.system(f"ping -c 1 {ip}")
if response == 0:
    print("Host is up!")
else:
    print("Host is down.")