package cn.springmvc.onlyo.ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * Element、Cache、CacheManager是Ehcache最重要的API。
 *
 *Element：缓存的元素，它维护着一个键值对。
 *Cache：它是Ehcache的核心类，它有多个Element，并被CacheManager管理。
 * 它实现了对缓存的逻辑行为。
 *CacheManager：Cache的容器对象，并管理着Cache的生命周期。
 */
public class EhcacheDemo {
    public static void main(String[] args) throws Exception {
        // Create a cache manager
        final CacheManager cacheManager = new CacheManager();

        // create the cache called "helloworld"
        final Cache cache = cacheManager.getCache("helloworld");

        // create a key to map the data to
        final String key = "greeting";

        // Create a data element
        final Element putGreeting = new Element(key, "Hello, World!");

        // Put the element into the data store
        cache.put(putGreeting);

        // Retrieve the data element
        final Element getGreeting = cache.get(key);
        // Print the value
        System.out.println(getGreeting.getObjectValue());
    }
}
