            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Proxy;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public abstract class iOO0O10 {
                public static final Object I00000oIO(Class cls, Map map, List list) {
/* 3 */             int i = 3;
/* 4 */             I01iiIii10O i01iiIii10O = new I01iiIii10O(i);
/* 7 */             i01iiIii10O.I00iiI = map;
/* 9 */             VarHandle.storeStoreFence();
/* 14 */            OllO00oiil ollO00oiil = new OllO00oiil(i01iiIii10O);
/* 19 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(i);
/* 22 */            i01illiil1Oo.I00iiO = cls;
/* 24 */            i01illiil1Oo.I00iiI = map;
/* 26 */            VarHandle.storeStoreFence();
/* 31 */            OllO00oiil ollO00oiil2 = new OllO00oiil(i01illiil1Oo);
/* 44 */            I111liOi i111liOi = new I111liOi();
/* 47 */            i111liOi.I00000oIO = cls;
/* 49 */            i111liOi.I00000oOI = map;
/* 51 */            i111liOi.I0000Il00O = ollO00oiil2;
/* 53 */            i111liOi.I0000O = ollO00oiil;
/* 55 */            i111liOi.I0000oI00 = list;
/* 57 */            VarHandle.storeStoreFence();
/* 60 */            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, i111liOi);
                }

                public static Object I00000oOI(Class cls, Map map) {
/* 1 */             Set setKeySet = map.keySet();
/* 15 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(setKeySet, 10));
/* 18 */            Iterator it = setKeySet.iterator();
/* 26 */            while (it.hasNext()) {
/* 39 */                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
                    }
/* 43 */            return I00000oIO(cls, map, arrayList);
                }
            }
