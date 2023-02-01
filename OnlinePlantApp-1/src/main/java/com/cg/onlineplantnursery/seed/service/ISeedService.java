package com.cg.onlineplantnursery.seed.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.onlineplantnursery.exception.SeedIdNotFoundException;
import com.cg.onlineplantnursery.seed.entity.Seed;

@Service
public interface ISeedService {
	
	public Seed addSeed(Seed seed) throws SeedIdNotFoundException;
	
	public Seed updateSeed(int seedId) throws SeedIdNotFoundException;
	
	public Seed deleteSeed(Seed seed) throws SeedIdNotFoundException;
	
	public Seed viewSeed(int seedId) throws SeedIdNotFoundException;
	
	public Seed getSeedByBloomTime(String bloomTime) throws SeedIdNotFoundException;
	
//	public Seed getSeedByWatering(String watering) throws SeedIdNotFoundException;
//	
//	public Seed getSeedByDifficultyLevel(String difficultyLevel) throws SeedIdNotFoundException;
//	
//	public Seed getSeedByMinTemperature(int minTemperature) throws SeedIdNotFoundException;
//	
//	public Seed getSeedByMaxTemperature(int maxTemperature) throws SeedIdNotFoundException;
//	
//	public Seed getSeedBySeedsDescription(String description) throws SeedIdNotFoundException;
//	
//	public Seed getSeedBySeedsStock(int seedsStock) throws SeedIdNotFoundException;
//	
//	public Seed getSeedBySeedsCost(double seedsCost) throws SeedIdNotFoundException;
//	
//	public Seed getSeedBySeedsPerPacket(int seedsPerPacket) throws SeedIdNotFoundException;
	
	public List<Seed> getSeedByCommonName(String commonName) throws SeedIdNotFoundException;
	
	public List<Seed> getAllSeeds() throws SeedIdNotFoundException;
	
	public List<Seed> getAllSeedByTypeOfSeeds(String typeOfSeeds) throws SeedIdNotFoundException;
	

}
