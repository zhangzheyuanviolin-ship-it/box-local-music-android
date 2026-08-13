            package p000;

            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Arrays;
            import java.util.List;
            
            public abstract class iilIio {
                public static final boolean I00000oIO(Throwable th, IllOOo00lI illOOo00lI) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    List listAsList;
                    Object objInvoke;
/* 1 */             Integer num = O00O1IiOllOO.I00000oIO;
/* 3 */             IiOoo01Oli1 iiOoo01Oli1 = null;
/* 4 */             if (num == null || num.intValue() >= 19) {
/* 39 */                listAsList = Arrays.asList(th.getSuppressed());
                    } else {
/* 15 */                Method method = OO1IIol.I00000oOI;
/* 32 */                listAsList = (method == null || (objInvoke = method.invoke(th, null)) == null) ? Il01100l.I00iOIl : Arrays.asList((Throwable[]) objInvoke);
                    }
/* 46 */            int size = listAsList.size();
/* 50 */            boolean z = false;
/* 52 */            for (int i = 0; i < size; i++) {
/* 62 */                if (((Throwable) listAsList.get(i)) instanceof IiOoo01Oli1) {
/* 50 */                    return false;
                        }
                    }
                    try {
/* 72 */                IOl0l1Io iOl0l1Io = (IOl0l1Io) illOOo00lI.invoke();
/* 74 */                if (iOl0l1Io != null) {
/* 76 */                    boolean z2 = iOl0l1Io.I00000oOI;
/* 78 */                    List list = iOl0l1Io.I00000oIO;
/* 80 */                    if (z2) {
/* 85 */                        int size2 = list.size();
/* 90 */                        for (int i2 = 0; i2 < size2; i2++) {
/* 98 */                            ((IOl0o1) list.get(i2)).getClass();
                                }
                            } else if (!list.isEmpty()) {
/* 114 */                       z = true;
                            }
                        }
/* 115 */               if (z) {
/* 119 */                   iiOoo01Oli1 = new IiOoo01Oli1(iOl0l1Io);
                        }
                    } catch (Throwable th2) {
/* 123 */               iiOoo01Oli1 = th2;
                    }
/* 124 */           if (iiOoo01Oli1 != null) {
/* 126 */               ilIilolOlIoO.I00000oIO(th, iiOoo01Oli1);
                    }
/* 332 */           return z;
                }
            }
