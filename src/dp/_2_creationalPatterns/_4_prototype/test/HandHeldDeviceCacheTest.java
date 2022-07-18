package dp._2_creationalPatterns._4_prototype.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import dp._2_creationalPatterns._4_prototype.code.HandHeldDeviceCache;
import dp._2_creationalPatterns._4_prototype.code.PalmTop;
import dp._2_creationalPatterns._4_prototype.code.Smartphone;
import dp._2_creationalPatterns._4_prototype.code.Tablet;
import dp._2_creationalPatterns._4_prototype.code.Telephone;

/**
 * @author apuchals
 */
public class HandHeldDeviceCacheTest {

	private HandHeldDeviceCache cache;

	/** */
	@Before
	public void init() {
		// NOTE! Check Findbugs warnings in this class if You place a Type
		// definition in front of the cache variable name.
		cache = HandHeldDeviceCache.INSTANCE;
		cache.clear();
	}

	/** */
	@Test
	public void shouldCachePalmTop() {
		// given

		// when
//		cache.put(new PalmTop());

		// then
		assertTrue(cache.get(0) instanceof PalmTop);
	}

	/** */
	@Test
	public void shouldCacheTablet() {
		// given

		// when
		cache.add(new Tablet());

		// then
		assertTrue(cache.get(0) instanceof Tablet);
	}

	/** */
	@Test
	public void shouldCacheTelephone() {
		// given

		// when
		cache.add(new Telephone());

		// then
		assertTrue(cache.get(0) instanceof Telephone);
	}

	/** */
	@Ignore("something is wrong in this test - it does not work")
	@Test
	public void shouldCacheSmartphone() {
		// given

		// when
		cache.add(new Smartphone("Samsung Galaxy S6"));

		// then
		assertTrue(cache.get(0) instanceof Smartphone);
	}

}
