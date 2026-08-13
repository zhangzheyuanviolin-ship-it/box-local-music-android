            package p000;

            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.StandardCharsets;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            import java.util.function.Function;
            
/* 12 */    public class l1IllOOOo1 implements l01lllOO0 {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public l1IllOOOo1(String str, Function function, Function function2) {
/* 2 */             this.I00iOIl = 1;
/* 7 */             this.I00iiI = str;
/* 9 */             this.I00iiO = function;
/* 11 */            this.I00iio = function2;
                }

                public void I00000oIO(String str, float f) {
/* 1 */             String strValueOf = String.valueOf(f);
/* 7 */             loO1OOo0oI loo1ooo0oi = new loO1OOo0oI();
/* 14 */            ((l1Il1IliOI1l) this.I00iio).I00iiO = loo1ooo0oi;
/* 16 */            this.I00iio = loo1ooo0oi;
/* 18 */            loo1ooo0oi.I00iiI = strValueOf;
/* 20 */            loo1ooo0oi.I00iOIl = str;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0019, B:19:0x0065, B:22:0x0089, B:13:0x002a, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x0019 }] */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0019, B:19:0x0065, B:22:0x0089, B:13:0x002a, B:15:0x0052, B:17:0x005d, B:18:0x0061), top: B:27:0x0019 }] */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
                /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00000oOI(String str, int i, Throwable th, byte[] bArr, Map map) {
/* 3 */             liloI0Io liloi0io = (liloI0Io) this.I00iiO;
/* 7 */             lilOOl0 lilool0 = (lilOOl0) this.I00iio;
/* 11 */            String str2 = (String) this.I00iiI;
/* 17 */            lilool0.I00iOIl().I010II();
/* 20 */            lilool0.I00iIi0i1o();
/* 24 */            if (bArr == null) {
                        try {
/* 26 */                    bArr = new byte[0];
                        } catch (Throwable th2) {
/* 164 */                   lilool0.I00oO101o = false;
/* 166 */                   lilool0.I00Io1o110i();
/* 399 */                   throw th2;
                        }
                    }
/* 34 */            if (i != 200) {
/* 38 */                if (i == 204) {
/* 40 */                    i = 204;
/* 41 */                    if (th != null) {
                            }
                        }
/* 106 */               String str3 = new String(bArr, StandardCharsets.UTF_8);
/* 119 */               ?? Substring = str3.substring(0, Math.min(32, str3.length()));
/* 127 */               IOloiOI1 iOloiOI1 = lilool0.I00II0oii1o().I00li1OI;
/* 131 */               Integer numValueOf = Integer.valueOf(i);
/* 135 */               if (th == null) {
                        }
/* 138 */               iOloiOI1.I0000oI00("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, th);
/* 141 */               iOl1lOo1IO iol1loo1io = lilool0.I00iiO;
/* 143 */               lilOOl0.I00O0o1oo(iol1loo1io);
/* 152 */               iol1loo1io.I01101olii(Long.valueOf(liloi0io.I00000oIO));
/* 155 */               lilool0.I00Io1lO();
                    } else if (th != null) {
/* 43 */                iOl1lOo1IO iol1loo1io2 = lilool0.I00iiO;
/* 45 */                lilOOl0.I00O0o1oo(iol1loo1io2);
/* 54 */                iol1loo1io2.I010l1ol111(Long.valueOf(liloi0io.I00000oIO));
/* 69 */                lilool0.I00II0oii1o().I00lll10.I0000O(str2, "Successfully uploaded batch from upload queue. appId, status", Integer.valueOf(i));
/* 72 */                l0I1IOo l0i1ioo = lilool0.I00iiI;
/* 74 */                lilOOl0.I00O0o1oo(l0i1ioo);
/* 81 */                if (l0i1ioo.I010ioo()) {
/* 83 */                    iOl1lOo1IO iol1loo1io3 = lilool0.I00iiO;
/* 85 */                    lilOOl0.I00O0o1oo(iol1loo1io3);
/* 92 */                    if (iol1loo1io3.I010l1O(str2)) {
/* 94 */                        lilool0.I000oI1ioi(str2);
                            } else {
/* 98 */                        lilool0.I00Io1lO();
                            }
                        }
                    } else {
/* 106 */               String str32 = new String(bArr, StandardCharsets.UTF_8);
/* 119 */               ?? Substring2 = str32.substring(0, Math.min(32, str32.length()));
/* 127 */               IOloiOI1 iOloiOI12 = lilool0.I00II0oii1o().I00li1OI;
/* 131 */               Integer numValueOf2 = Integer.valueOf(i);
/* 135 */               if (th == null) {
/* 137 */                   th = Substring2;
                        }
/* 138 */               iOloiOI12.I0000oI00("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, th);
/* 141 */               iOl1lOo1IO iol1loo1io4 = lilool0.I00iiO;
/* 143 */               lilOOl0.I00O0o1oo(iol1loo1io4);
/* 152 */               iol1loo1io4.I01101olii(Long.valueOf(liloi0io.I00000oIO));
/* 155 */               lilool0.I00Io1lO();
                    }
/* 158 */           lilool0.I00oO101o = false;
/* 160 */           lilool0.I00Io1o110i();
                }

                /* JADX WARN: Removed duplicated region for block: B:57:? A[LOOP:1: B:25:0x0080->B:57:?, LOOP_END, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I0000Il00O(i1lIIl01O i1liil01o, Set set, String str) {
                    liIIiioIOII[] liiiiioioiiArr;
/* 7 */             if (!set.isEmpty() && !((AtomicBoolean) this.I00iiI).getAndSet(true)) {
/* 21 */                if (iiOlilo0IIIl.I00iiI == null) {
                            synchronized (iiOlilo0IIIl.class) {
                                try {
/* 28 */                            if (iiOlilo0IIIl.I00iiI == null) {
/* 32 */                                iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 40 */                                iiolilo0iiil.I00iOIl = new CopyOnWriteArrayList();
/* 42 */                                VarHandle.storeStoreFence();
/* 45 */                                iiOlilo0IIIl.I00iiI = iiolilo0iiil;
                                    }
                                } finally {
                                }
                            }
                        }
/* 67 */                ((CopyOnWriteArrayList) iiOlilo0IIIl.I00iiI.I00iOIl).add(0, new IIIOlol(27));
                    }
/* 70 */            byte[] bArrI000oI1ioi = i1liil01o.I000oI1ioi();
/* 76 */            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.I00iiO;
/* 80 */            li1oOIillol1 li1ooiillol1 = new li1oOIillol1();
/* 83 */            li1ooiillol1.I00000oIO = bArrI000oI1ioi;
/* 85 */            VarHandle.storeStoreFence();
/* 88 */            concurrentHashMap.compute(str, li1ooiillol1);
/* 91 */            Iterator it = set.iterator();
/* 99 */            while (it.hasNext()) {
/* 125 */               AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.I00iio).putIfAbsent((String) it.next(), new AtomicReference(new liIIiioIOII(str, bArrI000oI1ioi)));
/* 127 */               if (atomicReference != null) {
                            while (true) {
/* 129 */                       Object obj = atomicReference.get();
/* 135 */                       if (obj instanceof liIIiioIOII) {
/* 138 */                           liIIiioIOII liiiiioioii = (liIIiioIOII) obj;
/* 146 */                           if (str.equals(liiiiioioii.I00iOIl)) {
/* 148 */                               liiiiioioii.I00000oIO(bArrI000oI1ioi);
                                        break;
                                    }
/* 154 */                           liIIiioIOII liiiiioioii2 = new liIIiioIOII(str, bArrI000oI1ioi);
/* 173 */                           liiiiioioiiArr = str.compareTo(liiiiioioii.I00iOIl) < 0 ? new liIIiioIOII[]{liiiiioioii2, liiiiioioii} : new liIIiioIOII[]{liiiiioioii, liiiiioioii2};
/* 232 */                           if (!atomicReference.compareAndSet(obj, liiiiioioiiArr)) {
                                        break;
                                    }
                                } else {
/* 181 */                           liIIiioIOII[] liiiiioioiiArr2 = (liIIiioIOII[]) obj;
/* 183 */                           int iBinarySearch = Arrays.binarySearch(liiiiioioiiArr2, str);
/* 187 */                           if (iBinarySearch >= 0) {
/* 191 */                               liiiiioioiiArr2[iBinarySearch].I00000oIO(bArrI000oI1ioi);
                                        break;
                                    }
/* 195 */                           int i = ~iBinarySearch;
/* 196 */                           int length = liiiiioioiiArr2.length;
/* 197 */                           int i2 = length + 1;
/* 199 */                           int i3 = length - i;
/* 200 */                           if (i3 == 0) {
/* 206 */                               liiiiioioiiArr = (liIIiioIOII[]) Arrays.copyOf(liiiiioioiiArr2, i2);
                                    } else {
/* 210 */                               liIIiioIOII[] liiiiioioiiArr3 = new liIIiioIOII[i2];
/* 212 */                               System.arraycopy(liiiiioioiiArr2, 0, liiiiioioiiArr3, 0, i);
/* 217 */                               System.arraycopy(liiiiioioiiArr2, i, liiiiioioiiArr3, i + 1, i3);
/* 220 */                               liiiiioioiiArr = liiiiioioiiArr3;
                                    }
/* 226 */                           liiiiioioiiArr[i] = new liIIiioIOII(str, bArrI000oI1ioi);
/* 232 */                           if (!atomicReference.compareAndSet(obj, liiiiioioiiArr)) {
                                    }
                                }
                            }
                        }
                    }
                }

                public byte[] I0000O(o01Io111 o01io111) {
                    l1IIo10o11 l1iio10o11;
                    OIOi0lOI oIOi0lOI;
/* 3 */             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 10 */                HashMap map = (HashMap) this.I00iiI;
/* 14 */                HashMap map2 = (HashMap) this.I00iiO;
/* 18 */                l0iO10io0IOO l0io10io0ioo = (l0iO10io0IOO) this.I00iio;
/* 20 */                l1iio10o11 = new l1IIo10o11();
/* 27 */                OOiI1O oOiI1O = new OOiI1O(13);
/* 31 */                oOiI1O.I00000oOI = false;
/* 33 */                oOiI1O.I0000Il00O = false;
/* 35 */                oOiI1O.I0000oI00 = l1iio10o11;
/* 37 */                VarHandle.storeStoreFence();
/* 40 */                l1iio10o11.I0000oI00 = oOiI1O;
/* 42 */                l1iio10o11.I00000oIO = byteArrayOutputStream;
/* 44 */                l1iio10o11.I00000oOI = map;
/* 46 */                l1iio10o11.I0000Il00O = map2;
/* 48 */                l1iio10o11.I0000O = l0io10io0ioo;
/* 50 */                VarHandle.storeStoreFence();
/* 59 */                oIOi0lOI = (OIOi0lOI) map.get(o01Io111.class);
                    } catch (IOException unused) {
                    }
