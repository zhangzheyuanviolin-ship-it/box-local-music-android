            package p000;

            import android.content.Context;
            import android.os.Build;
            import android.os.Looper;
            import android.util.Size;
            import androidx.work.multiprocess.RemoteWorkManagerClient;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.UUID;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import kotlin.jvm.functions.Function3;
            
            public final class lolOiIoiillI implements IlOIOol, IOIoiiol, IOllol1io, Ii00l0i1loO, OOlo0i0, IliliOoOloi, OoI0o0oiol0l, iiIi1oo0Io, IOiOiIIiii1, OliiillO {
                public static lolOiIoiillI I00iiI;
                public static final lolOiIoiillI I00iiO = new lolOiIoiillI(1);
                public static final IIl11il0I0io I00iio = new IIl11il0I0io(11);
                public static final IOioOOi0I I00ilI0I1 = new IOioOOi0I(22);
                public static final IOioOOi0I I00ilO0 = new IOioOOi0I(23);
                public static final IOioOOi0I I00io1l = new IOioOOi0I(24);
                public static final IOioOOi0I I00ioIO = new IOioOOi0I(25);
                public static final IO1I11OO I00l0I0l0lO1 = new IO1I11OO(8);
                public static final lolOiIoiillI I00l0OO0IO = new lolOiIoiillI(2);
                public static final lolOiIoiillI I00li1OI = new lolOiIoiillI(3);
                public static final lolOiIoiillI I00ll1 = new lolOiIoiillI(4);
                public static final lolOiIoiillI I00lli11 = new lolOiIoiillI(5);
                public static final i00ol0OIIo I00lll10 = new i00ol0OIIo();
                public static final lolOiIoiillI I00o0iI0io1 = new lolOiIoiillI(7);
                public static final lolOiIoiillI I00o0l1o1o0 = new lolOiIoiillI(19);
                public static final lolOiIoiillI I00o101lO = new lolOiIoiillI(21);
                public static final lolOiIoiillI I00oI0i = new lolOiIoiillI(22);
                public static final lolOiIoiillI I00oII = new lolOiIoiillI(23);
                public static final lolOiIoiillI I00oIiI10 = new lolOiIoiillI(24);
                public static final lolOiIoiillI I00oO101o = new lolOiIoiillI(25);
                public static final lolOiIoiillI I00oOio10iI1 = new lolOiIoiillI(26);
                public final int I00iOIl;

                public lolOiIoiillI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static OIlI1io I0000Il00O(Size size, int i, String str, l1I0oI l1i0oi, OIlIOlIi oIlIOlIi, OIlII1I1 oIlII1I1, OIlIOo oIlIOo, OIlIOoOil oIlIOoOil, int i2) {
/* 3 */             l1I0oI l1i0oi2 = l1I0oI.I00ilO0;
/* 11 */            l1I0oI l1i0oi3 = (i2 & 8) != 0 ? l1i0oi2 : l1i0oi;
/* 20 */            OIlII1I1 oIlII1I12 = (i2 & 64) != 0 ? null : oIlII1I1;
/* 28 */            OIlIOo oIlIOo2 = (i2 & Barcode.FORMAT_ITF) != 0 ? null : oIlIOo;
/* 36 */            OIlIOoOil oIlIOoOil2 = (i2 & Barcode.FORMAT_QR_CODE) != 0 ? null : oIlIOoOil;
/* 38 */            l1I0oI l1i0oi4 = l1I0oI.I00ioIO;
/* 40 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 42 */            if (l1i0oi3 == l1i0oi4 || l1i0oi3 == l1I0oI.I00io1l || ((l1i0oi3 == l1I0oI.I00l0OO0IO || l1i0oi3 == l1I0oI.I00li1OI) && Build.VERSION.SDK_INT >= 35)) {
/* 92 */                OIlI1I oIlI1I = new OIlI1I(size, i, str, oIlIOlIi, oIlII1I12, oIlIOo2, oIlIOoOil2, il01100l);
/* 95 */                oIlI1I.I000OOo1O = l1i0oi3;
/* 97 */                VarHandle.storeStoreFence();
/* 1821 */              return oIlI1I;
                    }
/* 64 */            if (l1i0oi3 == l1i0oi2) {
/* 74 */                return new OIlI1IiOo0(size, i, str, oIlIOlIi, oIlII1I12, oIlIOo2, oIlIOoOil2, il01100l);
                    }
/* 80 */            I000II.I001IO000("Check failed.");
/* 15 */            return null;
                }

                public static void I0000O(List list, List list2) {
/* 5 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = list.iterator();
/* 16 */            while (it.hasNext()) {
/* 24 */                int iIntValue = ((Number) it.next()).intValue();
/* 29 */                List list3 = list2;
/* 39 */                ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list3, 10));
/* 42 */                Iterator it2 = list3.iterator();
/* 50 */                while (it2.hasNext()) {
/* 67 */                    arrayList2.add(new i010IoOillo(iIntValue, ((Number) it2.next()).intValue()));
                        }
/* 71 */                IOOii0O10Io0.I00100l0(arrayList, arrayList2);
                    }
