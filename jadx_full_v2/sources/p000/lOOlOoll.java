            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.os.Bundle;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.security.Provider;
            import java.security.Signature;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 161 */   public final class lOOlOoll implements Il0lOIl1, IOllol1io, IlOOi0, IIO1Ol0OIO10, Il0OlI, OliOio1iiOI, Ii00l0i1loO, iiIi1oo0Io, iliIOlooOio, IioIOllO1, OoI0o0oiol0l {
                public static lOOlOoll I00iiI;
                public static lOOlOoll I00l0OO0IO;
                public final int I00iOIl;
                public static final lOOlOoll I00iiO = new lOOlOoll(1);
                public static final lOOlOoll I00iio = new lOOlOoll(2);
                public static final lOOlOoll I00ilI0I1 = new lOOlOoll(3);
                public static final lOOlOoll I00ilO0 = new lOOlOoll(4);
                public static final lOOlOoll I00io1l = new lOOlOoll(5);
                public static final lOOlOoll I00ioIO = new lOOlOoll(6);
                public static final lOOlOoll I00l0I0l0lO1 = new lOOlOoll(7);
                public static final lOOlOoll I00li1OI = new lOOlOoll(18);
                public static final lOOlOoll I00ll1 = new lOOlOoll(20);
                public static final lOOlOoll I00lli11 = new lOOlOoll(22);
                public static final lOOlOoll I00lll10 = new lOOlOoll(23);
                public static final lOOlOoll I00o0iI0io1 = new lOOlOoll(24);
                public static final lOOlOoll I00o0l1o1o0 = new lOOlOoll(25);

                public lOOlOoll(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static synchronized void I0000O() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new lOOlOoll(0);
                    }
                }

                @Override
                public byte[] I00000oIO(byte[] bArr, int i, int i2) {
/* 1 */             byte[] bArr2 = new byte[i2];
/* 4 */             System.arraycopy(bArr, i, bArr2, 0, i2);
/* 98 */            return bArr2;
                }

                @Override
                public float I00000oOI() {
/* 1 */             return 0.0f;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0083 -> B:25:0x0066). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0086 -> B:25:0x0066). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I0000Il00O(List list, Ii1Ii1l0OI ii1Ii1l0OI, IOoilo iOoilo) throws Throwable {
                    Ii11lI1O ii11lI1O;
                    List list2;
                    Iterator it;
                    OOo0ooi oOo0ooi;
                    Throwable th;
/* 3 */             if (iOoilo instanceof Ii11lI1O) {
/* 6 */                 ii11lI1O = (Ii11lI1O) iOoilo;
/* 8 */                 int i = ii11lI1O.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii11lI1O.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii11lI1O = new Ii11lI1O(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ii11lI1O.I00iiO;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = ii11lI1O.I00ilI0I1;
/* 34 */            if (i2 == 0) {
/* 66 */                lIoii1l01l0i.I00000oOI(obj);
/* 71 */                ArrayList arrayList = new ArrayList();
/* 76 */                I10i01i0Iilo i10i01i0Iilo = new I10i01i0Iilo(list, arrayList, (IOoil1iiIilo) null);
/* 79 */                ii11lI1O.I00iOIl = arrayList;
/* 81 */                ii11lI1O.I00ilI0I1 = 1;
/* 87 */                if (ii1Ii1l0OI.I00000oIO(i10i01i0Iilo, ii11lI1O) != obj2) {
/* 90 */                    list2 = arrayList;
                        }
/* 127 */               return obj2;
                    }
/* 36 */            if (i2 != 1) {
/* 38 */                if (i2 != 2) {
/* 54 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 40 */                it = ii11lI1O.I00iiI;
/* 44 */                oOo0ooi = (OOo0ooi) ii11lI1O.I00iOIl;
                        try {
/* 46 */                    lIoii1l01l0i.I00000oOI(obj);
                        } catch (Throwable th2) {
/* 128 */                   Object obj3 = oOo0ooi.I00iOIl;
/* 130 */                   if (obj3 == null) {
/* 132 */                       oOo0ooi.I00iOIl = th2;
                            } else {
/* 137 */                       ilIilolOlIoO.I00000oIO((Throwable) obj3, th2);
                            }
                        }
/* 107 */               while (it.hasNext()) {
/* 113 */                   Function1 function1 = (Function1) it.next();
/* 115 */                   ii11lI1O.I00iOIl = oOo0ooi;
/* 117 */                   ii11lI1O.I00iiI = it;
/* 119 */                   ii11lI1O.I00ilI0I1 = 2;
/* 125 */                   if (function1.invoke(ii11lI1O) == obj2) {
/* 127 */                       return obj2;
                            }
                        }
/* 143 */               th = (Throwable) oOo0ooi.I00iOIl;
/* 145 */               if (th != null) {
/* 147 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 408 */               throw th;
                    }
/* 60 */            list2 = (List) ii11lI1O.I00iOIl;
/* 62 */            lIoii1l01l0i.I00000oOI(obj);
/* 93 */            OOo0ooi oOo0ooi2 = new OOo0ooi();
/* 98 */            it = list2.iterator();
/* 102 */           oOo0ooi = oOo0ooi2;
/* 107 */           while (it.hasNext()) {
                    }
/* 143 */           th = (Throwable) oOo0ooi.I00iOIl;
/* 145 */           if (th != null) {
                    }
                }

                @Override
                public Object I0000oI00(String str, Provider provider) {
                    return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
                }

                @Override
                public Boolean I0001Ioi1lo() {
/* 1 */             return null;
                }

                @Override
                public IioIO1i I000OOo1O(Context context, String str, IioI1o1 iioI1o1) {
                    int iI0000Il00O;
/* 3 */             IioIO1i iioIO1i = new IioIO1i();
/* 6 */             int iI0000O = iioI1o1.I0000O(context, str);
/* 10 */            iioIO1i.I00000oOI = iI0000O;
/* 12 */            int i = 1;
/* 13 */            int i2 = 0;
/* 14 */            if (iI0000O != 0) {
/* 16 */                iI0000Il00O = iioI1o1.I0000Il00O(context, str, false);
/* 20 */                iioIO1i.I0000Il00O = iI0000Il00O;
                    } else {
/* 23 */                iI0000Il00O = iioI1o1.I0000Il00O(context, str, true);
/* 27 */                iioIO1i.I0000Il00O = iI0000Il00O;
                    }
/* 29 */            int i3 = iioIO1i.I00000oOI;
/* 31 */            if (i3 == 0) {
/* 33 */                if (iI0000Il00O == 0) {
/* 35 */                    i = 0;
                        }
/* 41 */                iioIO1i.I0000O = i;
/* 98 */                return iioIO1i;
                    }
/* 37 */            i2 = i3;
/* 38 */            if (i2 >= iI0000Il00O) {
/* 40 */                i = -1;
                    }
/* 41 */            iioIO1i.I0000O = i;
/* 98 */            return iioIO1i;
                }

                @Override
                public float I000o00OoI0I(float f, long j) {
/* 1 */             return 0.0f;
                }

                @Override
                public float I000oI1ioi(float f, float f2, long j) {
/* 1 */             return 0.0f;
                }

                @Override
                public long I001IIilI0O(float f) {
/* 1 */             return 0L;
                }

                @Override
                public float I001lllioOl(float f, float f2) {
/* 1 */             return 0.0f;
                }

                @Override
                public Object apply(Object obj) {
/* 1 */             return (byte[]) obj;
                }

                @Override
                public void configure(Il0IIIOll il0IIIOll) {
/* 5 */             il0IIIOll.registerEncoder(lOli1l.class, l0I10o1o0iIo.I00000oIO);
/* 12 */            il0IIIOll.registerEncoder(llOo1oi1.class, lIIO1iO.I00000oIO);
/* 19 */            il0IIIOll.registerEncoder(lOlilO1lOIO.class, l0Ii11Ii0OoI.I00000oIO);
/* 26 */            il0IIIOll.registerEncoder(lOo0l0li.class, l0Io1oI100O.I00000oIO);
/* 33 */            il0IIIOll.registerEncoder(lOlo100OII.class, l0IlOoo.I00000oIO);
/* 40 */            il0IIIOll.registerEncoder(lOo00Oll0i1O.class, l0O011O0o00.I00000oIO);
/* 47 */            il0IIIOll.registerEncoder(lIooiiooO.class, ioiI10o10l.I00000oIO);
/* 54 */            il0IIIOll.registerEncoder(lIolIIooo0.class, ioi0oI1lI1l.I00000oIO);
/* 61 */            il0IIIOll.registerEncoder(lOOiIi110l.class, l00lio0o.I00000oIO);
/* 68 */            il0IIIOll.registerEncoder(llI11OIo.class, lI00lIIoO1I.I00000oIO);
/* 75 */            il0IIIOll.registerEncoder(lIoiio1iOI0.class, ioi0Il0l.I00000oIO);
/* 82 */            il0IIIOll.registerEncoder(lIoi0i1oii1.class, ioOo0ol.I00000oIO);
/* 89 */            il0IIIOll.registerEncoder(liOl1l1.class, l1110Ii1.I00000oIO);
/* 96 */            il0IIIOll.registerEncoder(lloI1oOollOo.class, iool1I.I00000oIO);
/* 103 */           il0IIIOll.registerEncoder(lOO0loOII.class, l0010lO.I00000oIO);
/* 110 */           il0IIIOll.registerEncoder(lOIloi0Ol.class, iooi0o1io.I00000oIO);
/* 117 */           il0IIIOll.registerEncoder(liOoIli11o01.class, l11111II.I00000oIO);
/* 124 */           il0IIIOll.registerEncoder(ll1o0Oiili.class, l1oi1o00II.I00000oIO);
/* 131 */           il0IIIOll.registerEncoder(ll1ol1OO.class, l1ol1i00.I00000oIO);
/* 138 */           il0IIIOll.registerEncoder(ll1ll111OoI.class, l1oIOOO.I00000oIO);
/* 145 */           il0IIIOll.registerEncoder(lOoiI0.class, l0OooOo10.I00000oIO);
/* 152 */           il0IIIOll.registerEncoder(llo1i11o101.class, io11OO1.I00000oIO);
/* 159 */           il0IIIOll.registerEncoder(lOol1oi11I.class, l0i00iiOIlii.I00000oIO);
/* 166 */           il0IIIOll.registerEncoder(lil1Iiilo1l.class, l1IIIiO.I00000oIO);
/* 173 */           il0IIIOll.registerEncoder(lilOo1.class, l1IlooO0ii00.I00000oIO);
/* 180 */           il0IIIOll.registerEncoder(lilIoil.class, l1Il1o01ol1.I00000oIO);
/* 187 */           il0IIIOll.registerEncoder(lilI0O1.class, l1Ii0IIo0Oio.I00000oIO);
/* 194 */           il0IIIOll.registerEncoder(liol1il0i.class, l1i1li0.I00000oIO);
/* 201 */           il0IIIOll.registerEncoder(lioo0oIOI.class, l1i1li011i1.I00000oIO);
/* 208 */           il0IIIOll.registerEncoder(ll00O010oO.class, l1iOOo0.I00000oIO);
/* 215 */           il0IIIOll.registerEncoder(liooi1Oi1.class, l1iOO1iO.I00000oIO);
/* 222 */           il0IIIOll.registerEncoder(lOoO00.class, l0Olll0.I00000oIO);
/* 229 */           il0IIIOll.registerEncoder(ll011oI.class, l1ilii0looio.I00000oIO);
/* 236 */           il0IIIOll.registerEncoder(ll01ooOiil.class, l1ililliO10.I00000oIO);
/* 243 */           il0IIIOll.registerEncoder(ll0IioI0.class, l1l0l0l01oOo.I00000oIO);
/* 250 */           il0IIIOll.registerEncoder(ll0OlOllOl.class, l1l0lO.I00000oIO);
/* 257 */           il0IIIOll.registerEncoder(ll101il.class, l1lOO00.I00000oIO);
/* 264 */           il0IIIOll.registerEncoder(ll0o0IiI.class, l1ll0o.I00000oIO);
/* 271 */           il0IIIOll.registerEncoder(lioiOiO.class, l1OiOI0.I00000oIO);
/* 278 */           il0IIIOll.registerEncoder(lOi1lO0O100l.class, l011o0OI.I00000oIO);
/* 285 */           il0IIIOll.registerEncoder(lioI0OiO.class, l1Oo10i.I00000oIO);
/* 292 */           il0IIIOll.registerEncoder(lio1IIoIi.class, l1Oo01i1Ol.I00000oIO);
/* 299 */           il0IIIOll.registerEncoder(lioi0i1II.class, l1i0oIl10l0.I00000oIO);
/* 306 */           il0IIIOll.registerEncoder(llI01Ili1Ol.class, lI000l.I00000oIO);
/* 313 */           il0IIIOll.registerEncoder(llil0iI.class, lIOIll1oI1.I00000oIO);
/* 320 */           il0IIIOll.registerEncoder(lIiool1i00.class, io1oI00.I00000oIO);
/* 327 */           il0IIIOll.registerEncoder(lIil0I0il.class, io1i00.I00000oIO);
/* 334 */           il0IIIOll.registerEncoder(lIii0llo1lo.class, io1IOoo01.I00000oIO);
/* 341 */           il0IIIOll.registerEncoder(lIilli1IoOII.class, io1l11llI01I.I00000oIO);
/* 348 */           il0IIIOll.registerEncoder(lIl1l1IolOi.class, ioII1li1oOi.I00000oIO);
/* 355 */           il0IIIOll.registerEncoder(lIl0oooi.class, ioI0Ol000o0.I00000oIO);
/* 362 */           il0IIIOll.registerEncoder(lIlIilIioI.class, ioIi11i0I.I00000oIO);
/* 369 */           il0IIIOll.registerEncoder(lIli1I1Io1I.class, ioIiOllool10.I00000oIO);
/* 376 */           il0IIIOll.registerEncoder(lIll1Iio01.class, ioIlo1I.I00000oIO);
/* 383 */           il0IIIOll.registerEncoder(lIlo0lli01.class, ioIolOiIO.I00000oIO);
/* 390 */           il0IIIOll.registerEncoder(lIo0011lo.class, ioO0iO.I00000oIO);
/* 397 */           il0IIIOll.registerEncoder(ilI0IIll1l.class, io0OioooI11o.I00000oIO);
/* 404 */           il0IIIOll.registerEncoder(ilI1olO1ol.class, io0ilI0Ool0.I00000oIO);
/* 411 */           il0IIIOll.registerEncoder(ilI0oI1OO.class, io0il10I.I00000oIO);
/* 418 */           il0IIIOll.registerEncoder(lOOoOlo1ili.class, l010Ii.I00000oIO);
/* 425 */           il0IIIOll.registerEncoder(lO00Ilo.class, ioiO1O.I00000oIO);
/* 432 */           il0IIIOll.registerEncoder(iiOolOooOi.class, ilIOIIioo.I00000oIO);
/* 439 */           il0IIIOll.registerEncoder(iiOl0IlIlll.class, ilIOol0OO11.I00000oIO);
/* 446 */           il0IIIOll.registerEncoder(lO1OIil0o0oo.class, iooIOoIi0Oi.I00000oIO);
/* 453 */           il0IIIOll.registerEncoder(iiiO1IOliI0.class, ilIiool.I00000oIO);
/* 460 */           il0IIIOll.registerEncoder(iii1OiiIi.class, ilIlo1.I00000oIO);
/* 467 */           il0IIIOll.registerEncoder(iio1Oo0ol.class, ili0oiOOlO.I00000oIO);
/* 474 */           il0IIIOll.registerEncoder(iio0lIO.class, ili1iIo11ll.I00000oIO);
/* 481 */           il0IIIOll.registerEncoder(iiioOl1O.class, ilIoll0.I00000oIO);
/* 488 */           il0IIIOll.registerEncoder(iiiilOoi.class, ilIooo.I00000oIO);
/* 495 */           il0IIIOll.registerEncoder(iioloI1O1i.class, ill1OOIOO0I1.I00000oIO);
/* 502 */           il0IIIOll.registerEncoder(iiollilo0IO1.class, illI10l1l010.I00000oIO);
/* 509 */           il0IIIOll.registerEncoder(IO0ooOiO0OOo.class, illlI1i1III.I00000oIO);
/* 516 */           il0IIIOll.registerEncoder(il01lilooO.class, illo1lI1Ol.I00000oIO);
/* 523 */           il0IIIOll.registerEncoder(il1ol10O11.class, io00O1oOOl.I00000oIO);
/* 530 */           il0IIIOll.registerEncoder(il1l0lOoO.class, io0IOliIOO.I00000oIO);
/* 537 */           il0IIIOll.registerEncoder(il0l1o1l.class, ilo00o11l.I00000oIO);
/* 544 */           il0IIIOll.registerEncoder(il0ilIoI.class, ilo0li1.I00000oIO);
/* 551 */           il0IIIOll.registerEncoder(il0oI1oIi.class, ilo1l1iI1Io.I00000oIO);
/* 558 */           il0IIIOll.registerEncoder(il0lI1i1olii.class, iloIOo.I00000oIO);
/* 565 */           il0IIIOll.registerEncoder(lllio00lo0i.class, lI0OioII.I00000oIO);
/* 572 */           il0IIIOll.registerEncoder(llilloI.class, ioiiOlII1lli.I00000oIO);
/* 579 */           il0IIIOll.registerEncoder(lllI1lo1.class, l0Oill1i.I00000oIO);
/* 586 */           il0IIIOll.registerEncoder(lll1Ol.class, l0OOlIo0OlIo.I00000oIO);
/* 593 */           il0IIIOll.registerEncoder(llioIlOO.class, ioooiiO1.I00000oIO);
/* 600 */           il0IIIOll.registerEncoder(llli0Oii10OI.class, lI0Ill10lo0o.I00000oIO);
/* 607 */           il0IIIOll.registerEncoder(lllO0oOi0il.class, lI01l1.I00000oIO);
/* 614 */           il0IIIOll.registerEncoder(llllo11IOl.class, lI0io1I0.I00000oIO);
/* 621 */           il0IIIOll.registerEncoder(lll01ooOO.class, l00oI1oI0Ol.I00000oIO);
/* 628 */           il0IIIOll.registerEncoder(llo0ll.class, lIOiOIo1OOi.I00000oIO);
/* 635 */           il0IIIOll.registerEncoder(llo010O0IIOl.class, lIi0I0l0.I00000oIO);
/* 642 */           il0IIIOll.registerEncoder(llloI1.class, lIOOioO.I00000oIO);
/* 649 */           il0IIIOll.registerEncoder(llIOiO1IO01I.class, lI0ooi11I.I00000oIO);
/* 656 */           il0IIIOll.registerEncoder(lOOliO.class, l00olO.I00000oIO);
/* 663 */           il0IIIOll.registerEncoder(lOiOOo1IOol0.class, l01OOII01.I00000oIO);
/* 670 */           il0IIIOll.registerEncoder(lIiO1o1Ol1l.class, io11l1I.I00000oIO);
/* 677 */           il0IIIOll.registerEncoder(lOO1IooOoOi.class, l00O00lOllIO.I00000oIO);
/* 684 */           il0IIIOll.registerEncoder(OlOoOOooiIll.class, l011iilo.I00000oIO);
/* 691 */           il0IIIOll.registerEncoder(lO1o1OIl.class, iooIlOO10O0o.I00000oIO);
/* 698 */           il0IIIOll.registerEncoder(lO0IioIooIl.class, ioiol0o0Oi1l.I00000oIO);
/* 705 */           il0IIIOll.registerEncoder(lO0OOOO0.class, iol1Ol0o0.I00000oIO);
/* 712 */           il0IIIOll.registerEncoder(lO01io.class, ioioI0oi1oii.I00000oIO);
/* 719 */           il0IIIOll.registerEncoder(lO0l01iI0i.class, iol1ii0l.I00000oIO);
/* 726 */           il0IIIOll.registerEncoder(lOoI1iI.class, l0OIiio.I00000oIO);
/* 733 */           il0IIIOll.registerEncoder(lOo1II10.class, l0O01l0lo0l.I00000oIO);
/* 740 */           il0IIIOll.registerEncoder(iiOiII0.class, ilII1oOIoO.I00000oIO);
/* 747 */           il0IIIOll.registerEncoder(lliO0oOO11.class, lIIo1OI1l.I00000oIO);
/* 754 */           il0IIIOll.registerEncoder(lliilI0.class, lIO1ilOO.I00000oIO);
/* 761 */           il0IIIOll.registerEncoder(llii01ll1lo.class, lIO0I1OoliO.I00000oIO);
/* 768 */           il0IIIOll.registerEncoder(lIiI0ioio1O.class, io0o1l011li.I00000oIO);
/* 775 */           il0IIIOll.registerEncoder(lIoO00iOo.class, ioOl0o.I00000oIO);
/* 782 */           il0IIIOll.registerEncoder(lIo1li.class, ioOOOlioIli.I00000oIO);
/* 789 */           il0IIIOll.registerEncoder(lIo0olIlI1i.class, ioOIIiOOI.I00000oIO);
/* 796 */           il0IIIOll.registerEncoder(liOIi1io0lo.class, l10liO1.I00000oIO);
/* 803 */           il0IIIOll.registerEncoder(liOiOioooO.class, l10oolli0oi.I00000oIO);
/* 810 */           il0IIIOll.registerEncoder(liOOlo0IiI.class, l10oOO.I00000oIO);
/* 817 */           il0IIIOll.registerEncoder(iio0IIOOIOI.class, ilOo1oO.I00000oIO);
/* 824 */           il0IIIOll.registerEncoder(iilooIoO0I.class, ili00iliOO01.I00000oIO);
/* 831 */           il0IIIOll.registerEncoder(lii0OIO1o0i0.class, l11O1O01I.I00000oIO);
/* 838 */           il0IIIOll.registerEncoder(liiOiioO.class, l11li1O001.I00000oIO);
/* 845 */           il0IIIOll.registerEncoder(lii1OoOo1l.class, l11i1OloIII.I00000oIO);
/* 852 */           il0IIIOll.registerEncoder(liiIi1O.class, l11li0l1oo.I00000oIO);
/* 859 */           il0IIIOll.registerEncoder(iioIlooliI.class, ilil0oo0iIIo.I00000oIO);
/* 866 */           il0IIIOll.registerEncoder(iioI1oI00I.class, ililo0o0o.I00000oIO);
/* 873 */           il0IIIOll.registerEncoder(llO0OOll1.class, lI1lOIII.I00000oIO);
/* 880 */           il0IIIOll.registerEncoder(llO00lI1i.class, lI1iolio0.I00000oIO);
/* 887 */           il0IIIOll.registerEncoder(lli0i1OIl.class, lIIi1oooIO1l.I00000oIO);
/* 894 */           il0IIIOll.registerEncoder(lliI0o.class, lIIl1I1oI1.I00000oIO);
/* 901 */           il0IIIOll.registerEncoder(liliO1oI111.class, l1IoilII1.I00000oIO);
/* 908 */           il0IIIOll.registerEncoder(lio0iilo.class, l1OOOIiI.I00000oIO);
/* 915 */           il0IIIOll.registerEncoder(lilll0.class, l1O100l011o.I00000oIO);
/* 922 */           il0IIIOll.registerEncoder(liloiIloi.class, l1OOII.I00000oIO);
/* 929 */           il0IIIOll.registerEncoder(lOOOI1oOi.class, l00il101I1l1.I00000oIO);
/* 936 */           il0IIIOll.registerEncoder(il01iOI.class, illIiO1O0O0.I00000oIO);
/* 943 */           il0IIIOll.registerEncoder(il00liooo.class, illi00i1I.I00000oIO);
/* 950 */           il0IIIOll.registerEncoder(lOOIoO11l1.class, l00O1I1lI0ol.I00000oIO);
/* 957 */           il0IIIOll.registerEncoder(lOIoiO.class, l000l110l.I00000oIO);
/* 964 */           il0IIIOll.registerEncoder(liiliO.class, l1I0lOOI1l0.I00000oIO);
/* 971 */           il0IIIOll.registerEncoder(lil0l1lIi1.class, l1I1iO.I00000oIO);
/* 978 */           il0IIIOll.registerEncoder(liioo01Ol.class, l1I1O11iO.I00000oIO);
/* 985 */           il0IIIOll.registerEncoder(iioillO0.class, ill01110.I00000oIO);
/* 992 */           il0IIIOll.registerEncoder(iioO10.class, ill0oOlIoO1.I00000oIO);
/* 999 */           il0IIIOll.registerEncoder(li1lOloO.class, l0o0ill1.I00000oIO);
/* 1006 */          il0IIIOll.registerEncoder(li1oO00l0.class, l0o1OO.I00000oIO);
/* 1013 */          il0IIIOll.registerEncoder(liI0loO0oi.class, l0oOOOOo1.I00000oIO);
/* 1020 */          il0IIIOll.registerEncoder(iilOOoi.class, ilOOi1IIIO.I00000oIO);
/* 1027 */          il0IIIOll.registerEncoder(iilIio.class, ilOi0lol1O0.I00000oIO);
/* 1034 */          il0IIIOll.registerEncoder(li1O0IIOo.class, l0lOI11lo.I00000oIO);
/* 1041 */          il0IIIOll.registerEncoder(li1OoIii00.class, l0li0I.I00000oIO);
/* 1048 */          il0IIIOll.registerEncoder(li1ilo1Oli.class, l0looI0iolO.I00000oIO);
/* 1055 */          il0IIIOll.registerEncoder(iilI1OO1.class, ilO1i0.I00000oIO);
/* 1062 */          il0IIIOll.registerEncoder(iilI1O0il0.class, ilOIiIl1I.I00000oIO);
/* 1069 */          il0IIIOll.registerEncoder(liIIO0.class, l0oiOIlI.I00000oIO);
/* 1076 */          il0IIIOll.registerEncoder(liIO11loi.class, l0ooIIOiiio.I00000oIO);
/* 1083 */          il0IIIOll.registerEncoder(liIiii1IO0.class, l0ooIoII01Io.I00000oIO);
/* 1090 */          il0IIIOll.registerEncoder(liIlIOI0OOI.class, l100loiO.I00000oIO);
/* 1097 */          il0IIIOll.registerEncoder(iiliio0o.class, ilOil0l.I00000oIO);
/* 1104 */          il0IIIOll.registerEncoder(iiliIooIliOo.class, ilOlIO.I00000oIO);
/* 1111 */          il0IIIOll.registerEncoder(llIl0I.class, lI1101OI0o.I00000oIO);
/* 1118 */          il0IIIOll.registerEncoder(llIiO0iI1o1i.class, lI1IOlo.I00000oIO);
/* 1125 */          il0IIIOll.registerEncoder(lOiOolo11l.class, l01i00o0O.I00000oIO);
/* 1132 */          il0IIIOll.registerEncoder(lOillIl0ll1.class, l0I01i.I00000oIO);
/* 1139 */          il0IIIOll.registerEncoder(lOiiOO.class, l01oiI1.I00000oIO);
/* 1146 */          il0IIIOll.registerEncoder(lOioiI.class, l0I0lO1l1.I00000oIO);
/* 1153 */          il0IIIOll.registerEncoder(ll110IIi0O.class, l1ll0o1.I00000oIO);
/* 1160 */          il0IIIOll.registerEncoder(ll11il.class, l1loiliolI1l.I00000oIO);
/* 1167 */          il0IIIOll.registerEncoder(il1Oll0Ii.class, ilol0oI10.I00000oIO);
/* 1174 */          il0IIIOll.registerEncoder(il1OI0o0Il10.class, ilolI0i.I00000oIO);
/* 1181 */          il0IIIOll.registerEncoder(llO1IlIIio.class, lI1o11Io.I00000oIO);
/* 1188 */          il0IIIOll.registerEncoder(ll0ii0IllI.class, l1lII0i.I00000oIO);
/* 1195 */          il0IIIOll.registerEncoder(ll0lIo.class, l1lIIO1.I00000oIO);
/* 1202 */          il0IIIOll.registerEncoder(il10lII0iIi.class, iloO0ll.I00000oIO);
/* 1209 */          il0IIIOll.registerEncoder(il101lI0looi.class, iloi1oooli.I00000oIO);
/* 1216 */          il0IIIOll.registerEncoder(llIo0oo0o.class, lI1OlIo.I00000oIO);
/* 1223 */          il0IIIOll.registerEncoder(li1IIilIo1.class, l0i11l.I00000oIO);
/* 1230 */          il0IIIOll.registerEncoder(li10oO000.class, l0lIIliiO1oO.I00000oIO);
/* 1237 */          il0IIIOll.registerEncoder(li0OiO0i.class, l0l0IIoOIO1.I00000oIO);
/* 1244 */          il0IIIOll.registerEncoder(li0IoO01I0l0.class, l0io0l0l.I00000oIO);
/* 1251 */          il0IIIOll.registerEncoder(OoliOIl1.class, l0l0O1Il1O.I00000oIO);
/* 1258 */          il0IIIOll.registerEncoder(li0oio00o1o.class, l0lII1.I00000oIO);
/* 1265 */          il0IIIOll.registerEncoder(li0I0lOII0o.class, l0iiIlo.I00000oIO);
/* 1272 */          il0IIIOll.registerEncoder(lOoo01O1loo0.class, l0i110.I00000oIO);
/* 1279 */          il0IIIOll.registerEncoder(li00o0iII1l.class, l0iiI1oI111.I00000oIO);
/* 1286 */          il0IIIOll.registerEncoder(li0011.class, l0iI1o.I00000oIO);
/* 1293 */          il0IIIOll.registerEncoder(liO0lioo.class, l10OOI.I00000oIO);
/* 1300 */          il0IIIOll.registerEncoder(lO11Io0ol.class, ioloOiO0.I00000oIO);
/* 1307 */          il0IIIOll.registerEncoder(liIoOlIoI1II.class, l101o1l0i.I00000oIO);
/* 1314 */          il0IIIOll.registerEncoder(liO1lOO1oIO.class, l10OOolIIio.I00000oIO);
/* 1321 */          il0IIIOll.registerEncoder(lO1010I.class, iollOOl10l.I00000oIO);
/* 1328 */          il0IIIOll.registerEncoder(lO1Iil00OO1o.class, ioo1IIi.I00000oIO);
/* 1335 */          il0IIIOll.registerEncoder(llIIiI.class, lI0loIOOoIo.I00000oIO);
/* 1342 */          il0IIIOll.registerEncoder(ll1Ilololl.class, l1o0OO01lO.I00000oIO);
/* 1349 */          il0IIIOll.registerEncoder(llOOO0OlO0I.class, lIIII1lIiI.I00000oIO);
/* 1356 */          il0IIIOll.registerEncoder(ll1l0Iil0.class, l1o1oilI.I00000oIO);
/* 1363 */          il0IIIOll.registerEncoder(ll1OoIO1I.class, l1o1OioI.I00000oIO);
/* 1370 */          il0IIIOll.registerEncoder(llO1li1ili1.class, lII0I1IOO0i.I00000oIO);
/* 1377 */          il0IIIOll.registerEncoder(il1l0i10o.class, iloloI011.I00000oIO);
/* 1384 */          il0IIIOll.registerEncoder(il1iiOiOlllo.class, iloooI1o.I00000oIO);
/* 1391 */          il0IIIOll.registerEncoder(llOIOoIOIIoI.class, lII1OI.I00000oIO);
/* 1398 */          il0IIIOll.registerEncoder(lO0o0ioo0.class, iollIoIOOI01.I00000oIO);
                }

                @Override
                public OloIIoII1oo then(Object obj) {
/* 1 */             Bundle bundle = (Bundle) obj;
/* 3 */             int i = OiI1lOO1O0i.I000O01llI0;
                    return (bundle == null || !bundle.containsKey("google.messenger")) ? lOio0o.I0000oI00(bundle) : lOio0o.I0000oI00(null);
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 15:
/* 11 */                    return "SharingStarted.Lazily";
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 128 */                   List list = iol1II1ii1i.I00000oIO;
/* 132 */                   iI1lO0li.I00iiI.get();
/* 158 */                   return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(69, 1000L, "measurement.upload.max_error_events_per_day").get()).longValue());
                        case PoseLandmark.LEFT_THUMB:
                        default:
/* 6 */                     List list2 = iol1II1ii1i.I00000oIO;
/* 10 */                    iIO0ooOool.I00iiI.get();
/* 27 */                    return (Boolean) iIO1lO.I00000oIO.I0010o(true, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", 4).get();
                        case PoseLandmark.RIGHT_THUMB:
/* 101 */                   List list3 = iol1II1ii1i.I00000oIO;
/* 105 */                   iI1lO0li.I00iiI.get();
/* 125 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(15, 605000L, "measurement.upload.google_signal_max_queue_time").get();
                        case PoseLandmark.LEFT_HIP:
/* 66 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 70 */                    iI1lO0li.I00iiI.get();
/* 96 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(26, 7L, "measurement.rb.attribution.client.min_ad_services_version").get()).longValue());
                        case PoseLandmark.RIGHT_HIP:
/* 30 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 34 */                    iI1lO0li.I00iiI.get();
/* 61 */                    return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue());
                    }
                }

                @Override
/* 162 */       public iOIIOoOoii zza() {
                    ComponentName componentName = il1OOI0.I00li1OI;
/* 163 */           return iOIIOoOoii.I00000oOI(6, "AICore service disconnected", null);
                }
            }
