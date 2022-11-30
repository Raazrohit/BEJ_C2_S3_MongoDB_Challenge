package com.question.BEJ_C2_S3_MongoDB_Challenge.service;

import com.question.BEJ_C2_S3_MongoDB_Challenge.domain.Track;
import com.question.BEJ_C2_S3_MongoDB_Challenge.exception.ArtistNotFoundException;
import com.question.BEJ_C2_S3_MongoDB_Challenge.exception.TrackAlreadyExistsException;
import com.question.BEJ_C2_S3_MongoDB_Challenge.exception.TrackNotFoundException;

import java.util.List;

public interface TrackService {
    Track saveTrack(Track track) throws TrackAlreadyExistsException;
    List<Track> getAllTracks();
    boolean deleteTrack(int trackId) throws TrackNotFoundException;
    List<Track> getAllTracksByRatingGreaterThan4();
    List<Track> getAllTracksByArtistName(String artistName) throws ArtistNotFoundException;
}
