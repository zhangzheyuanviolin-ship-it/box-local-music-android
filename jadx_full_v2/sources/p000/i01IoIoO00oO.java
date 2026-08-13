            package p000;

            import android.app.job.JobScheduler;
            import android.content.ComponentName;
            import android.content.Context;
            import androidx.work.impl.WorkDatabase;
            import androidx.work.impl.background.systemjob.SystemJobService;
            import com.box.gallery.R;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public abstract class i01IoIoO00oO {
                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                    */
                public static final void I00000oIO(p000.O1ol100o0O r59, p000.I1iOI11ioi1 r60, p000.IloI0lOlll1 r61, int r62) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*  JADX ERROR: Type inference failed
                        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    /*
                        Method dump skipped, instructions count: 1813
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.i01IoIoO00oO.I00000oIO(O1ol100o0O, I1iOI11ioi1, IloI0lOlll1, int):void");
                }

                public static final void I00000oOI(boolean z, O1oOl0 o1oOl0, IloI0lOlll1 iloI0lOlll1, int i) {
                    OIoi0IIoi oIoi0IIoi;
/* 4 */             iloI0lOlll1.I00i0O(-1710915619);
/* 11 */            int i2 = 2;
/* 37 */            int i3 = (iloI0lOlll1.I000O01llI0(z) ? 4 : 2) | i | (iloI0lOlll1.I0000oI00(o1oOl0 == null ? -1 : o1oOl0.ordinal()) ? 32 : 16);
/* 43 */            int i4 = 0;
/* 54 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 56 */                if (z) {
/* 61 */                    iloI0lOlll1.I00i01iIIliI(782569103);
/* 78 */                    oIoi0IIoi = new OIoi0IIoi("Model ready", IOOiio0i.I00000oIO(liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I00000oIO));
/* 81 */                    iloI0lOlll1.I0010I0i(false);
                        } else if (o1oOl0 == O1oOl0.I00iiI) {
/* 92 */                    iloI0lOlll1.I00i01iIIliI(782572916);
/* 109 */                   oIoi0IIoi = new OIoi0IIoi("Loading model…", IOOiio0i.I00000oIO(liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0001Ioi1lo));
/* 112 */                   iloI0lOlll1.I0010I0i(false);
                        } else if (o1oOl0 == O1oOl0.I00iio) {
/* 123 */                   iloI0lOlll1.I00i01iIIliI(782576662);
/* 140 */                   oIoi0IIoi = new OIoi0IIoi("Model failed to load", IOOiio0i.I00000oIO(liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I001i1O0Ol));
/* 143 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 150 */                   iloI0lOlll1.I00i01iIIliI(782579065);
/* 167 */                   oIoi0IIoi = new OIoi0IIoi("Select and download a Whisper model to begin", IOOiio0i.I00000oIO(liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0010o));
/* 170 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 175 */               String str = (String) oIoi0IIoi.I00iOIl;
/* 181 */               long j = ((IOOiio0i) oIoi0IIoi.I00iiI).I00000oIO;
/* 189 */               IO0i0i iO0i0iI00000oIO = iOl10Oi0oo0.I00000oIO(liIoOiiO1Oi.I000O01llI0(iloI0lOlll1).I0010I0i, iloI0lOlll1);
/* 195 */               I1iIo0i i1iIo0i = new I1iIo0i(i4);
/* 198 */               i1iIo0i.I00iiO = o1oOl0;
/* 200 */               i1iIo0i.I00iio = str;
/* 202 */               i1iIo0i.I00iiI = j;
/* 204 */               VarHandle.storeStoreFence();
/* 224 */               iOl111l1l.I00000oOI(null, null, iO0i0iI00000oIO, null, null, iiioOl1O.I00000oOI(1699275307, i1iIo0i, iloI0lOlll1), iloI0lOlll1, 196608, 27);
                    } else {
/* 228 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 231 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 235 */           if (oOloioIlI001IO000 != null) {
/* 239 */               I1IIol00oIo0 i1IIol00oIo0 = new I1IIol00oIo0(i2);
/* 242 */               i1IIol00oIo0.I00iiI = z;
/* 244 */               i1IIol00oIo0.I00iiO = o1oOl0;
/* 246 */               VarHandle.storeStoreFence();
/* 249 */               oOloioIlI001IO000.I0000O = i1IIol00oIo0;
                    }
                }

                public static final void I0000Il00O(String str, Float f, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(454801441);
/* 11 */            int i2 = 4;
/* 29 */            int i3 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i | (iloI0lOlll1.I000II(f) ? 32 : 16);
/* 34 */            int i4 = 1;
/* 45 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 59 */                IO0i0i iO0i0iI00000oIO = iOl10Oi0oo0.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I0010I0i, iloI0lOlll1);
/* 65 */                I0illI1iI i0illI1iI = new I0illI1iI(i4);
/* 68 */                i0illI1iI.I00iiI = f;
/* 70 */                i0illI1iI.I00iiO = str;
/* 72 */                VarHandle.storeStoreFence();
/* 91 */                iOl111l1l.I00000oOI(null, null, iO0i0iI00000oIO, null, null, iiioOl1O.I00000oOI(-1980860689, i0illI1iI, iloI0lOlll1), iloI0lOlll1, 196608, 27);
                    } else {
/* 95 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 98 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 102 */           if (oOloioIlI001IO000 != null) {
/* 106 */               I0Il0I1o i0Il0I1o = new I0Il0I1o(i2);
/* 109 */               i0Il0I1o.I00iiO = str;
/* 111 */               i0Il0I1o.I00iiI = f;
/* 113 */               VarHandle.storeStoreFence();
/* 116 */               oOloioIlI001IO000.I0000O = i0Il0I1o;
                    }
                }

                public static final void I0000O(Map map, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(1210710100);
/* 11 */            int i2 = 2;
/* 29 */            int i3 = (iloI0lOlll1.I000OOo1O(map) ? 4 : 2) | i | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16);
/* 45 */            if (iloI0lOlll1.I00OIl(i3 & 1, (i3 & 19) != 18)) {
/* 59 */                IO0i0i iO0i0iI00000oIO = iOl10Oi0oo0.I00000oIO(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I0010I0i, iloI0lOlll1);
/* 65 */                I0illI1iI i0illI1iI = new I0illI1iI(i2);
/* 68 */                i0illI1iI.I00iiI = map;
/* 70 */                i0illI1iI.I00iiO = illiIl1l11O;
/* 72 */                VarHandle.storeStoreFence();
/* 91 */                iOl111l1l.I00000oOI(null, null, iO0i0iI00000oIO, null, null, iiioOl1O.I00000oOI(-1617455674, i0illI1iI, iloI0lOlll1), iloI0lOlll1, 196608, 27);
                    } else {
/* 95 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 98 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 102 */           if (oOloioIlI001IO000 != null) {
/* 107 */               I0Il0I1o i0Il0I1o = new I0Il0I1o(5);
/* 110 */               i0Il0I1o.I00iiO = map;
/* 112 */               i0Il0I1o.I00iiI = illiIl1l11O;
/* 114 */               VarHandle.storeStoreFence();
/* 117 */               oOloioIlI001IO000.I0000O = i0Il0I1o;
                    }
                }

                public static final i01IlOO I0000oI00(Context context, IOllii iOllii) {
                    Oi1o1i0 oi1o1i0I00000oIO;
/* 9 */             OillOo0 oillOo0 = new OillOo0(iOllii.I0000Il00O);
/* 12 */            Context applicationContext = context.getApplicationContext();
/* 18 */            OilOol oilOol = (OilOol) oillOo0.I00iiI;
/* 20 */            o0llIi o0llii = iOllii.I0000O;
/* 36 */            int i = 1;
/* 37 */            if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
/* 41 */                oi1o1i0I00000oIO = new Oi1o1i0(applicationContext, WorkDatabase.class, null);
/* 44 */                oi1o1i0I00000oIO.I000OOo1O = true;
                    } else {
/* 49 */                oi1o1i0I00000oIO = lIolIIiIOOIl.I00000oIO(applicationContext, WorkDatabase.class, "androidx.work.workdb");
/* 56 */                Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(7);
/* 59 */                olio1i0OI00i.I00iiI = applicationContext;
/* 61 */                VarHandle.storeStoreFence();
/* 64 */                oi1o1i0I00000oIO.I000O01llI0 = olio1i0OI00i;
                    }
