            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Set;
            
            public final class IOiIi0Oi {
                public final String I00000oIO;
                public final Set I00000oOI;
                public final Set I0000Il00O;
                public final int I0000O;
                public final int I0000oI00;
                public final IOiOiIIiii1 I0001Ioi1lo;
                public final Set I000II;

                public IOiIi0Oi(String str, Set set, Set set2, int i, int i2, IOiOiIIiii1 iOiOiIIiii1, Set set3) {
/* 4 */             this.I00000oIO = str;
/* 10 */            this.I00000oOI = Collections.unmodifiableSet(set);
/* 16 */            this.I0000Il00O = Collections.unmodifiableSet(set2);
/* 18 */            this.I0000O = i;
/* 20 */            this.I0000oI00 = i2;
/* 22 */            this.I0001Ioi1lo = iOiOiIIiii1;
/* 28 */            this.I000II = Collections.unmodifiableSet(set3);
                }

                public static IOiIOOl0lO I00000oIO(OOiilOlOOI oOiilOlOOI) {
/* 6 */             IOiIOOl0lO iOiIOOl0lO = new IOiIOOl0lO();
/* 10 */            iOiIOOl0lO.I00000oIO = null;
/* 14 */            HashSet hashSet = new HashSet();
/* 17 */            iOiIOOl0lO.I00000oOI = hashSet;
/* 24 */            iOiIOOl0lO.I0000Il00O = new HashSet();
/* 26 */            iOiIOOl0lO.I0000O = 0;
/* 28 */            iOiIOOl0lO.I0000oI00 = 0;
/* 35 */            iOiIOOl0lO.I000II = new HashSet();
/* 37 */            hashSet.add(oOiilOlOOI);
/* 40 */            Collections.addAll(hashSet, new OOiilOlOOI[0]);
/* 43 */            VarHandle.storeStoreFence();
/* 49 */            return iOiIOOl0lO;
                }

                public static IOiIOOl0lO I00000oOI(Class cls) {
/* 6 */             return new IOiIOOl0lO(cls, new Class[0]);
                }

                public static IOiIi0Oi I0000Il00O(Class cls, Object obj) {
/* 1 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = I00000oOI(cls);
/* 6 */             iOiIOOl0lOI00000oOI.I0000oI00 = 1;
/* 11 */            IOiIOO iOiIOO = new IOiIOO(0);
/* 14 */            iOiIOO.I00iiI = obj;
/* 16 */            VarHandle.storeStoreFence();
/* 19 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = iOiIOO;
/* 21 */            return iOiIOOl0lOI00000oOI.I00000oOI();
                }

                public static IOiIi0Oi I0000O(Object obj, Class cls, Class... clsArr) {
/* 3 */             HashSet hashSet = new HashSet();
/* 8 */             HashSet hashSet2 = new HashSet();
/* 13 */            HashSet hashSet3 = new HashSet();
/* 20 */            hashSet.add(OOiilOlOOI.I00000oIO(cls));
/* 26 */            for (Class cls2 : clsArr) {
/* 32 */                lII0IlO.I00000oIO("Null interface", cls2);
/* 39 */                hashSet.add(OOiilOlOOI.I00000oIO(cls2));
                    }
/* 48 */            IOiIOO iOiIOO = new IOiIOO(1);
/* 51 */            iOiIOO.I00iiI = obj;
/* 53 */            VarHandle.storeStoreFence();
/* 70 */            return new IOiIi0Oi(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, iOiIOO, hashSet3);
                }

                public final String toString() {
/* 64 */            return "Component<" + Arrays.toString(this.I00000oOI.toArray()) + ">{" + this.I0000O + ", type=" + this.I0000oI00 + ", deps=" + Arrays.toString(this.I0000Il00O.toArray()) + "}";
                }
            }
