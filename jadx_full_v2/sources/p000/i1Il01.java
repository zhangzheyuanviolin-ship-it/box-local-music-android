            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import android.text.TextUtils;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayDeque;
            import java.util.Arrays;
            import java.util.Iterator;
            
/* 38 */    public final class i1Il01 implements l0ioi11I1, i1li10loi, ioIli1, lIoio0O1ioo, lo11I0lO, I1OlOl11O0, i1olliOl {
                public final int I00iOIl;
                public Object I00iiI;

                public i1Il01(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public Iterator I00000oIO(I0oO0iO1l0lo i0oO0iO1l0lo, String str) {
/* 4 */             return new o0Iil1O(this, i0oO0iO1l0lo, str, 0);
                }

                public void I00000oOI(String str, String str2, Bundle bundle) {
                    switch (this.I00iOIl) {
                        case 7:
/* 59 */                    boolean zIsEmpty = TextUtils.isEmpty(str);
/* 65 */                    lIl1O1li lil1o1li = (lIl1O1li) this.I00iiI;
/* 67 */                    if (!zIsEmpty) {
/* 79 */                        I000II.I001IO000("Unexpected call on client side");
                                break;
                            } else {
/* 73 */                        lil1o1li.I010ioo("auto", "_err", bundle);
                                break;
                            }
                        default:
/* 6 */                     boolean zIsEmpty2 = TextUtils.isEmpty(str);
/* 12 */                    lilOOl0 lilool0 = (lilOOl0) this.I00iiI;
/* 14 */                    if (!zIsEmpty2) {
/* 33 */                        l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 41 */                        IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(18);
/* 44 */                        iO0iIlI1li.I00iiI = str;
/* 46 */                        iO0iIlI1li.I00iiO = str2;
/* 48 */                        iO0iIlI1li.I00iio = bundle;
/* 50 */                        iO0iIlI1li.I00ilI0I1 = this;
/* 52 */                        VarHandle.storeStoreFence();
/* 55 */                        l0o10ooo0I00iOIl.I010o0o0oO(iO0iIlI1li);
                                break;
                            } else {
/* 16 */                        l0olllO1i l0olllo1i = lilool0.I00ll1;
/* 18 */                        if (l0olllo1i != null) {
/* 20 */                            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 22 */                            l0olllO1i.I000II(l01o0io1ooo0);
/* 29 */                            l01o0io1ooo0.I00ilO0.I0000Il00O("AppId not known when logging event", str2);
                                    break;
                                }
                            }
                            break;
                    }
                }

                public void I0000Il00O(ii01lO0l11ii ii01lo0l11ii) {
/* 3 */             ArrayDeque arrayDeque = (ArrayDeque) this.I00iiI;
/* 9 */             if (!ii01lo0l11ii.I000iOII()) {
/* 161 */               if (!(ii01lo0l11ii instanceof ii0oOlo)) {
/* 190 */                   I000II.I000iOII("Has a new type of ByteString been created? Found ".concat(String.valueOf(ii01lo0l11ii.getClass())));
/* 437 */                   return;
                        }
/* 163 */               ii0oOlo ii0oolo = (ii0oOlo) ii01lo0l11ii;
/* 167 */               I0000Il00O(ii0oolo.I00iio);
/* 172 */               I0000Il00O(ii0oolo.I00ilI0I1);
/* 175 */               return;
                    }
/* 17 */            int iBinarySearch = Arrays.binarySearch(ii0oOlo.I00ioIO, ii01lo0l11ii.I0001Ioi1lo());
/* 21 */            if (iBinarySearch < 0) {
                        iBinarySearch = (-(iBinarySearch + 1)) - 1;
                    }
/* 30 */            int iI001IO000 = ii0oOlo.I001IO000(iBinarySearch + 1);
/* 38 */            if (arrayDeque.isEmpty() || ((ii01lO0l11ii) arrayDeque.peek()).I0001Ioi1lo() >= iI001IO000) {
/* 155 */               arrayDeque.push(ii01lo0l11ii);
/* 158 */               return;
                    }
/* 53 */            int iI001IO0002 = ii0oOlo.I001IO000(iBinarySearch);
/* 61 */            ii01lO0l11ii ii0oolo2 = (ii01lO0l11ii) arrayDeque.pop();
/* 67 */            while (!arrayDeque.isEmpty() && ((ii01lO0l11ii) arrayDeque.peek()).I0001Ioi1lo() < iI001IO0002) {
/* 89 */                ii0oolo2 = new ii0oOlo((ii01lO0l11ii) arrayDeque.pop(), ii0oolo2);
                    }
/* 96 */            ii0oOlo ii0oolo3 = new ii0oOlo(ii0oolo2, ii01lo0l11ii);
/* 103 */           while (!arrayDeque.isEmpty()) {
/* 109 */               int iBinarySearch2 = Arrays.binarySearch(ii0oOlo.I00ioIO, ii0oolo3.I00iiO);
/* 113 */               if (iBinarySearch2 < 0) {
                            iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                        }
/* 136 */               if (((ii01lO0l11ii) arrayDeque.peek()).I0001Ioi1lo() >= ii0oOlo.I001IO000(iBinarySearch2 + 1)) {
                            break;
                        } else {
/* 146 */                   ii0oolo3 = new ii0oOlo((ii01lO0l11ii) arrayDeque.pop(), ii0oolo3);
                        }
                    }
/* 151 */           arrayDeque.push(ii0oolo3);
                }

                public void I0000O(iOlOi1iIii ioloi1iiii, iOIo11i ioio11i) {
                    String strI00000oIO;
/* 3 */             o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 6 */             long j = ioloi1iiii.I00000oOI;
/* 12 */            if (j == 0) {
/* 148 */               IOOlIIilOl0.I000iOII();
/* 332 */               return;
                    }
/* 14 */            long j2 = ioloi1iiii.I0000Il00O;
/* 18 */            if (j2 == 0) {
/* 144 */               IOOlIIilOl0.I000iOII();
/* 147 */               return;
                    }
/* 27 */            Long lValueOf = Long.valueOf(Long.MAX_VALUE & (j2 - j));
/* 35 */            lIil0l010OO liil0l010ooI000l1 = ((lIO0IIo) ioloi1iiii.I0000O).I000l1();
/* 43 */            lIil0l010OO liil0l010ooI000l12 = ((lIO0IIo) ioloi1iiii.I0000oI00).I000l1();
/* 51 */            lIil0l010OO liil0l010ooI000l13 = ((lIO0IIo) ioloi1iiii.I0001Ioi1lo).I000l1();
/* 57 */            iI1li01iIO01 ii1li01iio01 = new iI1li01iIO01();
/* 60 */            ii1li01iio01.I00000oIO = lValueOf;
/* 62 */            ii1li01iio01.I00000oOI = liil0l010ooI000l13;
/* 64 */            ii1li01iio01.I0000Il00O = liil0l010ooI000l12;
/* 66 */            ii1li01iio01.I0000O = liil0l010ooI000l1;
/* 68 */            VarHandle.storeStoreFence();
/* 71 */            o01l1iooo0.I00iio = ii1li01iio01;
/* 77 */            OoIol00Ool ooIol00Ool = new OoIol00Ool(9);
/* 85 */            ooIol00Ool.I00iiO = new OOoo1il();
/* 87 */            ooIol00Ool.I00iiI = o01l1iooo0;
/* 89 */            iOloo0O0O.I000l1();
/* 92 */            VarHandle.storeStoreFence();
/* 97 */            iOllO10O iollo10o = (iOllO10O) this.I00iiI;
/* 99 */            o0IiOl o0iiol = iollo10o.I0000oI00;
/* 105 */           if (o0iiol.I000OOo1O()) {
/* 111 */               strI00000oIO = (String) o0iiol.I000II();
                    } else {
/* 118 */               strI00000oIO = O0oO1lOOo1.I0000Il00O.I00000oIO(iollo10o.I000II);
                    }
/* 125 */           IO0iIlI1li iO0iIlI1li = new IO0iIlI1li(5);
/* 128 */           iO0iIlI1li.I00iiI = iollo10o;
/* 130 */           iO0iIlI1li.I00iiO = ooIol00Ool;
/* 132 */           iO0iIlI1li.I00iio = ioio11i;
/* 134 */           iO0iIlI1li.I00ilI0I1 = strI00000oIO;
/* 136 */           VarHandle.storeStoreFence();
/* 140 */           io1OllI.I00000oIO(1, iO0iIlI1li);
                }

                @Override
                public ListenableFuture call() {
                    I011IO1I11OI i011io1i11oiI00000oOI;
/* 3 */             IIlOoolol0ll iIlOoolol0ll = (IIlOoolol0ll) this.I00iiI;
/* 7 */             OilOi0I1 oilOi0I1 = (OilOi0I1) iIlOoolol0ll.I00ilI0I1;
                    try {
/* 23 */                return IlloOoiiO.I0000Il00O(iIlOoolol0ll.I001IIilI0O((Uri) IlloOoiiO.I00000oIO((ListenableFuture) iIlOoolol0ll.I00iiO)));
                    } catch (IOException e) {
/* 31 */                OOI1o1oII0 oOI1o1oII0 = (OOI1o1oII0) iIlOoolol0ll.I00io1l;
/* 33 */                oOI1o1oII0.getClass();
/* 38 */                if ((e instanceof lo0oIOOIIoIo) || (e.getCause() instanceof lo0oIOOIIoIo)) {
/* 143 */                   return IlloOoiiO.I00000oOI(e);
                        }
/* 51 */                o00o0o1 o00o0o1Var = (o00o0o1) oOI1o1oII0.I00iOIl;
/* 53 */                o00o0o1Var.getClass();
/* 62 */                if (e.getCause() instanceof iI00lI) {
/* 71 */                    Ioil1OOO ioil1OOOI0000Il00O = IlloOoiiO.I0000Il00O(o00o0o1Var.I00000oIO);
/* 78 */                    lolliO01l lollio01l = new lolliO01l(2);
/* 81 */                    lollio01l.I00000oOI = iIlOoolol0ll;
/* 83 */                    VarHandle.storeStoreFence();
/* 90 */                    I01i1oI i01i1oII00100l0 = I01iIIO.I00100l0(ioil1OOOI0000Il00O, o0iOII1liI.I00000oOI(lollio01l), oilOi0I1);
/* 97 */                    liOOloi0I liooloi0i = new liOOloi0I(5);
/* 100 */                   liooloi0i.I00000oOI = e;
/* 102 */                   VarHandle.storeStoreFence();
/* 105 */                   int i = I00ll1.I00ll1;
/* 111 */                   I00l0OO0IO i00l0OO0IO = new I00l0OO0IO(i01i1oII00100l0, IOException.class, liooloi0i);
/* 120 */                   i01i1oII00100l0.addListener(i00l0OO0IO, l1i0oIO0.I00000oOI(Iii11Ooi.I00iOIl, i00l0OO0IO));
                            i011io1i11oiI00000oOI = i00l0OO0IO;
                        } else {
/* 64 */                    i011io1i11oiI00000oOI = IlloOoiiO.I00000oOI(e);
                        }
/* 126 */               lolliO01l lollio01l2 = new lolliO01l(1);
/* 129 */               lollio01l2.I00000oOI = iIlOoolol0ll;
/* 131 */               VarHandle.storeStoreFence();
/* 138 */               return I01iIIO.I00100l0(i011io1i11oiI00000oOI, o0iOII1liI.I00000oOI(lollio01l2), oilOi0I1);
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case 0:
/* 120 */                   return ((OoIOil1iIO) this.I00iiI).I00000oIO("FIREBASE_ML_SDK", Il0IIil.I00000oIO("proto"), new o0iOli(17));
                        default:
/* 8 */                     Constructor constructor = (Constructor) this.I00iiI;
                            try {
/* 15 */                        return constructor.newInstance(null);
                            } catch (IllegalAccessException e) {
/* 21 */                        ll1I00l ll1i00l = o01l0i.I00000oIO;
/* 25 */                        OIiilo1Ool0o.I000iOII("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
/* 14 */                        return null;
                            } catch (InstantiationException e2) {
/* 69 */                        String strI0000O = o01l0i.I0000O(constructor);
/* 81 */                        StringBuilder sb = new StringBuilder(strI0000O.length() + 44);
/* 84 */                        sb.append("Failed to invoke constructor '");
/* 87 */                        sb.append(strI0000O);
/* 90 */                        sb.append("' with no args");
/* 100 */                       throw new RuntimeException(sb.toString(), e2);
                            } catch (InvocationTargetException e3) {
/* 30 */                        String strI0000O2 = o01l0i.I0000O(constructor);
/* 42 */                        StringBuilder sb2 = new StringBuilder(strI0000O2.length() + 44);
/* 45 */                        sb2.append("Failed to invoke constructor '");
/* 48 */                        sb2.append(strI0000O2);
/* 51 */                        sb2.append("' with no args");
/* 62 */                        OIiilo1Ool0o.I000iOII(sb2.toString(), e3.getCause());
/* 14 */                        return null;
                            }
                    }
                }

                @Override
                public i1oI1I00i0 zzb(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 9 */                 i1li10loi i1li10loiVar = ((i1li10loi[]) this.I00iiI)[i];
/* 15 */                if (i1li10loiVar.zzc(cls)) {
/* 17 */                    return i1li10loiVar.zzb(cls);
                        }
                    }
/* 35 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
/* 38 */            return null;
                }

                @Override
                public boolean zzc(Class cls) {
                    switch (this.I00iOIl) {
                        case 1:
/* 52 */                    for (int i = 0; i < 2; i++) {
/* 64 */                        if (((i1li10loi[]) this.I00iiI)[i].zzc(cls)) {
                                    break;
                                }
                            }
                            break;
                        case 5:
/* 31 */                    for (int i2 = 0; i2 < 2; i2++) {
/* 43 */                        if (((ioIli1[]) this.I00iiI)[i2].mo34zzc(cls)) {
                                    break;
                                }
                            }
                            break;
                        default:
/* 10 */                    for (int i3 = 0; i3 < 2; i3++) {
/* 22 */                        if (((lIoio0O1ioo[]) this.I00iiI)[i3].zzc(cls)) {
                                    break;
                                }
                            }
                            break;
                    }
/* 5 */             return true;
                }

                @Override
/* 39 */        public ioilo0olI0lI mo38zzb(Class cls) {
                    for (int i = 0; i < 2; i++) {
                        ioIli1 ioili1 = ((ioIli1[]) this.I00iiI)[i];
/* 40 */                if (ioili1.mo34zzc(cls)) {
/* 41 */                    return ioili1.mo38zzb(cls);
                        }
                    }
/* 42 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
                    return null;
                }

                @Override
/* 42 */        public lO1i1o0O0o mo39zzb(Class cls) {
                    for (int i = 0; i < 2; i++) {
                        lIoio0O1ioo lioio0o1ioo = ((lIoio0O1ioo[]) this.I00iiI)[i];
/* 43 */                if (lioio0o1ioo.zzc(cls)) {
/* 44 */                    return lioio0o1ioo.mo39zzb(cls);
                        }
                    }
/* 45 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
                    return null;
                }
            }
