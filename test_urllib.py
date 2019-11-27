'''
@Author: Rover
@Date: 2019-11-27 20:47:30
@LastEditors: Rover
@LastEditTime: 2019-11-27 21:26:05
'''
import urllib.request
from twisted.python.compat import cookielib

url = 'http://www.baidu.com'

print('way 1:')
response1 = urllib.request.urlopen(url)
print(response1.getcode())
print(len(response1.read()))

print('way 2')
request = urllib.request.Request(url)
request.add_header("user-agent", "Mozilla/5.0")
response2 = urllib.request.urlopen(request)
print(response2.getcode())
print(len(response2.read()))

print('way 3')
cj = cookielib.CookieJar()
opener = urllib.request.build_opener(urllib.request.HTTPCookieProcessor(cj))
urllib.request.install_opener(opener)
response3 = urllib.request.urlopen(url)
print(response3.getcode())
print(cj)
print(response3.read())