/* 66 */            oi1o1i0I00000oIO.I0001Ioi1lo = oilOol;
/* 71 */            IOIio10l0I1I iOIio10l0I1I = new IOIio10l0I1I(0);
/* 74 */            iOIio10l0I1I.I00000oOI = o0llii;
/* 76 */            VarHandle.storeStoreFence();
/* 81 */            oi1o1i0I00000oIO.I0000O.add(iOIio10l0I1I);
/* 90 */            oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I000O01llI0);
/* 95 */            int i2 = 2;
/* 104 */           oi1o1i0I00000oIO.I00000oIO(new Oi0Oi1ooI010(applicationContext, 2, 3));
/* 113 */           oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I000OOo1O);
/* 122 */           oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I000OiO);
/* 136 */           oi1o1i0I00000oIO.I00000oIO(new Oi0Oi1ooI010(applicationContext, 5, 6));
/* 145 */           oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I000iOII);
/* 154 */           oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I000l1);
/* 163 */           oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I000lI);
/* 172 */           Oi0Oi1ooI010 oi0Oi1ooI010 = new Oi0Oi1ooI010(9, 10);
/* 175 */           oi0Oi1ooI010.I0000O = applicationContext;
/* 177 */           VarHandle.storeStoreFence();
/* 184 */           oi1o1i0I00000oIO.I00000oIO(oi0Oi1ooI010);
/* 198 */           oi1o1i0I00000oIO.I00000oIO(new Oi0Oi1ooI010(applicationContext, 10, 11));
/* 207 */           oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I0000O);
/* 216 */           oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I0000oI00);
/* 225 */           oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I0001Ioi1lo);
/* 234 */           oi1o1i0I00000oIO.I00000oIO(O1loO1i0IoO.I000II);
/* 250 */           oi1o1i0I00000oIO.I00000oIO(new Oi0Oi1ooI010(applicationContext, 21, 22));
/* 253 */           oi1o1i0I00000oIO.I00100l0 = false;
/* 255 */           oi1o1i0I00000oIO.I00100o1O0lo = true;
/* 257 */           oi1o1i0I00000oIO.I0010I0i = true;
/* 263 */           WorkDatabase workDatabase = (WorkDatabase) oi1o1i0I00000oIO.I00000oOI();
/* 267 */           Context applicationContext2 = context.getApplicationContext();
/* 277 */           I1oolIoOllO i1oolIoOllO = new I1oolIoOllO(applicationContext2.getApplicationContext(), oillOo0, 0);
/* 286 */           I1oolIoOllO i1oolIoOllO2 = new I1oolIoOllO(applicationContext2.getApplicationContext(), oillOo0, 1);
/* 295 */           I1oolIoOllO i1oolIoOllO3 = new I1oolIoOllO(applicationContext2.getApplicationContext(), oillOo0, 2);
/* 300 */           OillOo0 oillOo02 = new OillOo0(15);
/* 303 */           oillOo02.I00iiI = applicationContext2;
/* 305 */           oillOo02.I00iiO = i1oolIoOllO;
/* 307 */           oillOo02.I00iio = i1oolIoOllO2;
/* 309 */           oillOo02.I00ilI0I1 = i1oolIoOllO3;
/* 311 */           VarHandle.storeStoreFence();
/* 316 */           Context applicationContext3 = context.getApplicationContext();
/* 320 */           OOIo1i0 oOIo1i0 = new OOIo1i0();
/* 323 */           oOIo1i0.I00000oOI = applicationContext3;
/* 325 */           oOIo1i0.I0000Il00O = iOllii;
/* 327 */           oOIo1i0.I0000O = oillOo0;
/* 329 */           oOIo1i0.I0000oI00 = workDatabase;
/* 336 */           oOIo1i0.I000II = new HashMap();
/* 343 */           oOIo1i0.I0001Ioi1lo = new HashMap();
/* 350 */           oOIo1i0.I000OOo1O = new HashSet();
/* 357 */           oOIo1i0.I000OiO = new ArrayList();
/* 359 */           oOIo1i0.I00000oIO = null;
/* 366 */           oOIo1i0.I000iOII = new Object();
/* 373 */           oOIo1i0.I000O01llI0 = new HashMap();
/* 375 */           VarHandle.storeStoreFence();
/* 378 */           int i3 = i01IliO.I00ioIO;
/* 380 */           int i4 = OiOIOI.I00000oIO;
/* 384 */           JobScheduler jobSchedulerI00000oIO = O01110.I00000oIO(context);
/* 390 */           o0llIi o0llii2 = iOllii.I0000O;
/* 392 */           boolean z = iOllii.I000o00OoI0I;
/* 394 */           OllOlli ollOlli = new OllOlli();
/* 397 */           ollOlli.I00000oOI = o0llii2;
/* 412 */           ollOlli.I00000oIO = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
/* 414 */           ollOlli.I0000Il00O = z;
/* 416 */           VarHandle.storeStoreFence();
/* 419 */           OllOoIIli0O ollOoIIli0O = new OllOoIIli0O();
/* 422 */           ollOoIIli0O.I00iOIl = context;
/* 424 */           ollOoIIli0O.I00iiI = jobSchedulerI00000oIO;
/* 426 */           ollOoIIli0O.I00iiO = ollOlli;
/* 428 */           ollOoIIli0O.I00iio = workDatabase;
/* 430 */           ollOoIIli0O.I00ilI0I1 = iOllii;
/* 432 */           VarHandle.storeStoreFence();
/* 435 */           OIo0ol1il0l.I00000oIO(context, SystemJobService.class, true);
/* 442 */           IIi0oIl.I000II().getClass();
/* 449 */           i000IO i000io = new i000IO(i, oOIo1i0, oillOo0);
/* 452 */           Io10ilo io10ilo = new Io10ilo();
/* 460 */           io10ilo.I00iiI = new HashMap();
/* 467 */           io10ilo.I00ilI0I1 = new Object();
/* 473 */           IIloOI iIloOI = new IIloOI(26);
/* 481 */           iIloOI.I00iiI = new LinkedHashMap();
/* 483 */           VarHandle.storeStoreFence();
/* 490 */           IoloOio0I ioloOio0I = new IoloOio0I(29);
/* 493 */           ioloOio0I.I00iiI = iIloOI;
/* 500 */           ioloOio0I.I00iiO = new Object();
/* 502 */           VarHandle.storeStoreFence();
/* 505 */           io10ilo.I00ilO0 = ioloOio0I;
/* 512 */           io10ilo.I00l0OO0IO = new HashMap();
/* 514 */           io10ilo.I00iOIl = context;
/* 516 */           Oi00IilOloo0 oi00IilOloo0 = iOllii.I000II;
/* 520 */           IiIilii1I iiIilii1I = new IiIilii1I();
/* 523 */           iiIilii1I.I00000oIO = io10ilo;
/* 525 */           iiIilii1I.I00000oOI = oi00IilOloo0;
/* 527 */           iiIilii1I.I0000Il00O = o0llii2;
/* 534 */           iiIilii1I.I0000O = new HashMap();
/* 536 */           VarHandle.storeStoreFence();
/* 539 */           io10ilo.I00iiO = iiIilii1I;
/* 545 */           iOliil ioliil = new iOliil(12);
/* 548 */           ioliil.I00iiI = oi00IilOloo0;
/* 550 */           ioliil.I00iiO = i000io;
/* 557 */           ioliil.I00iio = new Object();
/* 564 */           ioliil.I00ilI0I1 = new LinkedHashMap();
/* 566 */           VarHandle.storeStoreFence();
/* 569 */           io10ilo.I00lll10 = ioliil;
/* 571 */           io10ilo.I00lli11 = oillOo0;
/* 578 */           io10ilo.I00ll1 = new OlIOOOoi0IlI(oillOo02);
/* 580 */           io10ilo.I00l0I0l0lO1 = iOllii;
/* 582 */           io10ilo.I00io1l = oOIo1i0;
/* 584 */           io10ilo.I00ioIO = i000io;
/* 586 */           VarHandle.storeStoreFence();
/* 595 */           List listI000O01llI0 = IOOi1I.I000O01llI0(ollOoIIli0O, io10ilo);
/* 603 */           Context applicationContext4 = context.getApplicationContext();
/* 607 */           i01IlOO i01iloo = new i01IlOO();
/* 612 */           i01iloo.I000O01llI0 = false;
/* 614 */           Context applicationContext5 = applicationContext4.getApplicationContext();
/* 622 */           if (applicationContext5.isDeviceProtectedStorage()) {
/* 810 */               I000II.I001IO000("Cannot initialize WorkManager in direct boot mode");
/* 813 */               return null;
                    }
