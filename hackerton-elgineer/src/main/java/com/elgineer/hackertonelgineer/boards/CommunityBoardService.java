package com.elgineer.hackertonelgineer.boards;

import java.util.List;

public interface CommunityBoardService {
    List<CommunityBoard> getAllCommunityBoards();

    CommunityBoard getCommunityBoardById(Long boardId);

    CommunityBoard createCommunityBoard(String name);

    void deleteCommunityBoard(Long boardId);
}
