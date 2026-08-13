            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class O01iI00o {
                public static final loilIl10Ii I00000oIO = new loilIl10Ii(10);

                public static final int I00000oIO(OilOloI oilOloI, O011OoiO1 o011OoiO1, String str) {
/* 1 */             I0000O(o011OoiO1, oilOloI);
/* 4 */             int iI0000O = oilOloI.I0000O(str);
/* 9 */             if (iI0000O != -3 || !o011OoiO1.I00000oIO.I000II) {
/* 18 */                return iI0000O;
                    }
/* 19 */            O1OIll00i o1OIll00i = o011OoiO1.I0000Il00O;
/* 25 */            IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(24);
/* 28 */            iO1Io1IOOOIi.I00iiI = oilOloI;
/* 30 */            iO1Io1IOOOIi.I00iiO = o011OoiO1;
/* 32 */            VarHandle.storeStoreFence();
/* 37 */            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) o1OIll00i.I00iiI;
/* 43 */            Map map = (Map) concurrentHashMap.get(oilOloI);
/* 45 */            loilIl10Ii loilil10ii = I00000oIO;
/* 55 */            Object obj = map != null ? map.get(loilil10ii) : null;
/* 56 */            Object objInvoke = obj != null ? obj : null;
/* 60 */            if (objInvoke == null) {
/* 63 */                objInvoke = iO1Io1IOOOIi.invoke();
/* 67 */                Object concurrentHashMap2 = concurrentHashMap.get(oilOloI);
/* 71 */                if (concurrentHashMap2 == null) {
/* 76 */                    concurrentHashMap2 = new ConcurrentHashMap(2);
/* 79 */                    concurrentHashMap.put(oilOloI, concurrentHashMap2);
                        }
/* 84 */                ((Map) concurrentHashMap2).put(loilil10ii, objInvoke);
                    }
/* 93 */            Integer num = (Integer) ((Map) objInvoke).get(str);
/* 95 */            if (num != null) {
/* 97 */                return num.intValue();
                    }
/* 8 */             return -3;
                }

                public static final int I00000oOI(OilOloI oilOloI, O011OoiO1 o011OoiO1, String str, String str2) {
/* 1 */             int iI00000oIO = I00000oIO(oilOloI, o011OoiO1, str);
/* 6 */             if (iI00000oIO != -3) {
/* 8 */                 return iI00000oIO;
                    }
/* 483 */           throw new Oili1O(oilOloI.I00000oIO() + " does not contain element with name '" + str + '\'' + str2);
                }

                public static final boolean I0000Il00O(O011OoiO1 o011OoiO1, OilOloI oilOloI) {
/* 5 */             if (o011OoiO1.I00000oIO.I00000oOI) {
/* 50 */                return true;
                    }
/* 7 */             List annotations = oilOloI.getAnnotations();
/* 15 */            if ((annotations instanceof Collection) && annotations.isEmpty()) {
/* 48 */                return false;
                    }
/* 27 */            Iterator it = annotations.iterator();
/* 35 */            while (it.hasNext()) {
/* 45 */                if (((Annotation) it.next()) instanceof O01OoII1) {
/* 50 */                    return true;
                        }
                    }
/* 48 */            return false;
                }

                public static final void I0000O(O011OoiO1 o011OoiO1, OilOloI oilOloI) {
/* 7 */             O0000Ioio00.I0000O(oilOloI.I000oI1ioi(), Oli00oo0l.I00000oOI);
                }
            }
