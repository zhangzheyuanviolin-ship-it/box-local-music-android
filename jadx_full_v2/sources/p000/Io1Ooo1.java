            package p000;

            import java.lang.invoke.VarHandle;
            import java.time.ZoneOffset;
            import java.time.format.DateTimeFormatter;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Date;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            
            public final class Io1Ooo1 {
                public static final OOI0IO111Ii I00000oOI = new OOI0IO111Ii("fire-global");
                public static final OOI0IO111Ii I0000Il00O = new OOI0IO111Ii("fire-count");
                public static final OOI0IO111Ii I0000O = new OOI0IO111Ii("last-used-date");
                public O00lOo I00000oIO;

                public static String I00000oOI(long j) {
/* 22 */            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
                }

                public static OOI0IO111Ii I0000Il00O(OI0ooi10l oI0ooi10l, String str) {
/* 17 */            for (Map.Entry entry : oI0ooi10l.I00000oIO().entrySet()) {
/* 31 */                if (entry.getValue() instanceof Set) {
/* 39 */                    Iterator it = ((Set) entry.getValue()).iterator();
/* 47 */                    while (it.hasNext()) {
/* 59 */                        if (str.equals((String) it.next())) {
/* 71 */                            return new OOI0IO111Ii(((OOI0IO111Ii) entry.getKey()).I00000oIO);
                                }
                            }
                        }
                    }
/* 75 */            return null;
                }

                public static void I0000O(OI0ooi10l oI0ooi10l, String str) {
/* 1 */             OOI0IO111Ii oOI0IO111IiI0000Il00O = I0000Il00O(oI0ooi10l, str);
/* 5 */             if (oOI0IO111IiI0000Il00O == null) {
/* 7 */                 return;
                    }
/* 12 */            Object hashSet = new HashSet();
/* 15 */            Object objI0000Il00O = oI0ooi10l.I0000Il00O(oOI0IO111IiI0000Il00O);
/* 19 */            if (objI0000Il00O != null) {
/* 22 */                hashSet = objI0000Il00O;
                    }
/* 25 */            HashSet hashSet2 = new HashSet((Collection) hashSet);
/* 28 */            hashSet2.remove(str);
/* 35 */            if (!hashSet2.isEmpty()) {
/* 46 */                oI0ooi10l.I0000O(oOI0IO111IiI0000Il00O, hashSet2);
                    } else {
/* 37 */                oI0ooi10l.I00000oOI();
/* 42 */                oI0ooi10l.I00000oIO.remove(oOI0IO111IiI0000Il00O);
                    }
                }

                public final synchronized ArrayList I00000oIO() {
                    try {
/* 4 */                 ArrayList arrayList = new ArrayList();
/* 11 */                String strI00000oOI = I00000oOI(System.currentTimeMillis());
/* 15 */                O00lOo o00lOo = this.I00000oIO;
/* 17 */                o00lOo.getClass();
/* 48 */                for (Map.Entry entry : ((Map) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new I0II0OiI(o00lOo, (IOoil1iiIilo) null, 24))).entrySet()) {
/* 62 */                    if (entry.getValue() instanceof Set) {
/* 72 */                        HashSet hashSet = new HashSet((Set) entry.getValue());
/* 75 */                        hashSet.remove(strI00000oOI);
/* 82 */                        if (hashSet.isEmpty()) {
                                    continue;
                                } else {
/* 90 */                            String str = ((OOI0IO111Ii) entry.getKey()).I00000oIO;
/* 94 */                            ArrayList arrayList2 = new ArrayList(hashSet);
/* 99 */                            I1l0OoO1 i1l0OoO1 = new I1l0OoO1();
/* 102 */                           if (str == null) {
/* 124 */                               throw new NullPointerException("Null userAgent");
                                    }
/* 104 */                           i1l0OoO1.I00000oIO = str;
/* 106 */                           i1l0OoO1.I00000oOI = arrayList2;
/* 108 */                           VarHandle.storeStoreFence();
/* 111 */                           arrayList.add(i1l0OoO1);
                                }
                            }
                        }
/* 125 */               long jCurrentTimeMillis = System.currentTimeMillis();
                        synchronized (this) {
/* 130 */                   O00lOo o00lOo2 = this.I00000oIO;
/* 135 */                   I0o0iioo0IO i0o0iioo0IO = new I0o0iioo0IO(6);
/* 138 */                   i0o0iioo0IO.I00iiI = jCurrentTimeMillis;
/* 140 */                   VarHandle.storeStoreFence();
/* 143 */                   o00lOo2.I00000oIO(i0o0iioo0IO);
                        }
/* 148 */               return arrayList;
                    } catch (Throwable th) {
/* 245 */               throw th;
                    }
/* 148 */           return arrayList;
                }

                public final synchronized boolean I0000oI00(long j) {
/* 1 */             OOI0IO111Ii oOI0IO111Ii = I00000oOI;
                    synchronized (this) {
/* 4 */                 O00lOo o00lOo = this.I00000oIO;
/* 12 */                o00lOo.getClass();
/* 19 */                IOoil1iiIilo iOoil1iiIilo = null;
/* 20 */                IiI110i1O iiI110i1O = new IiI110i1O(o00lOo, oOI0IO111Ii, -1L, iOoil1iiIilo, 17);
/* 23 */                Il00o11 il00o11 = Il00o11.I00iOIl;
/* 47 */                if (I00000oOI(((Long) iOi1IOoIO0l.I00000oIO(il00o11, iiI110i1O)).longValue()).equals(I00000oOI(j))) {
/* 50 */                    return false;
                        }
/* 52 */                O00lOo o00lOo2 = this.I00000oIO;
/* 54 */                Long lValueOf = Long.valueOf(j);
/* 58 */                o00lOo2.getClass();
/* 75 */                return true;
                    }
                }

                public final synchronized void I0001Ioi1lo(long j, String str) {
/* 2 */             String strI00000oOI = I00000oOI(j);
/* 8 */             OOI0IO111Ii oOI0IO111Ii = new OOI0IO111Ii(str);
/* 11 */            O00lOo o00lOo = this.I00000oIO;
/* 17 */            I0O1IO i0o1io = new I0O1IO(10);
/* 20 */            i0o1io.I00iiI = this;
/* 22 */            i0o1io.I00iiO = strI00000oOI;
/* 24 */            i0o1io.I00iio = str;
/* 26 */            i0o1io.I00ilI0I1 = oOI0IO111Ii;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            o00lOo.I00000oIO(i0o1io);
                }
            }