/* 75 */            IOOi0Ool1i.I00iio(arrayList);
                }

                public static synchronized void I0000oI00() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new lolOiIoiillI(0);
                    }
                }

                public static final boolean I0001Ioi1lo() {
                    return Looper.myLooper() == Looper.getMainLooper();
                }

                @Override
                public ListenableFuture I00000oIO(Context context, UUID uuid, IliliOOliOi ililiOOliOi) {
/* 1 */             Oi00O10io oi00O10ioI00000oIO = Oi00O10io.I00000oIO(context);
/* 5 */             String string = uuid.toString();
/* 9 */             RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) oi00O10ioI00000oIO;
/* 15 */            IIlio101Io iIlio101Io = new IIlio101Io(22);
/* 18 */            iIlio101Io.I00iiI = string;
/* 20 */            iIlio101Io.I00iiO = ililiOOliOi;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            Oll0oO oll0oOI0000Il00O = remoteWorkManagerClient.I0000Il00O(iIlio101Io);
/* 29 */            OIiilo1Ool0o oIiilo1Ool0o = RemoteWorkManagerClient.I000OiO;
/* 31 */            OilOol oilOol = remoteWorkManagerClient.I0000Il00O;
/* 33 */            IOO01l00ol iOO01l00ol = Oll101.I00000oIO;
/* 47 */            return Oll101.I00000oIO(ilIl1O1ii0Oo.I00000oIO(oilOol), false, new OO11OilO(oIiilo1Ool0o, oll0oOI0000Il00O, null, 7));
                }

                @Override
                public O0iIl1 I00000oOI(OOi001oo1OOI oOi001oo1OOI, String str, Ol0O0iI0l0O ol0O0iI0l0O, Ol0O0iI0l0O ol0O0iI0l0O2) {
/* 204 */           throw new IllegalArgumentException("This method should not be used.");
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public void I000iOII(IoIlI1oli ioIlI1oli, Oll0io oll0io) {
/* 14 */            ioIlI1oli.I00iio.I000II(IoO0l0Iiioll.I000OiO, new OOlo0IiOl1i((Function3) oll0io, null, 2));
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return (byte[]) obj;
                }

                @Override
                public void configure(Il0IIIOll il0IIIOll) {
/* 5 */             il0IIIOll.registerEncoder(liiI0oII0iO.class, l11Oii0l1Oo1.I00000oIO);
/* 12 */            il0IIIOll.registerEncoder(loI1IIi.class, lO1Oo0IlOO.I00000oIO);
/* 19 */            il0IIIOll.registerEncoder(liiO00OIO0i.class, l11il0I0.I00000oIO);
/* 26 */            il0IIIOll.registerEncoder(lil01ll.class, l11ollOO11.I00000oIO);
/* 33 */            il0IIIOll.registerEncoder(liiioOIOl0.class, l11lol.I00000oIO);
/* 40 */            il0IIIOll.registerEncoder(liio0i0O.class, l1I0ol.I00000oIO);
/* 47 */            il0IIIOll.registerEncoder(lOlOlIloO.class, l0Ol11I1o.I00000oIO);
/* 54 */            il0IIIOll.registerEncoder(lOlO0Ii1o0O.class, l0Oi0Oo1OO.I00000oIO);
/* 61 */            il0IIIOll.registerEncoder(liI01il11.class, l0ooOl.I00000oIO);
/* 68 */            il0IIIOll.registerEncoder(lo0ioOI.class, lIo11o0I.I00000oIO);
/* 75 */            il0IIIOll.registerEncoder(lOlII1lolOiO.class, l0OO00l.I00000oIO);
/* 82 */            il0IIIOll.registerEncoder(lOl1iI1i.class, l0O1oII.I00000oIO);
/* 89 */            il0IIIOll.registerEncoder(ll1oOli.class, l1ooOI0i1O.I00000oIO);
/* 96 */            il0IIIOll.registerEncoder(loiOii10Iil1.class, l0lii0OIio00.I00000oIO);
/* 103 */           il0IIIOll.registerEncoder(li11ilO.class, l0o0ooi.I00000oIO);
/* 110 */           il0IIIOll.registerEncoder(li0II11ii11i.class, l0lOi1oO0.I00000oIO);
/* 117 */           il0IIIOll.registerEncoder(ll1ooO00ioO.class, lI00Iio.I00000oIO);
/* 124 */           il0IIIOll.registerEncoder(lloolo1.class, lIllIoIIlII.I00000oIO);
/* 131 */           il0IIIOll.registerEncoder(lo0O11O.class, lIloi1Oil.I00000oIO);
/* 138 */           il0IIIOll.registerEncoder(lloiiiOi10.class, lIliO1iOIl.I00000oIO);
/* 145 */           il0IIIOll.registerEncoder(lilOO00olo0.class, l1Io1IOlI0.I00000oIO);
/* 152 */           il0IIIOll.registerEncoder(loiIOolO0l.class, l00lo1i01I0.I00000oIO);
/* 159 */           il0IIIOll.registerEncoder(lili0Oooiil.class, l1O010l.I00000oIO);
/* 166 */           il0IIIOll.registerEncoder(llO01OoO0I0.class, lI111O0o.I00000oIO);
/* 173 */           il0IIIOll.registerEncoder(llOI0o0ol.class, lI1l1O0I00l.I00000oIO);
/* 180 */           il0IIIOll.registerEncoder(llO1i1.class, lI1iOI1I1OiI.I00000oIO);
/* 187 */           il0IIIOll.registerEncoder(llO1011iO.class, lI1IoI.I00000oIO);
/* 194 */           il0IIIOll.registerEncoder(lliiI0iOii.class, lIIoIoi0io.I00000oIO);
/* 201 */           il0IIIOll.registerEncoder(llilO1.class, lIO0oII00.I00000oIO);
/* 208 */           il0IIIOll.registerEncoder(llio00o0.class, lIOO0l.I00000oIO);
/* 215 */           il0IIIOll.registerEncoder(llilOl.class, lIOI11iI1.I00000oIO);
/* 222 */           il0IIIOll.registerEncoder(lilIII0OOi.class, l1IllI.I00000oIO);
/* 229 */           il0IIIOll.registerEncoder(lliooloIilII.class, lIOOlol001.I00000oIO);
/* 236 */           il0IIIOll.registerEncoder(lll0oOi.class, lIOoOllO.I00000oIO);
/* 243 */           il0IIIOll.registerEncoder(lll1liIO.class, lIi0O00OiiIl.I00000oIO);
/* 250 */           il0IIIOll.registerEncoder(lllIiOoI.class, lIi110Ooil11.I00000oIO);
/* 257 */           il0IIIOll.registerEncoder(lllloIiO.class, lIiil01l.I00000oIO);
/* 264 */           il0IIIOll.registerEncoder(llllI1lI0ll0.class, lIil1100i0.I00000oIO);
/* 271 */           il0IIIOll.registerEncoder(lliOIol.class, lIIIi0l1oi.I00000oIO);
/* 278 */           il0IIIOll.registerEncoder(liIilo01o.class, l10iioll.I00000oIO);
/* 285 */           il0IIIOll.registerEncoder(lli1iOI.class, lIIiiIii.I00000oIO);
/* 292 */           il0IIIOll.registerEncoder(llOoo01o.class, lIIOiIiIIO.I00000oIO);
/* 299 */           il0IIIOll.registerEncoder(lliIioi.class, lIIlIl0.I00000oIO);
/* 306 */           il0IIIOll.registerEncoder(lo0OliOoI11.class, lIo0II0IoiO.I00000oIO);
/* 313 */           il0IIIOll.registerEncoder(loO01O.class, lOIIl1l11.I00000oIO);
/* 320 */           il0IIIOll.registerEncoder(lOOilO.class, l01O0111o.I00000oIO);
/* 327 */           il0IIIOll.registerEncoder(lOOIol01.class, l0111oIiO1.I00000oIO);
/* 334 */           il0IIIOll.registerEncoder(lOO1lIo0.class, l010il0Ol.I00000oIO);
/* 341 */           il0IIIOll.registerEncoder(lOOOl0OIioo0.class, l01I01100oI.I00000oIO);
/* 348 */           il0IIIOll.registerEncoder(lOi01o.class, l01lllO.I00000oIO);
/* 355 */           il0IIIOll.registerEncoder(lOOlo0I1.class, l01iOI0O0.I00000oIO);
/* 362 */           il0IIIOll.registerEncoder(lOi10iiOi.class, l01oiolIi100.I00000oIO);
/* 369 */           il0IIIOll.registerEncoder(lOiIlo.class, l0I0IOoi.I00000oIO);
/* 376 */           il0IIIOll.registerEncoder(lOiOi1.class, l0I1IOl0llo.I00000oIO);
/* 383 */           il0IIIOll.registerEncoder(lOii0ii1111o.class, l0IOlIl.I00000oIO);
/* 390 */           il0IIIOll.registerEncoder(lOilIII.class, l0IiO0Ii110i.I00000oIO);
/* 397 */           il0IIIOll.registerEncoder(io011Ii.class, l00IIii101.I00000oIO);
/* 404 */           il0IIIOll.registerEncoder(io0i0iOO1iI.class, l00i1O1ooi.I00000oIO);
/* 411 */           il0IIIOll.registerEncoder(io0IoloO1.class, l00OIoIo1.I00000oIO);
/* 418 */           il0IIIOll.registerEncoder(liIIl1IoIl0i.class, l10IlI.I00000oIO);
/* 425 */           il0IIIOll.registerEncoder(lOliOi11oo1.class, l0Oo1O.I00000oIO);
/* 432 */           il0IIIOll.registerEncoder(ilI00iii01o.class, io0lo10O.I00000oIO);
/* 439 */           il0IIIOll.registerEncoder(il1loioIiio.class, io10OlI1i.I00000oIO);
/* 446 */           il0IIIOll.registerEncoder(li001Ol.class, l0l1oOiiol0l.I00000oIO);
/* 453 */           il0IIIOll.registerEncoder(ilI1Oi0.class, io1I0oIlI.I00000oIO);
/* 460 */           il0IIIOll.registerEncoder(ilI0iilo0.class, io1IlllI.I00000oIO);
/* 467 */           il0IIIOll.registerEncoder(ilOiIlolo0.class, ioO1l0iI1.I00000oIO);
/* 474 */           il0IIIOll.registerEncoder(ilOi1lOil1.class, ioOOolioioil.I00000oIO);
/* 481 */           il0IIIOll.registerEncoder(ilIIOO0loi1i.class, io1i1liio.I00000oIO);
/* 488 */           il0IIIOll.registerEncoder(IOolI11o1l.class, io1lIloo0iI.I00000oIO);
/* 495 */           il0IIIOll.registerEncoder(iliiOo1000lO.class, ioi1i1l1.I00000oIO);
/* 502 */           il0IIIOll.registerEncoder(iliI1lo.class, ioiIi0iIOOo.I00000oIO);
/* 509 */           il0IIIOll.registerEncoder(ill10I0oO.class, iol01I.I00000oIO);
/* 516 */           il0IIIOll.registerEncoder(ill0illOI1i.class, iol1I1.I00000oIO);
/* 523 */           il0IIIOll.registerEncoder(io0011OOloo.class, l0000o1lI1l1.I00000oIO);
/* 530 */           il0IIIOll.registerEncoder(ilooIOio.class, l001O01OOi1i.I00000oIO);
/* 537 */           il0IIIOll.registerEncoder(illI1o.class, iol1o0Iio0I.I00000oIO);
/* 544 */           il0IIIOll.registerEncoder(ill1oo0O1.class, ioll0II000.I00000oIO);
/* 551 */           il0IIIOll.registerEncoder(illii0liI.class, iollioII.I00000oIO);
/* 558 */           il0IIIOll.registerEncoder(illOi10o.class, ioo00Ooo0.I00000oIO);
/* 565 */           il0IIIOll.registerEncoder(loi00IO.class, lIoi1Ilo.I00000oIO);
/* 572 */           il0IIIOll.registerEncoder(loO1lii.class, l0i0IilOoI.I00000oIO);
/* 579 */           il0IIIOll.registerEncoder(loOl0i11Ii.class, l1Iil1Ii.I00000oIO);
/* 586 */           il0IIIOll.registerEncoder(loOiIOiI.class, l1IiIii1O0l0.I00000oIO);
/* 593 */           il0IIIOll.registerEncoder(loOIiO001ol0.class, l0loI0.I00000oIO);
/* 600 */           il0IIIOll.registerEncoder(loOoOliolI0O.class, lIoOII100.I00000oIO);
/* 607 */           il0IIIOll.registerEncoder(loOllOloilII.class, lIoI00I0.I00000oIO);
/* 614 */           il0IIIOll.registerEncoder(loi0Io.class, lIol00.I00000oIO);
/* 621 */           il0IIIOll.registerEncoder(loOi01OOIo0.class, l101Ili0l.I00000oIO);
/* 628 */           il0IIIOll.registerEncoder(loiI0iO.class, lOIiiol1.I00000oIO);
/* 635 */           il0IIIOll.registerEncoder(loi1O1OIo.class, lOIli1Oi0OO.I00000oIO);
/* 642 */           il0IIIOll.registerEncoder(loi10IoIoI0.class, lOIOill.I00000oIO);
/* 649 */           il0IIIOll.registerEncoder(lo0oOo00.class, lIooll1l.I00000oIO);
/* 656 */           il0IIIOll.registerEncoder(liI1I1I0Ol.class, l10I11ioiI1.I00000oIO);
/* 663 */           il0IIIOll.registerEncoder(liIllOil01.class, l10loOl.I00000oIO);
/* 670 */           il0IIIOll.registerEncoder(lOO101I1IO01.class, l0100Io1l110.I00000oIO);
/* 677 */           il0IIIOll.registerEncoder(li1IiOlol.class, l0oIIO1.I00000oIO);
/* 684 */           il0IIIOll.registerEncoder(liIOi0oii.class, l10OoiI11.I00000oIO);
/* 691 */           il0IIIOll.registerEncoder(li01Io1li.class, l0lIiiIo.I00000oIO);
/* 698 */           il0IIIOll.registerEncoder(lOloIO10IiOl.class, l0i1i0O.I00000oIO);
/* 705 */           il0IIIOll.registerEncoder(lOo0Ii0OOil.class, l0iIio1O11I.I00000oIO);
/* 712 */           il0IIIOll.registerEncoder(lOllIO.class, l0i0oI11O.I00000oIO);
/* 719 */           il0IIIOll.registerEncoder(lOo0o0.class, l0iOloI1.I00000oIO);
/* 726 */           il0IIIOll.registerEncoder(lil1i1iOi.class, l1IIilll.I00000oIO);
/* 733 */           il0IIIOll.registerEncoder(lil110IlOO.class, l1I1oOoI101l.I00000oIO);
/* 740 */           il0IIIOll.registerEncoder(il1lO0liOi.class, io0l100.I00000oIO);
/* 747 */           il0IIIOll.registerEncoder(loIiIll.class, lO1oOIIl0lO.I00000oIO);
/* 754 */           il0IIIOll.registerEncoder(loIo0ioOOli0.class, lOI1l0o1l1o1.I00000oIO);
/* 761 */           il0IIIOll.registerEncoder(loIlIlIl.class, lOI0I0Olil.I00000oIO);
/* 768 */           il0IIIOll.registerEncoder(lOO00lOoI.class, l00l0i0.I00000oIO);
/* 775 */           il0IIIOll.registerEncoder(lOl0oiiO.class, l0O0lioO.I00000oIO);
/* 782 */           il0IIIOll.registerEncoder(lOiooi0lII0.class, l0IoloO00.I00000oIO);
/* 789 */           il0IIIOll.registerEncoder(lOio0oO.class, l0IllI1.I00000oIO);
/* 796 */           il0IIIOll.registerEncoder(ll1iIlol1i.class, l1oI0OllI0.I00000oIO);
/* 803 */           il0IIIOll.registerEncoder(ll1loIlo.class, l1oilioi.I00000oIO);
/* 810 */           il0IIIOll.registerEncoder(ll1lO0oiio00.class, l1oO10.I00000oIO);
/* 817 */           il0IIIOll.registerEncoder(ilOIo0iOI.class, ioIo0o0O0loo.I00000oIO);
/* 824 */           il0IIIOll.registerEncoder(ilOI00llli.class, ioO01OI1l.I00000oIO);
/* 831 */           il0IIIOll.registerEncoder(llI0lO1.class, lI00oOlOlO0.I00000oIO);
/* 838 */           il0IIIOll.registerEncoder(llIi01lI.class, lI0i01.I00000oIO);
/* 845 */           il0IIIOll.registerEncoder(llI1o0.class, lI0I1III0.I00000oIO);
/* 852 */           il0IIIOll.registerEncoder(llIIo0l.class, lI0O1111i.I00000oIO);
/* 859 */           il0IIIOll.registerEncoder(ilOlOoO1lO.class, ioOii0iI.I00000oIO);
/* 866 */           il0IIIOll.registerEncoder(ilOl0O00Il0i.class, ioOlo00io0I1.I00000oIO);
/* 873 */           il0IIIOll.registerEncoder(lo1Il1l1Io0.class, lO0li1l0.I00000oIO);
/* 880 */           il0IIIOll.registerEncoder(lo1II1oO.class, lO0iI01olii.I00000oIO);
/* 887 */           il0IIIOll.registerEncoder(loIIiOoiO.class, lO1iOiiI0.I00000oIO);
/* 894 */           il0IIIOll.registerEncoder(loIOIoio.class, lO1llll0i.I00000oIO);
/* 901 */           il0IIIOll.registerEncoder(llOO0IiIOooI.class, lI1li01l0.I00000oIO);
/* 908 */           il0IIIOll.registerEncoder(llOllO.class, lII1Ol.I00000oIO);
/* 915 */           il0IIIOll.registerEncoder(llOOlOOo11i1.class, lI1oio1O01l.I00000oIO);
/* 922 */           il0IIIOll.registerEncoder(llOilIi0lOIl.class, lII0lOoI.I00000oIO);
/* 929 */           il0IIIOll.registerEncoder(li1iI1ill1.class, l0olO0o.I00000oIO);
/* 936 */           il0IIIOll.registerEncoder(ilioOIIoIi10.class, ioiOil1.I00000oIO);
/* 943 */           il0IIIOll.registerEncoder(ililIi1I0iOo.class, ioil10.I00000oIO);
/* 950 */           il0IIIOll.registerEncoder(li1OOi.class, l0oOlOOi1.I00000oIO);
/* 957 */           il0IIIOll.registerEncoder(li0O0lIOl1i.class, l0o011Ol1iI.I00000oIO);
/* 964 */           il0IIIOll.registerEncoder(llIiiII.class, lI0l1Oo.I00000oIO);
/* 971 */           il0IIIOll.registerEncoder(llIoI1lOoI.class, lI10Ioi0O.I00000oIO);
/* 978 */           il0IIIOll.registerEncoder(llIlloOll.class, lI0oOOi1ool1.I00000oIO);
/* 985 */           il0IIIOll.registerEncoder(ili0OllOi.class, ioi00OOlI1O.I00000oIO);
/* 992 */           il0IIIOll.registerEncoder(ilOoiIi101.class, ioi0ii1i1O.I00000oIO);
/* 999 */           il0IIIOll.registerEncoder(ll0I11O.class, l1l0oOliO.I00000oIO);
/* 1006 */          il0IIIOll.registerEncoder(ll0Ioo0.class, l1l1OOi.I00000oIO);
/* 1013 */          il0IIIOll.registerEncoder(ll0i0l0Ili.class, l1lIioo1.I00000oIO);
/* 1020 */          il0IIIOll.registerEncoder(ilIoII0I1Oo.class, ioIIioOIO.I00000oIO);
/* 1027 */          il0IIIOll.registerEncoder(ilIl1O1ii0Oo.class, ioIOi01.I00000oIO);
/* 1034 */          il0IIIOll.registerEncoder(lioooIIO.class, l1iioO0oO.I00000oIO);
/* 1041 */          il0IIIOll.registerEncoder(ll00lliII.class, l1io1O0000.I00000oIO);
/* 1048 */          il0IIIOll.registerEncoder(ll01i1llI.class, l1l00l1.I00000oIO);
/* 1055 */          il0IIIOll.registerEncoder(ilIiOIi0I.class, io1oOOI11iI.I00000oIO);
/* 1062 */          il0IIIOll.registerEncoder(ilIOO00ili.class, ioI10I0i.I00000oIO);
/* 1069 */          il0IIIOll.registerEncoder(ll0l0OiI1I.class, l1lOOloIi1iI.I00000oIO);
/* 1076 */          il0IIIOll.registerEncoder(ll0li01oO0li.class, l1li1lO0II0o.I00000oIO);
/* 1083 */          il0IIIOll.registerEncoder(ll0oolI10I.class, l1llIi1OIo0O.I00000oIO);
/* 1090 */          il0IIIOll.registerEncoder(ll10OO0Illl1.class, l1lo0oIoOo1.I00000oIO);
/* 1097 */          il0IIIOll.registerEncoder(ilO110i0o.class, ioIio000olo.I00000oIO);
/* 1104 */          il0IIIOll.registerEncoder(ilO01lO.class, ioIlI00IIi.I00000oIO);
/* 1111 */          il0IIIOll.registerEncoder(lo11I00il.class, lO00o0Oi.I00000oIO);
/* 1118 */          il0IIIOll.registerEncoder(lo10IIIO.class, lO0I0IOOO.I00000oIO);
/* 1125 */          il0IIIOll.registerEncoder(liO00IOO.class, l10ol0.I00000oIO);
/* 1132 */          il0IIIOll.registerEncoder(liOI0oO11O.class, l111OioOOO.I00000oIO);
/* 1139 */          il0IIIOll.registerEncoder(liO111OO1.class, l1101ll10.I00000oIO);
/* 1146 */          il0IIIOll.registerEncoder(liOO0oio.class, l11IOO.I00000oIO);
/* 1153 */          il0IIIOll.registerEncoder(llloio0I1iO1.class, lIio0I0.I00000oIO);
/* 1160 */          il0IIIOll.registerEncoder(llo0i0o1lIO.class, lIl0Oli0o0.I00000oIO);
/* 1167 */          il0IIIOll.registerEncoder(ilo10llil1lI.class, iooO0il.I00000oIO);
/* 1174 */          il0IIIOll.registerEncoder(ilo0IIoO1I1l.class, iooi1o.I00000oIO);
/* 1181 */          il0IIIOll.registerEncoder(lo1i0oolo11i.class, lO0oOO0IIOO1.I00000oIO);
/* 1188 */          il0IIIOll.registerEncoder(lllOiOi.class, lIiIOi0O.I00000oIO);
/* 1195 */          il0IIIOll.registerEncoder(llliOO0iI10.class, lIiOOII.I00000oIO);
/* 1202 */          il0IIIOll.registerEncoder(illol1.class, ioo0oi1loi1.I00000oIO);
/* 1209 */          il0IIIOll.registerEncoder(illliIoo1l0O.class, ioo1oI1II.I00000oIO);
/* 1216 */          il0IIIOll.registerEncoder(lo11lll01.class, lO0O01.I00000oIO);
/* 1223 */          il0IIIOll.registerEncoder(liooIOIo.class, l1OOl11lOi.I00000oIO);
/* 1230 */          il0IIIOll.registerEncoder(lioli1IO.class, l1iOil.I00000oIO);
/* 1237 */          il0IIIOll.registerEncoder(lioOO0I.class, l1i10o0l0.I00000oIO);
/* 1244 */          il0IIIOll.registerEncoder(lio1l10i0I.class, l1i0011o.I00000oIO);
/* 1251 */          il0IIIOll.registerEncoder(lioi0o0iii.class, l1i1ool.I00000oIO);
/* 1258 */          il0IIIOll.registerEncoder(lioiiOOOIlIo.class, l1iIoI1.I00000oIO);
/* 1265 */          il0IIIOll.registerEncoder(lio0lio01.class, l1OoIllO.I00000oIO);
/* 1272 */          il0IIIOll.registerEncoder(lillI0.class, l1OIli1I.I00000oIO);
/* 1279 */          il0IIIOll.registerEncoder(lio00OOillO.class, l1Oli001oo.I00000oIO);
/* 1286 */          il0IIIOll.registerEncoder(lilloo.class, l1Oil0ollolo.I00000oIO);
/* 1293 */          il0IIIOll.registerEncoder(ll1I00l.class, l1o0l1l1.I00000oIO);
/* 1300 */          il0IIIOll.registerEncoder(lOoOoloI01i0.class, l0ioIOi1.I00000oIO);
/* 1307 */          il0IIIOll.registerEncoder(ll11O10I1111.class, l1o0000lI.I00000oIO);
/* 1314 */          il0IIIOll.registerEncoder(ll1OIooo.class, l1o1i1O0OoOI.I00000oIO);
/* 1321 */          il0IIIOll.registerEncoder(lOoIiIOlO.class, l0ilOioioO.I00000oIO);
/* 1328 */          il0IIIOll.registerEncoder(lOoil01ollIo.class, l0l111ii.I00000oIO);
/* 1335 */          il0IIIOll.registerEncoder(lo0loI1.class, lIoloOoI0oo1.I00000oIO);
/* 1342 */          il0IIIOll.registerEncoder(llo11o0IIOi.class, lIl1O1l01.I00000oIO);
/* 1349 */          il0IIIOll.registerEncoder(lo1oiOI.class, lO1O00lO1o0I.I00000oIO);
/* 1356 */          il0IIIOll.registerEncoder(lloO11IO.class, lIlOOioOOo.I00000oIO);
/* 1363 */          il0IIIOll.registerEncoder(llo1o0l1Il0.class, lIlI11oiIo.I00000oIO);
/* 1370 */          il0IIIOll.registerEncoder(lo1lI0i1Ol.class, lO10o0.I00000oIO);
/* 1377 */          il0IIIOll.registerEncoder(iloOIo1I1oOo.class, ioolOii0.I00000oIO);
/* 1384 */          il0IIIOll.registerEncoder(iloI1O.class, ioolo010O.I00000oIO);
/* 1391 */          il0IIIOll.registerEncoder(lo1llIoiI.class, lO11ol1.I00000oIO);
/* 1398 */          il0IIIOll.registerEncoder(lOo1ilOiIio1.class, l0iio111lO.I00000oIO);
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 9 */             Set<Oi00Ii> setI0000oI00 = ((I1ii1o0) iOiOIoiiO0i).I0000oI00(OOiilOlOOI.I00000oIO(Oi00Ii.class));
/* 15 */            Oi00IilOloo0 oi00IilOloo0 = new Oi00IilOloo0();
/* 23 */            oi00IilOloo0.I00iOIl = new HashMap();
/* 33 */            for (Oi00Ii oi00Ii : setI0000oI00) {
/* 43 */                HashMap map = (HashMap) oi00IilOloo0.I00iOIl;
/* 45 */                oi00Ii.getClass();
/* 52 */                map.put(Ii0iil01Il.class, oi00Ii.I00000oIO);
                    }
/* 56 */            VarHandle.storeStoreFence();
/* 77 */            return oi00IilOloo0;
                }

                @Override
                public Object get() {
/* 1 */             Object obj = lIlIo1.I000OiO;
/* 5 */             ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(Io1iO1I.I00000oOI);
/* 11 */            if (scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof OI011o1) {
/* 13 */                return (OI011o1) scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                    }
/* 18 */            OI011o1 oI011o1 = new OI011o1();
/* 21 */            scheduledExecutorServiceNewSingleThreadScheduledExecutor.getClass();
/* 24 */            oI011o1.I00iOIl = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
/* 26 */            oI011o1.I00iiI = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
/* 28 */            VarHandle.storeStoreFence();
/* 55 */            return oI011o1;
                }

                @Override
                public O0iIl1 getType() {
/* 20 */            throw new IllegalStateException("This method should not be called");
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_INDEX:
/* 151 */                   return new Boolean(((Boolean) iII10IIoliO.I00000oOI.get()).booleanValue());
                        case PoseLandmark.RIGHT_INDEX:
                        default:
/* 6 */                     List list = iol1II1ii1i.I00000oIO;
/* 10 */                    iI1lO0li.I00iiI.get();
/* 28 */                    return (Long) iI1liIi1li.I00000oIO.I00111O(0, 10000L, "measurement.ad_id_cache_time").get();
                        case PoseLandmark.LEFT_THUMB:
/* 102 */                   List list2 = iol1II1ii1i.I00000oIO;
/* 106 */                   iI1lO0li.I00iiI.get();
/* 126 */                   return (Long) iI1liIi1li.I00000oIO.I00111O(63, 43200000L, "measurement.upload.backoff_period").get();
                        case PoseLandmark.RIGHT_THUMB:
/* 77 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 81 */                    iIO0i1II.I00iiI.get();
/* 99 */                    return (String) iIO0o100IO.I00000oIO.I001IO000("measurement.test.string_flag", 5, "---").get();
                        case PoseLandmark.LEFT_HIP:
/* 50 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 54 */                    iI1lO0li.I00iiI.get();
/* 74 */                    return (Long) iI1liIi1li.I00000oIO.I00111O(12, 3600000L, "measurement.session.engagement_interval").get();
                        case PoseLandmark.RIGHT_HIP:
/* 31 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 47 */                    return (Boolean) iIi1io0iI0.I00000oIO.get();
                    }
                }
            }