/* 628 */           IIi0oIl iIi0oIl = new IIi0oIl(iOllii.I000OiO);
                    synchronized (IIi0oIl.I00iiO) {
                        try {
/* 636 */                   if (IIi0oIl.I00iio == null) {
/* 638 */                       IIi0oIl.I00iio = iIi0oIl;
                            }
                        } catch (Throwable th) {
/* 807 */                   throw th;
                        }
                    }
/* 645 */           i01iloo.I00000oIO = applicationContext5;
/* 647 */           i01iloo.I0000O = oillOo0;
/* 649 */           i01iloo.I0000Il00O = workDatabase;
/* 651 */           i01iloo.I0001Ioi1lo = oOIo1i0;
/* 653 */           i01iloo.I000iOII = oillOo02;
/* 655 */           i01iloo.I00000oOI = iOllii;
/* 657 */           i01iloo.I0000oI00 = listI000O01llI0;
/* 663 */           IIOlO1ii iIOlO1iiI00000oIO = il001oo1.I00000oIO((Ii00lIOoi) oillOo0.I00iiO);
/* 669 */           Oi00IilOloo0 oi00IilOloo02 = new Oi00IilOloo0();
/* 672 */           oi00IilOloo02.I00iOIl = workDatabase;
/* 674 */           VarHandle.storeStoreFence();
/* 677 */           i01iloo.I000II = oi00IilOloo02;
/* 681 */           OilOol oilOol2 = (OilOol) oillOo0.I00iiI;
/* 685 */           OiOII0lI1 oiOII0lI1 = new OiOII0lI1();
/* 688 */           oiOII0lI1.I00iOIl = oilOol2;
/* 690 */           oiOII0lI1.I00iiI = listI000O01llI0;
/* 692 */           oiOII0lI1.I00iiO = iOllii;
/* 694 */           oiOII0lI1.I00iio = workDatabase;
/* 696 */           VarHandle.storeStoreFence();
/* 699 */           oOIo1i0.I00000oIO(oiOII0lI1);
/* 704 */           IliliO1llI ililiO1llI = new IliliO1llI();
/* 711 */           ililiO1llI.I00iOIl = applicationContext5.getApplicationContext();
/* 713 */           ililiO1llI.I00iiI = i01iloo;
/* 715 */           ililiO1llI.I00iiO = oi00IilOloo02;
/* 718 */           ililiO1llI.I00iio = 0;
/* 720 */           VarHandle.storeStoreFence();
/* 723 */           oillOo0.I0000O(ililiO1llI);
/* 726 */           String str = OoiI111i1l1O.I00000oIO;
/* 732 */           if (!OOIloi.I00000oIO(applicationContext5, iOllii)) {
/* 802 */               VarHandle.storeStoreFence();
/* 805 */               return i01iloo;
                    }
