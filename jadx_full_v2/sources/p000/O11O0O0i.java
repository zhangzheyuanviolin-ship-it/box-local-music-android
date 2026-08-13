            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.speech.tts.TextToSpeech;
            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.ListIterator;
            import kotlin.jvm.functions.Function1;
            
            public final class O11O0O0i implements IllOOo00lI {
                public Function1 I00iOIl;
                public O1oIOiI11o0 I00iiI;
                public boolean I00iiO;
                public StringBuilder I00iio;
                public O11iO00I1o I00ilI0I1;
                public OI10i0Il I00ilO0;
                public Ii0110 I00io1l;
                public TextToSpeech I00ioIO;
                public IllOOo00lI I00l0I0l0lO1;
                public OI10i0Il I00l0OO0IO;
                public OI10i0Il I00li1OI;
                public Function1 I00ll1;

                /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    IO1iI1i iO1iI1i;
                    IO1OO01i0 iO1OO01i0;
                    Object objPrevious;
/* 1 */             Function1 function1 = this.I00iOIl;
/* 3 */             O1oIOiI11o0 o1oIOiI11o0 = this.I00iiI;
/* 5 */             boolean z = this.I00iiO;
/* 7 */             StringBuilder sb = this.I00iio;
/* 9 */             O11iO00I1o o11iO00I1o = this.I00ilI0I1;
/* 11 */            OI10i0Il oI10i0Il = this.I00ilO0;
/* 13 */            Ii0110 ii0110 = this.I00io1l;
/* 15 */            TextToSpeech textToSpeech = this.I00ioIO;
/* 17 */            IllOOo00lI illOOo00lI = this.I00l0I0l0lO1;
/* 19 */            OI10i0Il oI10i0Il2 = this.I00l0OO0IO;
/* 21 */            OI10i0Il oI10i0Il3 = this.I00li1OI;
/* 23 */            Function1 function12 = this.I00ll1;
/* 25 */            function1.invoke(o1oIOiI11o0);
/* 33 */            I0O1OI i0o1oi = new I0O1OI(9);
/* 36 */            i0o1oi.I00iiI = illOOo00lI;
/* 38 */            VarHandle.storeStoreFence();
/* 41 */            if (z && O11Oio.I0000Il00O(oI10i0Il2)) {
/* 53 */                String strI0000oI00 = O11Oio.I0000oI00(sb.toString());
/* 58 */                sb.setLength(0);
/* 67 */                Handler handler = new Handler(Looper.getMainLooper());
/* 73 */                Iio1010 iio1010 = new Iio1010(1);
/* 76 */                iio1010.I00iiI = strI0000oI00;
/* 78 */                iio1010.I00iiO = textToSpeech;
/* 80 */                iio1010.I00iio = oI10i0Il;
/* 82 */                iio1010.I00ilI0I1 = ii0110;
/* 84 */                iio1010.I00ilO0 = oI10i0Il3;
/* 86 */                iio1010.I00io1l = i0o1oi;
/* 88 */                VarHandle.storeStoreFence();
/* 91 */                handler.post(iio1010);
                    } else if (O11Oio.I0000Il00O(oI10i0Il2)) {
/* 121 */               List list = (List) ((IO1looOIi) o11iO00I1o.I0000Il00O.I00iOIl.getValue()).I0000O.get(o1oIOiI11o0.I00000oIO);
/* 123 */               if (list != null) {
/* 129 */                   ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
/* 137 */                       if (!listIterator.hasPrevious()) {
/* 159 */                           objPrevious = null;
                                    break;
                                }
/* 139 */                       objPrevious = listIterator.previous();
/* 144 */                       IO1OO01i0 iO1OO01i02 = (IO1OO01i0) objPrevious;
/* 148 */                       if ((iO1OO01i02 instanceof IO1iI1i) && ((IO1iI1i) iO1OO01i02).I000O01llI0 == IO1loo.I00iiI) {
                                    break;
                                }
                            }
/* 160 */                   iO1OO01i0 = (IO1OO01i0) objPrevious;
                        } else {
/* 163 */                   iO1OO01i0 = null;
                        }
/* 171 */               iO1iI1i = iO1OO01i0 instanceof IO1iI1i ? (IO1iI1i) iO1OO01i0 : null;
/* 172 */               if (iO1iI1i != null) {
/* 176 */                   function12.invoke(iO1iI1i.I000II);
                        }
/* 185 */               if (O11Oio.I00000oOI(oI10i0Il3)) {
                        }
                    } else {
/* 180 */               iO1iI1i = null;
/* 185 */               if (O11Oio.I00000oOI(oI10i0Il3)) {
/* 187 */                   if (iO1iI1i != null) {
/* 193 */                       O010OIi o010OIi = (O010OIi) oI10i0Il.getValue();
/* 195 */                       if (o010OIi != null) {
/* 197 */                           o010OIi.I000II(null);
                                }
/* 200 */                       IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 216 */                       oI10i0Il.setValue(iOi1II01i0.I0000O(ii0110, O1OI1l011OO1.I00000oIO, null, new O11Oi0ioo0I(textToSpeech, i0o1oi, oI10i0Il, oI10i0Il3, null, 1), 2));
                            } else {
/* 220 */                       textToSpeech.stop();
/* 229 */                       Handler handler2 = new Handler(Looper.getMainLooper());
/* 236 */                       I0100i i0100i = new I0100i(27);
/* 239 */                       i0100i.I00iiI = i0o1oi;
/* 241 */                       VarHandle.storeStoreFence();
/* 244 */                       handler2.post(i0100i);
                            }
                        }
                    }
/* 247 */           return OoiIlOl1iI.I00000oIO;
                }
            }
