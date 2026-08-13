            package p000;

            import android.content.Context;
            import android.os.Handler;
            import android.text.TextUtils;
            import androidx.work.impl.model.WorkSpec;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Objects;
            
            public final class Io10ilo implements OiOI1oIoooI, OIOollli, Il11ii {
                public static final String I00o0iI0io1 = IIi0oIl.I000OiO("GreedyScheduler");
                public Context I00iOIl;
                public HashMap I00iiI;
                public IiIilii1I I00iiO;
                public boolean I00iio;
                public Object I00ilI0I1;
                public IoloOio0I I00ilO0;
                public OOIo1i0 I00io1l;
                public i000IO I00ioIO;
                public IOllii I00l0I0l0lO1;
                public HashMap I00l0OO0IO;
                public Boolean I00li1OI;
                public OlIOOOoi0IlI I00ll1;
                public OloIli I00lli11;
                public iOliil I00lll10;

                @Override
                public final void I00000oIO(WorkSpec workSpec, IOo100ol1lIo iOo100ol1lIo) {
/* 1 */             i000IO i000io = this.I00ioIO;
/* 3 */             iOliil ioliil = this.I00lll10;
/* 5 */             IoloOio0I ioloOio0I = this.I00ilO0;
/* 7 */             i01IIlI i01iiliI00000oIO = liIOI1iO.I00000oIO(workSpec);
/* 13 */            if (iOo100ol1lIo instanceof IOo0oo1oo1OI) {
/* 19 */                if (ioloOio0I.I0010o(i01iiliI00000oIO)) {
/* 106 */                   return;
                        }
/* 21 */                IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 25 */                i01iiliI00000oIO.toString();
/* 28 */                iIi0oIlI000II.getClass();
/* 31 */                OlO0000lIOII olO0000lIOIII00OIl = ioloOio0I.I00OIl(i01iiliI00000oIO);
/* 35 */                ioliil.I001lIiIIo1O(olO0000lIOIII00OIl);
/* 39 */                i000io.I0000O(olO0000lIOIII00OIl, null);
/* 42 */                return;
                    }
/* 43 */            IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 47 */            i01iiliI00000oIO.toString();
/* 50 */            iIi0oIlI000II2.getClass();
/* 53 */            OlO0000lIOII olO0000lIOIII00O10llo = ioloOio0I.I00O10llo(i01iiliI00000oIO);
/* 57 */            if (olO0000lIOIII00O10llo != null) {
/* 59 */                ioliil.I000o00OoI0I(olO0000lIOIII00O10llo);
/* 66 */                i000io.I0000oI00(olO0000lIOIII00O10llo, ((IOo0oooliOI0) iOo100ol1lIo).I00000oIO);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v4, types: [IOoil1iiIilo, Ii00l101O, Ii01I10] */
                @Override
                public final void I00000oOI(WorkSpec... workSpecArr) {
                    Object obj;
                    ?? r4;
                    long jMax;
/* 5 */             Boolean boolValueOf = this.I00li1OI;
/* 7 */             if (boolValueOf == null) {
/* 17 */                boolValueOf = Boolean.valueOf(OOIloi.I00000oIO(this.I00iOIl, this.I00l0I0l0lO1));
/* 21 */                this.I00li1OI = boolValueOf;
                    }
/* 27 */            if (!boolValueOf.booleanValue()) {
/* 37 */                IIi0oIl.I000II().I000OOo1O(I00o0iI0io1, "Ignoring schedule request in a secondary process");
/* 40 */                return;
                    }
/* 44 */            if (!this.I00iio) {
/* 48 */                this.I00io1l.I00000oIO(this);
/* 51 */                this.I00iio = true;
                    }
/* 55 */            HashSet hashSet = new HashSet();
/* 60 */            HashSet hashSet2 = new HashSet();
/* 63 */            int length = workSpecArr.length;
/* 65 */            int i = 0;
                    while (true) {
/* 66 */                obj = null;
/* 67 */                if (i >= length) {
                            break;
                        }
/* 69 */                WorkSpec workSpec = workSpecArr[i];
/* 81 */                if (!this.I00ilO0.I0010o(liIOI1iO.I00000oIO(workSpec))) {
                            synchronized (this.I00ilI0I1) {
                                try {
/* 88 */                            i01IIlI i01iiliI00000oIO = liIOI1iO.I00000oIO(workSpec);
/* 98 */                            Io10i00 io10i00 = (Io10i00) this.I00l0OO0IO.get(i01iiliI00000oIO);
/* 100 */                           if (io10i00 == null) {
/* 104 */                               int i2 = workSpec.runAttemptCount;
/* 110 */                               this.I00l0I0l0lO1.I0000O.getClass();
/* 113 */                               long jCurrentTimeMillis = System.currentTimeMillis();
/* 117 */                               io10i00 = new Io10i00();
/* 120 */                               io10i00.I00000oIO = i2;
/* 122 */                               io10i00.I00000oOI = jCurrentTimeMillis;
/* 124 */                               VarHandle.storeStoreFence();
/* 129 */                               this.I00l0OO0IO.put(i01iiliI00000oIO, io10i00);
                                    }
/* 153 */                           jMax = (Math.max((workSpec.runAttemptCount - io10i00.I00000oIO) - 5, 0) * 30000) + io10i00.I00000oOI;
                                } finally {
                                }
                            }
/* 159 */                   long jMax2 = Math.max(workSpec.calculateNextRunTime(), jMax);
/* 167 */                   this.I00l0I0l0lO1.I0000O.getClass();
/* 170 */                   long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 178 */                   if (workSpec.state == i01IOiO1lO.I00iOIl) {
/* 182 */                       if (jCurrentTimeMillis2 < jMax2) {
/* 184 */                           IiIilii1I iiIilii1I = this.I00iiO;
/* 186 */                           if (iiIilii1I != null) {
/* 188 */                               Oi00IilOloo0 oi00IilOloo0 = iiIilii1I.I00000oOI;
/* 190 */                               HashMap map = iiIilii1I.I0000O;
/* 198 */                               Runnable runnable = (Runnable) map.remove(workSpec.id);
/* 200 */                               if (runnable != null) {
/* 206 */                                   ((Handler) oi00IilOloo0.I00iOIl).removeCallbacks(runnable);
                                        }
/* 211 */                               iooili01 iooili01Var = new iooili01(1);
/* 214 */                               iooili01Var.I00iiO = iiIilii1I;
/* 216 */                               iooili01Var.I00iiI = workSpec;
/* 218 */                               VarHandle.storeStoreFence();
/* 223 */                               map.put(workSpec.id, iooili01Var);
/* 228 */                               iiIilii1I.I0000Il00O.getClass();
/* 240 */                               ((Handler) oi00IilOloo0.I00iOIl).postDelayed(iooili01Var, jMax2 - System.currentTimeMillis());
                                    }
                                } else if (workSpec.hasConstraints()) {
/* 250 */                           IOo0o10i1IO iOo0o10i1IO = workSpec.constraints;
/* 254 */                           if (iOo0o10i1IO.I0000O) {
/* 256 */                               IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 260 */                               workSpec.toString();
/* 263 */                               iIi0oIlI000II.getClass();
                                    } else if (iOo0o10i1IO.I00000oOI()) {
/* 273 */                               IIi0oIl iIi0oIlI000II2 = IIi0oIl.I000II();
/* 277 */                               workSpec.toString();
/* 280 */                               iIi0oIlI000II2.getClass();
                                    } else {
/* 284 */                               hashSet.add(workSpec);
/* 289 */                               hashSet2.add(workSpec.id);
                                    }
                                } else if (!this.I00ilO0.I0010o(liIOI1iO.I00000oIO(workSpec))) {
/* 309 */                           IIi0oIl.I000II().getClass();
/* 312 */                           IoloOio0I ioloOio0I = this.I00ilO0;
/* 314 */                           ioloOio0I.getClass();
/* 321 */                           OlO0000lIOII olO0000lIOIII00OIl = ioloOio0I.I00OIl(liIOI1iO.I00000oIO(workSpec));
/* 327 */                           this.I00lll10.I001lIiIIo1O(olO0000lIOIII00OIl);
/* 332 */                           this.I00ioIO.I0000O(olO0000lIOIII00OIl, null);
                                }
                            }
                        }
/* 335 */               i++;
                    }
                    synchronized (this.I00ilI0I1) {
                        try {
/* 348 */                   if (!hashSet.isEmpty()) {
/* 352 */                       TextUtils.join(",", hashSet2);
/* 359 */                       IIi0oIl.I000II().getClass();
/* 362 */                       Iterator it = hashSet.iterator();
/* 370 */                       while (it.hasNext()) {
/* 377 */                           WorkSpec workSpec2 = (WorkSpec) it.next();
/* 379 */                           i01IIlI i01iiliI00000oIO2 = liIOI1iO.I00000oIO(workSpec2);
/* 389 */                           if (this.I00iiI.containsKey(i01iiliI00000oIO2)) {
/* 427 */                               r4 = obj;
                                    } else {
/* 391 */                               OlIOOOoi0IlI olIOOOoi0IlI = this.I00ll1;
/* 399 */                               Ii00lIOoi ii00lIOoi = (Ii00lIOoi) ((OillOo0) this.I00lli11).I00iiO;
/* 401 */                               int i3 = i01I01lIOo.I00000oIO;
/* 410 */                               r4 = obj;
/* 421 */                               this.I00iiI.put(i01iiliI00000oIO2, iOi1II01i0.I0000O(il001oo1.I00000oIO(ii00lIOoi), r4, r4, new i00Iooii0i(olIOOOoi0IlI, workSpec2, this, r4, 1), 3));
                                    }
/* 428 */                           obj = r4;
                                }
                            }
                        } finally {
                        }
                    }
                }

                @Override
                public final void I0000Il00O(i01IIlI i01iili, boolean z) {
                    O010OIi o010OIi;
/* 3 */             OlO0000lIOII olO0000lIOIII00O10llo = this.I00ilO0.I00O10llo(i01iili);
/* 7 */             if (olO0000lIOIII00O10llo != null) {
/* 11 */                this.I00lll10.I000o00OoI0I(olO0000lIOIII00O10llo);
                    }
                    synchronized (this.I00ilI0I1) {
/* 23 */                o010OIi = (O010OIi) this.I00iiI.remove(i01iili);
                    }
/* 26 */            if (o010OIi != null) {
/* 28 */                IIi0oIl iIi0oIlI000II = IIi0oIl.I000II();
/* 32 */                Objects.toString(i01iili);
/* 35 */                iIi0oIlI000II.getClass();
/* 39 */                o010OIi.I000II(null);
                    }
/* 42 */            if (z) {
/* 57 */                return;
                    }
                    synchronized (this.I00ilI0I1) {
/* 49 */                this.I00l0OO0IO.remove(i01iili);
                    }
                }

                @Override
                public final boolean I0000O() {
/* 1 */             return false;
                }

                @Override
                public final void I0000oI00(String str) {
                    List<OlO0000lIOII> listI00O0o1oo;
                    Runnable runnable;
/* 1 */             Boolean boolValueOf = this.I00li1OI;
/* 3 */             if (boolValueOf == null) {
/* 13 */                boolValueOf = Boolean.valueOf(OOIloi.I00000oIO(this.I00iOIl, this.I00l0I0l0lO1));
/* 17 */                this.I00li1OI = boolValueOf;
                    }
/* 23 */            if (!boolValueOf.booleanValue()) {
/* 33 */                IIi0oIl.I000II().I000OOo1O(I00o0iI0io1, "Ignoring schedule request in non-main process");
/* 36 */                return;
                    }
/* 39 */            if (!this.I00iio) {
/* 43 */                this.I00io1l.I00000oIO(this);
/* 47 */                this.I00iio = true;
                    }
/* 53 */            IIi0oIl.I000II().getClass();
/* 56 */            IiIilii1I iiIilii1I = this.I00iiO;
/* 58 */            if (iiIilii1I != null && (runnable = (Runnable) iiIilii1I.I0000O.remove(str)) != null) {
/* 76 */                ((Handler) iiIilii1I.I00000oOI.I00iOIl).removeCallbacks(runnable);
                    }
/* 79 */            IoloOio0I ioloOio0I = this.I00ilO0;
                    synchronized (ioloOio0I.I00iiO) {
/* 88 */                listI00O0o1oo = ((IIloOI) ioloOio0I.I00iiI).I00O0o1oo(str);
                    }
/* 101 */           for (OlO0000lIOII olO0000lIOII : listI00O0o1oo) {
/* 111 */               this.I00lll10.I000o00OoI0I(olO0000lIOII);
/* 118 */               this.I00ioIO.I0000oI00(olO0000lIOII, -512);
                    }
                }
            }
