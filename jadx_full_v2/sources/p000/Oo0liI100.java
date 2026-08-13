            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class Oo0liI100 implements Function1 {
                public final int I00iOIl;
                public Oo0ll0I1OO00 I00iiI;

                /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    IiIooOOOI iiIooOOOI;
                    Oo0iil0o0oI oo0iil0o0oI;
/* 3 */             int i = this.I00iOIl;
/* 5 */             Oo0iil0o0oI oo0iil0o0oI2 = null;
/* 8 */             Oo0ll0I1OO00 oo0ll0I1OO00 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 169 */                   List list = (List) obj;
/* 171 */                   OIoiOoo0 oIoiOoo0I010l1O = oo0ll0I1OO00.I010l1O();
/* 175 */                   Oo0lloOiiIOI oo0lloOiiIOI = oo0ll0I1OO00.I00o0l1o1o0;
/* 177 */                   IOOioI10Il1 iOOioI10Il1 = oo0ll0I1OO00.I00oOio10iI1;
/* 202 */                   Oo0lloOiiIOI oo0lloOiiIOII000II = Oo0lloOiiIOI.I000II(oo0lloOiiIOI, iOOioI10Il1 != null ? iOOioI10Il1.I00000oIO() : IOOiio0i.I000o00OoI0I, 0L, null, null, null, 0L, 0, 0L, 16777214);
/* 206 */                   O0iOOoiioO o0iOOoiioO = oIoiOoo0I010l1O.I000oI1ioi;
/* 208 */                   if (o0iOOoiioO != null && (iiIooOOOI = oIoiOoo0I010l1O.I000OOo1O) != null) {
/* 222 */                       I1111OO10i i1111OO10i = new I1111OO10i(oIoiOoo0I010l1O.I00000oIO);
/* 227 */                       if (oIoiOoo0I010l1O.I000OiO == null || oIoiOoo0I010l1O.I000o00OoI0I == null) {
/* 210 */                           oo0iil0o0oI = null;
                                } else {
/* 242 */                           long j = oIoiOoo0I010l1O.I00100l0 & (-8589934589L);
/* 248 */                           int i2 = oIoiOoo0I010l1O.I0001Ioi1lo;
/* 250 */                           boolean z = oIoiOoo0I010l1O.I0000oI00;
/* 252 */                           int i3 = oIoiOoo0I010l1O.I0000O;
/* 254 */                           IliO0o11i01 iliO0o11i01 = oIoiOoo0I010l1O.I0000Il00O;
/* 256 */                           Il01100l il01100l = Il01100l.I00iOIl;
/* 313 */                           oo0iil0o0oI = new Oo0iil0o0oI(new Oo0iiO1(i1111OO10i, oo0lloOiiIOII000II, il01100l, i2, z, i3, iiIooOOOI, o0iOOoiioO, iliO0o11i01, j), new OI0OIIiOi(new I1ii1o0(i1111OO10i, iiIooOOOI, iliO0o11i01, oo0lloOiiIOII000II, il01100l, z), j, oIoiOoo0I010l1O.I0001Ioi1lo, oIoiOoo0I010l1O.I0000O), oIoiOoo0I010l1O.I000l1);
                                }
                            }
/* 316 */                   if (oo0iil0o0oI != null) {
/* 318 */                       list.add(oo0iil0o0oI);
/* 321 */                       oo0iil0o0oI2 = oo0iil0o0oI;
                            }
/* 326 */                   return Boolean.valueOf(oo0iil0o0oI2 != null);
                        case 1:
/* 47 */                    String str = ((I1111OO10i) obj).I00iiI;
/* 49 */                    Oo0lioo oo0lioo = oo0ll0I1OO00.I00oliIiO01i;
/* 51 */                    if (oo0lioo == null) {
/* 109 */                       String str2 = oo0ll0I1OO00.I00o0iI0io1;
/* 111 */                       Oo0lioo oo0lioo2 = new Oo0lioo();
/* 114 */                       oo0lioo2.I00000oIO = str2;
/* 116 */                       oo0lioo2.I00000oOI = str;
/* 118 */                       oo0lioo2.I0000Il00O = false;
/* 120 */                       oo0lioo2.I0000O = null;
/* 122 */                       VarHandle.storeStoreFence();
/* 139 */                       OIoiOoo0 oIoiOoo0 = new OIoiOoo0(str, oo0ll0I1OO00.I00o0l1o1o0, oo0ll0I1OO00.I00o101lO, oo0ll0I1OO00.I00oI0i, oo0ll0I1OO00.I00oII, oo0ll0I1OO00.I00oIiI10, oo0ll0I1OO00.I00oO101o);
/* 148 */                       oIoiOoo0.I0000O(oo0ll0I1OO00.I010l1O().I000OOo1O);
/* 151 */                       oo0lioo2.I0000O = oIoiOoo0;
/* 153 */                       oo0ll0I1OO00.I00oliIiO01i = oo0lioo2;
                            } else if (!O0000Ioio00.I0000O(str, oo0lioo.I00000oOI)) {
/* 62 */                        oo0lioo.I00000oOI = str;
/* 64 */                        OIoiOoo0 oIoiOoo02 = oo0lioo.I0000O;
/* 66 */                        if (oIoiOoo02 != null) {
/* 68 */                            Oo0lloOiiIOI oo0lloOiiIOI2 = oo0ll0I1OO00.I00o0l1o1o0;
/* 70 */                            IliO0o11i01 iliO0o11i012 = oo0ll0I1OO00.I00o101lO;
/* 72 */                            int i4 = oo0ll0I1OO00.I00oI0i;
/* 74 */                            boolean z2 = oo0ll0I1OO00.I00oII;
/* 76 */                            int i5 = oo0ll0I1OO00.I00oIiI10;
/* 78 */                            int i6 = oo0ll0I1OO00.I00oO101o;
/* 80 */                            oIoiOoo02.I00000oIO = str;
/* 82 */                            oIoiOoo02.I00000oOI = oo0lloOiiIOI2;
/* 84 */                            oIoiOoo02.I0000Il00O = iliO0o11i012;
/* 86 */                            oIoiOoo02.I0000O = i4;
/* 88 */                            oIoiOoo02.I0000oI00 = z2;
/* 90 */                            oIoiOoo02.I0001Ioi1lo = i5;
/* 92 */                            oIoiOoo02.I000II = i6;
/* 101 */                           oIoiOoo02.I0010o = (oIoiOoo02.I0010o << 2) | 2;
/* 103 */                           oIoiOoo02.I0000Il00O();
                                }
                            }
/* 155 */                   lO1OiIiIo0oi.I00000oOI(oo0ll0I1OO00);
/* 158 */                   l0o11Oi.I00000oOI(oo0ll0I1OO00);
/* 161 */                   il1ollIO0I.I00000oIO(oo0ll0I1OO00);
/* 164 */                   return Boolean.TRUE;
                        default:
/* 17 */                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 21 */                    Oo0lioo oo0lioo3 = oo0ll0I1OO00.I00oliIiO01i;
/* 23 */                    if (oo0lioo3 == null) {
/* 25 */                        z = false;
                            } else {
/* 27 */                        oo0lioo3.I0000Il00O = zBooleanValue;
/* 29 */                        lO1OiIiIo0oi.I00000oOI(oo0ll0I1OO00);
/* 32 */                        l0o11Oi.I00000oOI(oo0ll0I1OO00);
/* 35 */                        il1ollIO0I.I00000oIO(oo0ll0I1OO00);
                            }
/* 38 */                    return Boolean.valueOf(z);
                    }
                }
            }
