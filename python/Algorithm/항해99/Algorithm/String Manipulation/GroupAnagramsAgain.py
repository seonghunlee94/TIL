
# 먼저 key value 값을 저장할 수 있도록 dictionary를 만든다.

# dictionary에 값을 통일해서 넣기 위해, 문자열을 정렬시키러야.

# 그 다음에 for문을 통해 key = 정렬한 문자열을 비교한 후, 같으면, value = []로 넣어줄거야.



# 문자열을 정렬시키기 위해서 유니코드를 사용할거야. = ord

"""
    구현 후 문제점.
    1. strs를 그냥 바로 for문을 돌려서
    word를 받은 후 정렬하면 됐는데.
    sorted 해야된다고 잘못 생각했음.

    자료구조를 먼저 생각해보자.


    애너그램 구현 팁
    1. collections.defaultdict 를 활용하면
    딕셔너리를 key 값이 없을 경우에도 에러 없이 넣어진다.

"""



def gruopAnagrams(strs):
    group_dict = {}

    # 먼저 strs에서 받은 배열을 단어 하나씩 받은 후, 단어를 정렬했음.
    sorted_word = [sorted(word) for word in strs] # [['a', 'e', 't'], ['a', 'e', 't'], ['a', 'n', 't'], ['a', 'e', 't'], ['a', 'n', 't'], ['a', 'b', 't']]


    for i in range(len(sorted_word)):
        word = ''.join(sorted_word[i]) # 각 문자열 하나씩 핸들링
        # word = aet

        if word in group_dict: # 딕셔너리 안에 있는 문자일 때
            group_dict[word].append(strs[i]) # 똑같은 문자의 인덱스 넣어주기.
        else:
            group_dict[word] = [strs[i]] # 없을 시, key 생성하면서 넣어주기
        # group_dict 구조. key : ['value']

    result = list(group_dict.values()) # [['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]
    print(result)



strs = ["eat","tea","tan","ate","nat","bat"]
gruopAnagrams(strs)


