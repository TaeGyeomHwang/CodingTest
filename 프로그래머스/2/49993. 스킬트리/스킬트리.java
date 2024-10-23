import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int validCount = 0;

        // 배열의 각 스킬 트리를 루프
        for (String skillTree : skill_trees) {
            if (isValidSkillTree(skill, skillTree)) {
                validCount++;
            }
        }

        return validCount;
    }
    
    private boolean isValidSkillTree(String skill, String skillTree) {
        int skillIndex = 0; // 스킬트리의 첫 번째 스킬부터 확인 시작

        // 스킬 트리의 각 문자를 반복
        for (char c : skillTree.toCharArray()) {
            int currentSkillPos = skill.indexOf(c);

            // 현재 스킬이 스킬 트리에 있는 경우
            if (currentSkillPos != -1) {
                // 배우지 않은 스킬이 있다면 불가능한 스킬트리다
                if (currentSkillPos != skillIndex) {
                    return false;
                }
                // 다음 배울 스킬로 인덱스를 이동
                skillIndex++;
            }
        }
        
        // 현재 스킬이 스킬 트리에 없는 경우
        return true; 
    }
}