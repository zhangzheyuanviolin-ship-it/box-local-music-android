            package p000;

            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.Collections;
            import java.util.TreeMap;
            
            public abstract class IO1IOO {
                public static final int I00000oIO = 0;

                static {
/* 5 */             TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
/* 8 */             Charset charset = StandardCharsets.ISO_8859_1;
/* 14 */            treeMap.put(charset.name(), charset);
/* 17 */            Charset charset2 = StandardCharsets.US_ASCII;
/* 23 */            treeMap.put(charset2.name(), charset2);
/* 26 */            Charset charset3 = StandardCharsets.UTF_16;
/* 32 */            treeMap.put(charset3.name(), charset3);
/* 35 */            Charset charset4 = StandardCharsets.UTF_16BE;
/* 41 */            treeMap.put(charset4.name(), charset4);
/* 44 */            Charset charset5 = StandardCharsets.UTF_16LE;
/* 50 */            treeMap.put(charset5.name(), charset5);
/* 53 */            Charset charset6 = StandardCharsets.UTF_8;
/* 59 */            treeMap.put(charset6.name(), charset6);
/* 62 */            Collections.unmodifiableSortedMap(treeMap);
                }
            }
