import os
lesson = input('Lesson number: ')
os.system(f'cd lesson_{lesson} && zip lesson_{lesson}.zip *.java')
os.system(f'mv lesson_{lesson}/lesson_{lesson}.zip lesson_{lesson}.zip')