/* 61 */            if (oIOi0lOI == null) {
/* 82 */                throw new Il0IO001iOOo("No encoder for ".concat(String.valueOf(o01Io111.class)));
                    }
/* 63 */            oIOi0lOI.encode(o01io111, l1iio10o11);
/* 83 */            return byteArrayOutputStream.toByteArray();
                }

                public void I0000oI00(int i, String str) {
                    switch (this.I00iOIl) {
                        case 2:
/* 28 */                    String strValueOf = String.valueOf(i);
/* 34 */                    lIIoi0I liioi0i = new lIIoi0I();
/* 41 */                    ((l1Il1IliOI1l) this.I00iio).I00iiO = liioi0i;
/* 43 */                    this.I00iio = liioi0i;
/* 45 */                    liioi0i.I00iiI = strValueOf;
/* 47 */                    liioi0i.I00iOIl = str;
                            break;
                        default:
/* 6 */                     String strValueOf2 = String.valueOf(i);
/* 12 */                    loO1OOo0oI loo1ooo0oi = new loO1OOo0oI();
/* 19 */                    ((l1Il1IliOI1l) this.I00iio).I00iiO = loo1ooo0oi;
/* 21 */                    this.I00iio = loo1ooo0oi;
/* 23 */                    loo1ooo0oi.I00iiI = strValueOf2;
/* 25 */                    loo1ooo0oi.I00iOIl = str;
                            break;
                    }
                }

                public void I0001Ioi1lo(String str, Object obj) {
/* 3 */             l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l();
/* 10 */            ((l1Il1IliOI1l) this.I00iio).I00iiO = l1il1ilioi1l;
/* 12 */            this.I00iio = l1il1ilioi1l;
/* 14 */            l1il1ilioi1l.I00iiI = obj;
/* 16 */            l1il1ilioi1l.I00iOIl = str;
                }

                public lOli1l I000II() {
/* 3 */             lOli1l loli1l = new lOli1l();
/* 10 */            loli1l.I00000oIO = (llOo1oi1) this.I00iiI;
/* 16 */            loli1l.I00000oOI = (lOl1ol1OOO) this.I00iiO;
/* 20 */            loli1l.I0000Il00O = lOl0iO0O0i0.TYPE_THICK;
/* 26 */            loli1l.I0000O = (lO1o1OIl) this.I00iio;
/* 28 */            VarHandle.storeStoreFence();
/* 55 */            return loli1l;
                }

                public String toString() {
/* 10 */            String str = "";
                    switch (this.I00iOIl) {
                        case 2:
/* 115 */                   StringBuilder sb = new StringBuilder(32);
/* 122 */                   sb.append((String) this.I00iiI);
/* 125 */                   sb.append('{');
/* 134 */                   l1Il1IliOI1l l1il1ilioi1l = (l1Il1IliOI1l) ((l1Il1IliOI1l) this.I00iiO).I00iiO;
/* 136 */                   while (l1il1ilioi1l != null) {
/* 138 */                       Object obj = l1il1ilioi1l.I00iiI;
/* 140 */                       sb.append(str);
/* 145 */                       String str2 = (String) l1il1ilioi1l.I00iOIl;
/* 147 */                       if (str2 != null) {
/* 149 */                           sb.append(str2);
/* 152 */                           sb.append('=');
                                }
/* 155 */                       if (obj == null || !obj.getClass().isArray()) {
/* 185 */                           sb.append(obj);
                                } else {
/* 181 */                           sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r5.length() - 1);
                                }
/* 190 */                       l1il1ilioi1l = (l1Il1IliOI1l) l1il1ilioi1l.I00iiO;
/* 5 */                         str = ", ";
                            }
/* 194 */                   sb.append('}');
/* 197 */                   return sb.toString();
                        case 8:
/* 26 */                    StringBuilder sb2 = new StringBuilder(32);
/* 33 */                    sb2.append((String) this.I00iiI);
/* 36 */                    sb2.append('{');
/* 45 */                    l1Il1IliOI1l l1il1ilioi1l2 = (l1Il1IliOI1l) ((l1Il1IliOI1l) this.I00iiO).I00iiO;
/* 47 */                    while (l1il1ilioi1l2 != null) {
/* 49 */                        Object obj2 = l1il1ilioi1l2.I00iiI;
/* 51 */                        sb2.append(str);
/* 56 */                        String str3 = (String) l1il1ilioi1l2.I00iOIl;
/* 58 */                        if (str3 != null) {
/* 60 */                            sb2.append(str3);
/* 63 */                            sb2.append('=');
                                }
/* 66 */                        if (obj2 == null || !obj2.getClass().isArray()) {
/* 96 */                            sb2.append(obj2);
                                } else {
/* 92 */                            sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r5.length() - 1);
                                }
/* 101 */                       l1il1ilioi1l2 = (l1Il1IliOI1l) l1il1ilioi1l2.I00iiO;
/* 5 */                         str = ", ";
                            }
/* 105 */                   sb2.append('}');
/* 108 */                   return sb2.toString();
                        default:
/* 19 */                    return super.toString();
                    }
                }

/* 13 */        public l1IllOOOo1(int i) {
/* 14 */            this.I00iOIl = i;
                }
            }
