            package p000;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class ll00I0ii {
                public static void I00000oIO(String str, int i, List list) {
/* 5 */             if (list.size() == i) {
/* 7 */                 return;
                    }
/* 98 */            throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
                }

                public static void I00000oOI(String str, int i, List list) {
/* 5 */             if (list.size() >= i) {
/* 7 */                 return;
                    }
/* 98 */            throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
                }

                public static void I0000Il00O(String str, int i, ArrayList arrayList) {
/* 5 */             if (arrayList.size() <= i) {
/* 7 */                 return;
                    }
/* 98 */            throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
                }

                public static boolean I0000O(iO0iIIoO11 io0iiioo11) {
/* 2 */             if (io0iiioo11 == null) {
/* 1 */                 return false;
                    }
/* 5 */             Double dZzd = io0iiioo11.zzd();
                    return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
                }

                public static ii1il1Il I0000oI00(String str) throws NumberFormatException {
                    ii1il1Il ii1il1il;
/* 2 */             if (str == null || str.isEmpty()) {
/* 27 */                ii1il1il = null;
                    } else {
/* 24 */                ii1il1il = (ii1il1Il) ii1il1Il.I01I0Iioooo0.get(Integer.valueOf(Integer.parseInt(str)));
                    }
/* 28 */            if (ii1il1il != null) {
/* 30 */                return ii1il1il;
                    }
/* 37 */            I000II.I000iOII(IIl001iO0Io.I000o00OoI0I("Unsupported commandId ", str));
/* 1 */             return null;
                }

                public static boolean I0001Ioi1lo(iO0iIIoO11 io0iiioo11, iO0iIIoO11 io0iiioo112) {
/* 14 */            if (!io0iiioo11.getClass().equals(io0iiioo112.getClass())) {
/* 13 */                return false;
                    }
/* 20 */            if ((io0iiioo11 instanceof iOOl1i1) || (io0iiioo11 instanceof iIo00lo)) {
/* 19 */                return true;
                    }
/* 29 */            if (!(io0iiioo11 instanceof iII01l)) {
                        return io0iiioo11 instanceof iOO00I0O ? io0iiioo11.zzc().equals(io0iiioo112.zzc()) : io0iiioo11 instanceof iI0io0OI1IOo ? io0iiioo11.zze().equals(io0iiioo112.zze()) : io0iiioo11 == io0iiioo112;
                    }
/* 43 */            if (Double.isNaN(io0iiioo11.zzd().doubleValue()) || Double.isNaN(io0iiioo112.zzd().doubleValue())) {
/* 13 */                return false;
                    }
/* 68 */            return io0iiioo11.zzd().equals(io0iiioo112.zzd());
                }

                public static int I000II(double d) {
/* 5 */             if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
/* 41 */                return 0;
                    }
/* 39 */            return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
                }

                public static double I000O01llI0(double d) {
/* 7 */             if (Double.isNaN(d)) {
/* 5 */                 return 0.0d;
                    }
/* 14 */            if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
/* 77 */                return d;
                    }
/* 37 */            return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
                }

                public static Object I000OOo1O(iO0iIIoO11 io0iiioo11) {
/* 7 */             if (iO0iIIoO11.I00OloOo.equals(io0iiioo11)) {
/* 9 */                 return null;
                    }
/* 17 */            if (iO0iIIoO11.I00Ol1ll1.equals(io0iiioo11)) {
/* 19 */                return "";
                    }
/* 24 */            if (io0iiioo11 instanceof iIlIIIl11I1I) {
/* 28 */                return I000OiO((iIlIIIl11I1I) io0iiioo11);
                    }
/* 35 */            if (!(io0iiioo11 instanceof i1ollIol0I0)) {
                        return !io0iiioo11.zzd().isNaN() ? io0iiioo11.zzd() : io0iiioo11.zzc();
                    }
/* 39 */            ArrayList arrayList = new ArrayList();
/* 44 */            Iterator it = ((i1ollIol0I0) io0iiioo11).iterator();
                    while (true) {
/* 49 */                iO1iOoi1O io1iooi1o = (iO1iOoi1O) it;
/* 55 */                if (!io1iooi1o.hasNext()) {
/* 73 */                    return arrayList;
                        }
/* 63 */                Object objI000OOo1O = I000OOo1O((iO0iIIoO11) io1iooi1o.next());
/* 67 */                if (objI000OOo1O != null) {
/* 69 */                    arrayList.add(objI000OOo1O);
                        }
                    }
                }

                public static HashMap I000OiO(iIlIIIl11I1I iiliiil11i1i) {
/* 3 */             HashMap map = new HashMap();
/* 17 */            Iterator it = new ArrayList(iiliiil11i1i.I00iOIl.keySet()).iterator();
/* 25 */            while (it.hasNext()) {
/* 31 */                String str = (String) it.next();
/* 37 */                Object objI000OOo1O = I000OOo1O(iiliiil11i1i.I0000O(str));
/* 41 */                if (objI000OOo1O != null) {
/* 43 */                    map.put(str, objI000OOo1O);
                        }
                    }
/* 77 */            return map;
                }

                public static void I000iOII(OillOo0 oillOo0) {
/* 18 */            int iI000II = I000II(oillOo0.I00IlilI0i0i("runtime.counter").zzd().doubleValue() + 1.0d);
/* 25 */            if (iI000II <= 1000000) {
/* 37 */                oillOo0.I00IO1oi11O("runtime.counter", new iII01l(Double.valueOf(iI000II)));
                    } else {
/* 43 */                I000II.I001IO000("Instructions allowed exceeded");
                    }
                }
            }
