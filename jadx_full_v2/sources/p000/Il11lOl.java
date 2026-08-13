            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Set;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            public final class Il11lOl implements OOiO01IO {
                public final int I00000oIO;

                public Il11lOl(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object get() {
                    switch (this.I00000oIO) {
                        case 0:
/* 171 */                   ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
/* 176 */                   O00Ii00o0 o00Ii00o0 = new O00Ii00o0(1);
/* 179 */                   o00Ii00o0.I00iiI = executorServiceNewSingleThreadExecutor;
/* 181 */                   VarHandle.storeStoreFence();
/* 184 */                   return o00Ii00o0;
                        default:
/* 10 */                    loilIl10Ii loilil10ii = new loilIl10Ii(16);
/* 15 */                    HashMap map = new HashMap();
/* 18 */                    Set set = Collections.EMPTY_SET;
/* 23 */                    if (set == null) {
/* 165 */                       IOOlIIilOl0.I000II("Null flags");
/* 20 */                        return null;
                            }
/* 27 */                    I1lIl0OolO i1lIl0OolO = new I1lIl0OolO();
/* 32 */                    i1lIl0OolO.I00000oIO = 30000L;
/* 37 */                    i1lIl0OolO.I00000oOI = 86400000L;
/* 39 */                    i1lIl0OolO.I0000Il00O = set;
/* 41 */                    VarHandle.storeStoreFence();
/* 46 */                    map.put(OOIio1010OoO.I00iOIl, i1lIl0OolO);
/* 49 */                    if (set == null) {
/* 161 */                       IOOlIIilOl0.I000II("Null flags");
/* 20 */                        return null;
                            }
/* 53 */                    I1lIl0OolO i1lIl0OolO2 = new I1lIl0OolO();
/* 58 */                    i1lIl0OolO2.I00000oIO = 1000L;
/* 60 */                    i1lIl0OolO2.I00000oOI = 86400000L;
/* 62 */                    i1lIl0OolO2.I0000Il00O = set;
/* 64 */                    VarHandle.storeStoreFence();
/* 69 */                    map.put(OOIio1010OoO.I00iiO, i1lIl0OolO2);
/* 72 */                    if (set == null) {
/* 157 */                       IOOlIIilOl0.I000II("Null flags");
/* 20 */                        return null;
                            }
/* 89 */                    Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(OiOII0OOOi.I00iiI)));
/* 93 */                    if (setUnmodifiableSet == null) {
/* 153 */                       IOOlIIilOl0.I000II("Null flags");
/* 20 */                        return null;
                            }
/* 97 */                    I1lIl0OolO i1lIl0OolO3 = new I1lIl0OolO();
/* 100 */                   i1lIl0OolO3.I00000oIO = 86400000L;
/* 102 */                   i1lIl0OolO3.I00000oOI = 86400000L;
/* 104 */                   i1lIl0OolO3.I0000Il00O = setUnmodifiableSet;
/* 106 */                   VarHandle.storeStoreFence();
/* 111 */                   map.put(OOIio1010OoO.I00iiI, i1lIl0OolO3);
/* 127 */                   if (map.keySet().size() < OOIio1010OoO.values().length) {
/* 149 */                       I000II.I001IO000("Not all priorities have been configured");
/* 20 */                        return null;
                            }
/* 131 */                   new HashMap();
/* 136 */                   I1lIl000I1lI i1lIl000I1lI = new I1lIl000I1lI();
/* 139 */                   i1lIl000I1lI.I00000oIO = loilil10ii;
/* 141 */                   i1lIl000I1lI.I00000oOI = map;
/* 143 */                   VarHandle.storeStoreFence();
/* 168 */                   return i1lIl000I1lI;
                    }
                }
            }