/* 738 */           IlOil1ii ilOil1iiHasUnfinishedWorkFlow = workDatabase.I001lIiIIo1O().hasUnfinishedWorkFlow();
/* 745 */           IOoil1iiIilo iOoil1iiIilo = null;
/* 746 */           OoiI0oiiIo ooiI0oiiIo = new OoiI0oiiIo(4, null);
/* 751 */           IlOl01I111 ilOl01I111 = new IlOl01I111(1);
/* 754 */           ilOl01I111.I00iiI = ilOil1iiHasUnfinishedWorkFlow;
/* 756 */           ilOl01I111.I00iiO = ooiI0oiiIo;
/* 758 */           VarHandle.storeStoreFence();
/* 766 */           IlOil1ii ilOil1iiI00000oIO = iIOIO0IO0l.I00000oIO(ilOlOoO1lO.I00000oIO(ilOl01I111, -1));
/* 772 */           I1oo01II0O11 i1oo01II0O11 = new I1oo01II0O11(applicationContext5, iOoil1iiIilo, i2);
/* 777 */           IlOlOlI0 ilOlOlI0 = new IlOlOlI0(i2);
/* 780 */           ilOlOlI0.I00iiI = ilOil1iiI00000oIO;
/* 782 */           ilOlOlI0.I00iiO = i1oo01II0O11;
/* 784 */           VarHandle.storeStoreFence();
/* 795 */           iOi1II01i0.I0000O(iIOlO1iiI00000oIO, null, null, new I0II0OiI(ilOlOlI0, iOoil1iiIilo, 17), 3);
/* 798 */           VarHandle.storeStoreFence();
/* 801 */           return i01iloo;
                }
            }
