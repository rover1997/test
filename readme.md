<!--
 * @Author: Rover
 * @Date: 2019-11-26 22:05:32
 * @LastEditors: Rover
 * @LastEditTime: 2019-11-29 00:26:20
 -->

# my first markdown

This is my first markdown file

So it is obvious that this file is useless.

Here is some simple code


    import urllib.request

    url = 'http://www.baidu.com'

    print('way 1:')
    response1 = urllib.request.urlopen(url)
    print(response1.getcode())
    print(len(response1.read()))
