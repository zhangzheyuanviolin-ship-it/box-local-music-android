            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Set;
            import java.util.logging.Level;
            
            public final class ilOiIo1Ol extends i1Io0lIii {
                public static final Set I00000oOI;
                public static final ilOO0OII0 I0000Il00O;

                static {
/* 20 */            Set<iioo1ooIo> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(iioOl0O0ll.I00000oIO, il010O.I00000oOI, il0I0lilOOO.I00000oIO)));
/* 24 */            I00000oOI = setUnmodifiableSet;
/* 28 */            HashMap map = new HashMap();
/* 33 */            HashMap map2 = new HashMap();
/* 44 */            for (iioo1ooIo iioo1ooio : setUnmodifiableSet) {
/* 52 */                if (iioo1ooio == null) {
/* 92 */                    IOOlIIilOl0.I000II("key".concat(" must not be null"));
/* 95 */                    return;
                        }
/* 54 */                boolean z = iioo1ooio.I0000Il00O;
/* 56 */                if (!z) {
/* 75 */                    map2.remove(iioo1ooio);
/* 80 */                    map.put(iioo1ooio, il0oioOOooo.I00000oIO);
                        } else if (!z) {
/* 71 */                    I000II.I000iOII("key must be repeating");
/* 74 */                    return;
                        } else {
/* 60 */                    map.remove(iioo1ooio);
/* 65 */                    map2.put(iioo1ooio, il0oioOOooo.I00000oOI);
                        }
                    }
/* 98 */            HashMap map3 = new HashMap();
/* 103 */           HashMap map4 = new HashMap();
/* 106 */           map3.putAll(map);
/* 109 */           map4.putAll(map2);
/* 114 */           Set set = I00000oOI;
/* 116 */           Level level = Level.ALL;
/* 118 */           ilOO0OII0 iloo0oii0 = new ilOO0OII0();
/* 121 */           iloo0oii0.I00000oIO = set;
/* 123 */           VarHandle.storeStoreFence();
/* 126 */           I0000Il00O = iloo0oii0;
                }
            }
