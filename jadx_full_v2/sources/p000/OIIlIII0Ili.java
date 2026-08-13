            package p000;

            import android.graphics.Paint;
            import android.view.ViewParent;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.Reference;
            import java.lang.ref.ReferenceQueue;
            import java.lang.ref.WeakReference;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
/* 18 */    public abstract class OIIlIII0Ili extends O1IiO0l implements O1iIo0ll, O0iOOo0Ii {
                public static final OI1lOo I0110o = new OI1lOo(7);
                public static final OI1lOo I0111i = new OI1lOo(8);
                public static final Oi11lOiIoi I011IO1I11OI = new Oi11lOiIoi();
                public static final O0iOIliOil0 I011IOil = new O0iOIliOil0();
                public static final float[] I011Ill = O1i010l1l.I00000oOI();
                public static final OIIlI0 I011Io0I1ioi = new OIIlI0();
                public static final loilIl10Ii I011Ol0 = new loilIl10Ii(13);
                public final O0iiOioolIi I00oO101o;
                public boolean I00oOio10iI1;
                public boolean I00ol1;
                public OIIlIII0Ili I00olI;
                public OIIlIII0Ili I00oli;
                public boolean I00oliIiO01i;
                public boolean I00oo1iO0ll;
                public Function1 I00ooIo0;
                public IiIooOOOI I00ooiO1I;
                public O0iOOoiioO I00oooO;
                public O1iOIo0o0 I0100o111I;
                public OI0o11I1 I010101Oo1lO;
                public float I010II;
                public II1i0i0ilO I010OIo1l;
                public O0iOIliOil0 I010i10l;
                public boolean I010l10O;
                public boolean I010l1O;
                public Io10IOI I010l1ol111;
                public IIolOo I010lI0oi;
                public O1oiiIIo111o I010o0o0oO;
                public final OIIl1io I010oio1OO0;
                public boolean I01101IOlO;
                public OIlIooO I01101olii;
                public Io10IOI I0110OiO;
                public float I0100i = 0.8f;
                public long I010I0 = 0;
                public OioOIi1o0I I010iIIOlo = iO0ioilo.I00000oIO;
                public OOo0IO I010ioo = OOo0IO.I0000oI00;

                public OIIlIII0Ili(O0iiOioolIi o0iiOioolIi) {
/* 4 */             this.I00oO101o = o0iiOioolIi;
/* 8 */             this.I00ooiO1I = o0iiOioolIi.I00oliIiO01i;
/* 12 */            this.I00oooO = o0iiOioolIi.I00oo1iO0ll;
/* 34 */            OIIl1io oIIl1io = new OIIl1io(1);
/* 37 */            oIIl1io.I00iiI = this;
/* 39 */            VarHandle.storeStoreFence();
/* 42 */            this.I010oio1OO0 = oIIl1io;
                }

                public static OIIlIII0Ili I01Ii0ll10O(O0iOOo0Ii o0iOOo0Ii) {
                    OIIlIII0Ili oIIlIII0Ili;
/* 9 */             O1Iil010i10 o1Iil010i10 = o0iOOo0Ii instanceof O1Iil010i10 ? (O1Iil010i10) o0iOOo0Ii : null;
                    return (o1Iil010i10 == null || (oIIlIII0Ili = o1Iil010i10.I00iOIl.I00oO101o) == null) ? (OIIlIII0Ili) o0iOOo0Ii : oIIlIII0Ili;
                }

                @Override
                public final float I00000oIO() {
/* 5 */             return this.I00oO101o.I00oliIiO01i.I00000oIO();
                }

                @Override
                public final long I0000O(long j) {
/* 1 */             long jI00Iooi00oi = I00Iooi00oi(j);
/* 11 */            I0lio1O01i01 i0lio1O01i01 = (I0lio1O01i01) O0iillo1ol0.I00000oIO(this.I00oO101o);
/* 13 */            i0lio1O01i01.I001lIiIIo1O();
/* 18 */            return O1i010l1l.I0000Il00O(jI00Iooi00oi, i0lio1O01i01.I01101olii);
                }

                @Override
                public final void I000OOo1O(float[] fArr) {
/* 3 */             OIlO000O01 oIlO000O01I00000oIO = O0iillo1ol0.I00000oIO(this.I00oO101o);
/* 11 */            OIIlIII0Ili oIIlIII0IliI01Ii0ll10O = I01Ii0ll10O(l0o0IlOil1.I0000Il00O(this));
/* 15 */            I01IlIoOI(oIIlIII0IliI01Ii0ll10O, fArr);
/* 20 */            if (oIlO000O01I00000oIO instanceof I0lio1O01i01) {
/* 24 */                ((I0lio1O01i01) oIlO000O01I00000oIO).I00100l0(fArr);
/* 27 */                return;
                    }
/* 30 */            long jI001l0I00 = oIIlIII0IliI01Ii0ll10O.I001l0I00(0L);
/* 47 */            if ((9223372034707292159L & jI001l0I00) != 9205357640488583168L) {
/* 69 */                O1i010l1l.I000O01llI0(fArr, Float.intBitsToFloat((int) (jI001l0I00 >> 32)), Float.intBitsToFloat((int) (jI001l0I00 & 4294967295L)));
                    }
                }

                @Override
                public final void I000OiO(O0iOOo0Ii o0iOOo0Ii, float[] fArr) {
/* 1 */             OIIlIII0Ili oIIlIII0IliI01Ii0ll10O = I01Ii0ll10O(o0iOOo0Ii);
/* 5 */             oIIlIII0IliI01Ii0ll10O.I011iO();
/* 8 */             OIIlIII0Ili oIIlIII0IliI010lI0oi = I010lI0oi(oIIlIII0IliI01Ii0ll10O);
/* 12 */            O1i010l1l.I0000oI00(fArr);
/* 15 */            oIIlIII0IliI01Ii0ll10O.I01IlIoOI(oIIlIII0IliI010lI0oi, fArr);
/* 18 */            I01Iio10lo(oIIlIII0IliI010lI0oi, fArr);
                }

                @Override
                public final long I000iOII() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final boolean I0010o() {
/* 5 */             return I0110OiO().I00lll10;
                }

                @Override
                public final boolean I001IIilI0O() {
                    return (this.I01101olii == null || this.I00oliIiO01i || !this.I00oO101o.I00Io1lO()) ? false : true;
                }

                @Override
                public final long I001l0I00(long j) {
/* 7 */             if (!I0110OiO().I00lll10) {
/* 11 */                IolioOO1.I0000Il00O("LayoutCoordinate operations are only valid when isAttached is true");
                    }
/* 26 */            return ((I0lio1O01i01) O0iillo1ol0.I00000oIO(this.I00oO101o)).I00100o1O0lo(I00Iooi00oi(j));
                }

                @Override
                public final long I001lloI(long j) {
/* 7 */             if (!I0110OiO().I00lll10) {
/* 11 */                IolioOO1.I0000Il00O("LayoutCoordinate operations are only valid when isAttached is true");
                    }
/* 14 */            O0iOOo0Ii o0iOOo0IiI0000Il00O = l0o0IlOil1.I0000Il00O(this);
/* 24 */            I0lio1O01i01 i0lio1O01i01 = (I0lio1O01i01) O0iillo1ol0.I00000oIO(this.I00oO101o);
/* 26 */            i0lio1O01i01.I001lIiIIo1O();
/* 46 */            return I00O0i0ii(o0iOOo0IiI0000Il00O, OIOlIiiioi.I0001Ioi1lo(O1i010l1l.I0000Il00O(j, i0lio1O01i01.I0110OiO), o0iOOo0IiI0000Il00O.I00Iooi00oi(0L)), true);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v12 */
                /* JADX WARN: Type inference failed for: r4v13 */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v3, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r4v5 */
                /* JADX WARN: Type inference failed for: r4v6, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v8 */
                /* JADX WARN: Type inference failed for: r4v9 */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v8 */
                /* JADX WARN: Type inference failed for: r5v9 */
                @Override
                public final Object I00II0Ol1O0l() {
/* 1 */             O0iiOioolIi o0iiOioolIi = this.I00oO101o;
/* 12 */            if (!o0iiOioolIi.I010101Oo1lO.I000iOII(64)) {
/* 11 */                return null;
                    }
/* 14 */            I0110OiO();
/* 23 */            Object objI001iOo1i0O = null;
/* 24 */            for (O1ooOo o1ooOo = (Olo11IOO) o0iiOioolIi.I010101Oo1lO.I00ilO0; o1ooOo != null; o1ooOo = o1ooOo.I00ilI0I1) {
/* 29 */                if ((o1ooOo.I00iiO & 64) != 0) {
/* 31 */                    IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOo;
/* 32 */                    ?? oi110o0 = 0;
/* 33 */                    while (iiIioO0ol1oII0000Il00O != 0) {
/* 37 */                        if (iiIioO0ol1oII0000Il00O instanceof OO0101O11i) {
/* 43 */                            objI001iOo1i0O = ((OO0101O11i) iiIioO0ol1oII0000Il00O).I001iOo1i0O(o0iiOioolIi.I00oliIiO01i, objI001iOo1i0O);
                                } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 64) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 60 */                            O1ooOo o1ooOo2 = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 62 */                            int i = 0;
                                    iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                    oi110o0 = oi110o0;
/* 64 */                            while (o1ooOo2 != null) {
/* 69 */                                if ((o1ooOo2.I00iiO & 64) != 0) {
/* 71 */                                    i++;
                                            oi110o0 = oi110o0;
/* 73 */                                    if (i == 1) {
/* 75 */                                        iiIioO0ol1oII0000Il00O = o1ooOo2;
                                            } else {
/* 77 */                                        if (oi110o0 == 0) {
/* 85 */                                            oi110o0 = new OI110O0(new O1ooOo[16]);
                                                }
/* 88 */                                        if (iiIioO0ol1oII0000Il00O != 0) {
/* 90 */                                            oi110o0.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 93 */                                            iiIioO0ol1oII0000Il00O = 0;
                                                }
/* 94 */                                        oi110o0.I00000oOI(o1ooOo2);
                                            }
                                        }
/* 97 */                                o1ooOo2 = o1ooOo2.I00ilO0;
                                        iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                        oi110o0 = oi110o0;
                                    }
/* 100 */                           if (i == 1) {
                                    }
                                }
/* 103 */                       iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                            }
                        }
                    }
/* 111 */           return objI001iOo1i0O;
                }

                @Override
                public final O0iOOo0Ii I00II0oii1o() {
/* 5 */             boolean z = I0110OiO().I00lll10;
/* 7 */             O0iiOioolIi o0iiOioolIi = this.I00oO101o;
/* 9 */             if (!z) {
/* 15 */                StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
/* 19 */                for (O0iiOioolIi o0iiOioolIiI001IO000 = o0iiOioolIi; o0iiOioolIiI001IO000 != null; o0iiOioolIiI001IO000 = o0iiOioolIiI001IO000.I001IO000()) {
/* 23 */                    sb.append("\n|");
/* 26 */                    sb.append(o0iiOioolIiI001IO000);
/* 31 */                    sb.append(" isAttached=");
/* 38 */                    sb.append(o0iiOioolIiI001IO000.I00Io1lO());
/* 43 */                    sb.append(" modifier=");
/* 48 */                    sb.append(o0iiOioolIiI001IO000.I010iIIOlo);
/* 53 */                    sb.append(" tail=");
/* 60 */                    sb.append(I0110OiO());
                        }
/* 72 */                IolioOO1.I0000Il00O(sb.toString());
                    }
/* 75 */            I011iO();
/* 84 */            return ((OIIlIII0Ili) o0iiOioolIi.I010101Oo1lO.I00ilI0I1).I00oli;
                }

                @Override
                public final long I00IoIO0lI(O0iOOo0Ii o0iOOo0Ii, long j) {
/* 2 */             return I00O0i0ii(o0iOOo0Ii, j, true);
                }

                @Override
                public final long I00IoO0(long j) {
/* 7 */             if (!I0110OiO().I00lll10) {
/* 11 */                IolioOO1.I0000Il00O("LayoutCoordinate operations are only valid when isAttached is true");
                    }
/* 31 */            return I00O0i0ii(l0o0IlOil1.I0000Il00O(this), ((I0lio1O01i01) O0iillo1ol0.I00000oIO(this.I00oO101o)).I00IO1(j), true);
                }

                @Override
                public final OOo0IO I00IoiI(O0iOOo0Ii o0iOOo0Ii, boolean z) {
/* 7 */             if (!I0110OiO().I00lll10) {
/* 11 */                IolioOO1.I0000Il00O("LayoutCoordinate operations are only valid when isAttached is true");
                    }
/* 18 */            if (!o0iOOo0Ii.I0010o()) {
/* 39 */                IolioOO1.I0000Il00O("LayoutCoordinates " + o0iOOo0Ii + " is not attached!");
                    }
/* 42 */            OIIlIII0Ili oIIlIII0IliI01Ii0ll10O = I01Ii0ll10O(o0iOOo0Ii);
/* 46 */            oIIlIII0IliI01Ii0ll10O.I011iO();
/* 49 */            OIIlIII0Ili oIIlIII0IliI010lI0oi = I010lI0oi(oIIlIII0IliI01Ii0ll10O);
/* 53 */            II1i0i0ilO iI1i0i0ilO = this.I010OIo1l;
/* 55 */            if (iI1i0i0ilO == null) {
/* 59 */                iI1i0i0ilO = new II1i0i0ilO();
/* 62 */                this.I010OIo1l = iI1i0i0ilO;
                    }
/* 65 */            iI1i0i0ilO.I00000oOI = 0.0f;
/* 67 */            iI1i0i0ilO.I0000Il00O = 0.0f;
/* 78 */            iI1i0i0ilO.I0000O = (int) (o0iOOo0Ii.I000iOII() >> 32);
/* 92 */            iI1i0i0ilO.I0000oI00 = (int) (o0iOOo0Ii.I000iOII() & 4294967295L);
/* 94 */            while (oIIlIII0IliI01Ii0ll10O != oIIlIII0IliI010lI0oi) {
/* 97 */                oIIlIII0IliI01Ii0ll10O.I01I1Oo0oll(iI1i0i0ilO, z, false);
/* 104 */               if (iI1i0i0ilO.I00000oOI()) {
/* 106 */                   return OOo0IO.I0000oI00;
                        }
/* 109 */               oIIlIII0IliI01Ii0ll10O = oIIlIII0IliI01Ii0ll10O.I00oli;
                    }
/* 112 */           I010OIo1l(oIIlIII0IliI010lI0oi, iI1i0i0ilO, z);
/* 125 */           return new OOo0IO(iI1i0i0ilO.I00000oOI, iI1i0i0ilO.I0000Il00O, iI1i0i0ilO.I0000O, iI1i0i0ilO.I0000oI00);
                }

                @Override
                public final long I00Iooi00oi(long j) {
/* 7 */             if (!I0110OiO().I00lll10) {
/* 11 */                IolioOO1.I0000Il00O("LayoutCoordinate operations are only valid when isAttached is true");
                    }
/* 14 */            I011iO();
/* 17 */            while (this != null) {
/* 19 */                O0iiOioolIi o0iiOioolIi = this.I00oO101o;
/* 27 */                if (this == ((OIIlIII0Ili) o0iiOioolIi.I010101Oo1lO.I00ilI0I1) && !o0iiOioolIi.I00iiO) {
/* 43 */                    long jI00000oOI = ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).getRectManager().I00000oOI(o0iiOioolIi);
/* 56 */                    if (!IooO0O.I0000Il00O(jI00000oOI, 9223372034707292159L)) {
/* 58 */                        return ioolillioIIO.I00000oIO(j, jI00000oOI);
                            }
                        }
/* 63 */                OIlIooO oIlIooO = this.I01101olii;
/* 65 */                if (oIlIooO != null) {
/* 67 */                    Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooO;
/* 69 */                    float[] fArrI00000oOI = io10OIiiOll.I00000oOI();
/* 75 */                    if (!io10OIiiOll.I00oII) {
/* 78 */                        j = O1i010l1l.I0000Il00O(j, fArrI00000oOI);
                            }
                        }
/* 84 */                j = ioolillioIIO.I00000oIO(j, this.I010I0);
/* 88 */                this = this.I00oli;
                    }
/* 168 */           return j;
                }

                @Override
                public final long I00O0i0ii(O0iOOo0Ii o0iOOo0Ii, long j, boolean z) {
/* 3 */             if (o0iOOo0Ii instanceof O1Iil010i10) {
/* 5 */                 O1Iil010i10 o1Iil010i10 = (O1Iil010i10) o0iOOo0Ii;
/* 11 */                o1Iil010i10.I00iOIl.I00oO101o.I011iO();
/* 24 */                return o1Iil010i10.I00O0i0ii(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
                    }
/* 26 */            OIIlIII0Ili oIIlIII0IliI01Ii0ll10O = I01Ii0ll10O(o0iOOo0Ii);
/* 30 */            oIIlIII0IliI01Ii0ll10O.I011iO();
/* 33 */            OIIlIII0Ili oIIlIII0IliI010lI0oi = I010lI0oi(oIIlIII0IliI01Ii0ll10O);
/* 37 */            while (oIIlIII0IliI01Ii0ll10O != oIIlIII0IliI010lI0oi) {
/* 39 */                OIlIooO oIlIooO = oIIlIII0IliI01Ii0ll10O.I01101olii;
/* 41 */                if (oIlIooO != null) {
/* 43 */                    Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooO;
/* 45 */                    float[] fArrI00000oOI = io10OIiiOll.I00000oOI();
/* 51 */                    if (!io10OIiiOll.I00oII) {
/* 54 */                        j = O1i010l1l.I0000Il00O(j, fArrI00000oOI);
                            }
                        }
/* 58 */                if (z || !oIIlIII0IliI01Ii0ll10O.I00ll1) {
/* 67 */                    j = ioolillioIIO.I00000oIO(j, oIIlIII0IliI01Ii0ll10O.I010I0);
                        }
/* 71 */                oIIlIII0IliI01Ii0ll10O = oIIlIII0IliI01Ii0ll10O.I00oli;
                    }
/* 74 */            return I010i10l(oIIlIII0IliI010lI0oi, j, z);
                }

                @Override
                public final float I00Ol00() {
/* 5 */             return this.I00oO101o.I00oliIiO01i.I00Ol00();
                }

                @Override
                public abstract void I00iIO(long j, float f, Io10IOI io10IOI);

                @Override
                public final O1IiO0l I00o0iI0io1() {
/* 1 */             return this.I00olI;
                }

                @Override
                public final boolean I00oOio10iI1() {
                    return this.I0100o111I != null;
                }

                @Override
                public final O0iiOioolIi I00olI() {
/* 1 */             return this.I00oO101o;
                }

                @Override
                public final O1iOIo0o0 I00ooIo0() {
/* 1 */             O1iOIo0o0 o1iOIo0o0 = this.I0100o111I;
/* 3 */             if (o1iOIo0o0 != null) {
/* 5 */                 return o1iOIo0o0;
                    }
/* 8 */             I000II.I001IO000("Asking for measurement result of unmeasured layout modifier");
/* 11 */            return null;
                }

                @Override
                public final O1IiO0l I00ooiO1I() {
/* 1 */             return this.I00oli;
                }

                @Override
                public final long I00oooO() {
/* 1 */             return this.I010I0;
                }

                @Override
                public final void I010I0() {
/* 1 */             Io10IOI io10IOI = this.I0110OiO;
/* 3 */             long j = this.I010I0;
/* 5 */             if (io10IOI != null) {
/* 9 */                 I00iIO(j, this.I010II, io10IOI);
                    } else {
/* 17 */                I00iIi0i1o(j, this.I010II, this.I00ooIo0);
                    }
                }

                public final void I010OIo1l(OIIlIII0Ili oIIlIII0Ili, II1i0i0ilO iI1i0i0ilO, boolean z) {
/* 1 */             if (oIIlIII0Ili == this) {
/* 98 */                return;
                    }
/* 4 */             OIIlIII0Ili oIIlIII0Ili2 = this.I00oli;
/* 6 */             if (oIIlIII0Ili2 != null) {
/* 8 */                 oIIlIII0Ili2.I010OIo1l(oIIlIII0Ili, iI1i0i0ilO, z);
                    }
/* 11 */            long j = this.I010I0;
/* 17 */            float f = (int) (j >> 32);
                    iI1i0i0ilO.I00000oOI -= f;
                    iI1i0i0ilO.I0000O -= f;
/* 35 */            float f2 = (int) (j & 4294967295L);
                    iI1i0i0ilO.I0000Il00O -= f2;
                    iI1i0i0ilO.I0000oI00 -= f2;
/* 47 */            OIlIooO oIlIooO = this.I01101olii;
/* 49 */            if (oIlIooO != null) {
/* 51 */                Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooO;
/* 53 */                float[] fArrI00000oIO = io10OIiiOll.I00000oIO();
/* 60 */                if (!io10OIiiOll.I00oII) {
/* 62 */                    if (fArrI00000oIO == null) {
/* 64 */                        iI1i0i0ilO.I00000oOI = 0.0f;
/* 66 */                        iI1i0i0ilO.I0000Il00O = 0.0f;
/* 68 */                        iI1i0i0ilO.I0000O = 0.0f;
/* 70 */                        iI1i0i0ilO.I0000oI00 = 0.0f;
                            } else {
/* 73 */                        O1i010l1l.I0000O(fArrI00000oIO, iI1i0i0ilO);
                            }
                        }
/* 78 */                if (this.I00oo1iO0ll && z) {
/* 82 */                    long j2 = this.I00iiO;
/* 91 */                    iI1i0i0ilO.I00000oIO(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                        }
                    }
                }

                public final long I010i10l(OIIlIII0Ili oIIlIII0Ili, long j, boolean z) {
/* 1 */             if (oIIlIII0Ili == this) {
/* 3 */                 return j;
                    }
/* 4 */             OIIlIII0Ili oIIlIII0Ili2 = this.I00oli;
                    return (oIIlIII0Ili2 == null || O0000Ioio00.I0000O(oIIlIII0Ili, oIIlIII0Ili2)) ? I010o0o0oO(j, z) : I010o0o0oO(oIIlIII0Ili2.I010i10l(oIIlIII0Ili, j, z), z);
                }

                public final long I010iIIOlo(long j) {
                    float fI00Ol10;
                    float fI00Oio;
/* 7 */             if (this.I010ioo.I000II()) {
/* 9 */                 fI00Ol10 = I00Ol10();
                    } else {
/* 15 */                OOo0IO oOo0IO = this.I010ioo;
/* 21 */                fI00Ol10 = oOo0IO.I0000Il00O - oOo0IO.I00000oIO;
                    }
/* 29 */            if (this.I010ioo.I000II()) {
/* 31 */                fI00Oio = I00Oio();
                    } else {
/* 37 */                OOo0IO oOo0IO2 = this.I010ioo;
/* 43 */                fI00Oio = oOo0IO2.I0000O - oOo0IO2.I00000oOI;
                    }
/* 54 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fI00Ol10;
/* 66 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fI00Oio;
/* 71 */            float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
/* 76 */            float fMax2 = Math.max(0.0f, fIntBitsToFloat2 / 2.0f);
/* 94 */            return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
                }

                public final float I010ioo(long j, long j2) {
/* 24 */            if (I00Ol10() >= Float.intBitsToFloat((int) (j2 >> 32)) && I00Oio() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
/* 17 */                return Float.POSITIVE_INFINITY;
                    }
/* 43 */            long jI010iIIOlo = I010iIIOlo(j2);
/* 50 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (jI010iIIOlo >> 32));
/* 56 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI010iIIOlo & 4294967295L));
/* 63 */            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
/* 80 */            float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - I00Ol10());
/* 120 */           long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - I00Oio())) & 4294967295L);
/* 123 */           if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
/* 131 */               int i = (int) (jFloatToRawIntBits >> 32);
/* 138 */               if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
/* 141 */                   int i2 = (int) (jFloatToRawIntBits & 4294967295L);
/* 148 */                   if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
/* 150 */                       float fIntBitsToFloat4 = Float.intBitsToFloat(i);
/* 154 */                       float fIntBitsToFloat5 = Float.intBitsToFloat(i2);
/* 160 */                       return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat4 * fIntBitsToFloat4);
                            }
                        }
                    }
/* 17 */            return Float.POSITIVE_INFINITY;
                }

                public final void I010l10O(IIolOo iIolOo, Io10IOI io10IOI) {
/* 1 */             OIlIooO oIlIooO = this.I01101olii;
/* 3 */             if (oIlIooO == null) {
/* 41 */                long j = this.I010I0;
/* 47 */                float f = (int) (j >> 32);
/* 55 */                float f2 = (int) (j & 4294967295L);
/* 57 */                iIolOo.I000o00OoI0I(f, f2);
/* 60 */                I010l1O(iIolOo, io10IOI);
/* 65 */                iIolOo.I000o00OoI0I(-f, -f2);
/* 106 */               return;
                    }
/* 5 */             Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooO;
/* 7 */             IIolilIo iIolilIo = io10OIiiOll.I00lli11;
/* 9 */             io10OIiiOll.I000II();
/* 26 */            io10OIiiOll.I00oIiI10 = io10OIiiOll.I00iOIl.I00000oIO.I00100l0 > 0.0f;
/* 28 */            IOO000ilo iOO000ilo = iIolilIo.I00iiI;
/* 30 */            iOO000ilo.I00IOO(iIolOo);
/* 33 */            iOO000ilo.I00iiO = io10IOI;
/* 37 */            illII1oO.I00000oIO(iIolilIo, io10OIiiOll.I00iOIl);
                }

                public final void I010l1O(IIolOo iIolOo, Io10IOI io10IOI) {
                    OIIlIII0Ili oIIlIII0Ili;
                    IIolOo iIolOo2;
                    Io10IOI io10IOI2;
/* 2 */             O1ooOo o1ooOoI0110o = I0110o(4);
/* 6 */             if (o1ooOoI0110o == null) {
/* 8 */                 I01I01Oolii(iIolOo, io10IOI);
/* 11 */                return;
                    }
/* 12 */            O0iiOioolIi o0iiOioolIi = this.I00oO101o;
/* 14 */            o0iiOioolIi.getClass();
/* 23 */            O0iiliOio sharedDrawScope = ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).getSharedDrawScope();
/* 29 */            long jI00000oOI = l000O1l.I00000oOI(this.I00iiO);
/* 33 */            sharedDrawScope.getClass();
/* 37 */            OI110O0 oi110o0 = null;
/* 38 */            while (o1ooOoI0110o != null) {
/* 42 */                if (o1ooOoI0110o instanceof Iillo1il11l) {
/* 47 */                    oIIlIII0Ili = this;
/* 48 */                    iIolOo2 = iIolOo;
/* 49 */                    io10IOI2 = io10IOI;
/* 50 */                    sharedDrawScope.I0000Il00O(iIolOo2, jI00000oOI, oIIlIII0Ili, (Iillo1il11l) o1ooOoI0110o, io10IOI2);
                        } else {
/* 54 */                    oIIlIII0Ili = this;
/* 55 */                    iIolOo2 = iIolOo;
/* 56 */                    io10IOI2 = io10IOI;
/* 60 */                    if ((o1ooOoI0110o.I00iiO & 4) != 0 && (o1ooOoI0110o instanceof IiIioO0ol1oI)) {
/* 71 */                        int i = 0;
/* 73 */                        for (O1ooOo o1ooOo = ((IiIioO0ol1oI) o1ooOoI0110o).I00o0l1o1o0; o1ooOo != null; o1ooOo = o1ooOo.I00ilO0) {
/* 78 */                            if ((o1ooOo.I00iiO & 4) != 0) {
/* 80 */                                i++;
/* 82 */                                if (i == 1) {
/* 84 */                                    o1ooOoI0110o = o1ooOo;
                                        } else {
/* 86 */                                    if (oi110o0 == null) {
/* 94 */                                        oi110o0 = new OI110O0(new O1ooOo[16]);
                                            }
/* 97 */                                    if (o1ooOoI0110o != null) {
/* 99 */                                        oi110o0.I00000oOI(o1ooOoI0110o);
/* 102 */                                       o1ooOoI0110o = null;
                                            }
/* 103 */                                   oi110o0.I00000oOI(o1ooOo);
                                        }
                                    }
                                }
/* 109 */                       if (i == 1) {
                                }
                            }
/* 111 */                   iIolOo = iIolOo2;
/* 112 */                   this = oIIlIII0Ili;
/* 113 */                   io10IOI = io10IOI2;
                        }
/* 115 */               o1ooOoI0110o = il0lI1i1olii.I0000Il00O(oi110o0);
/* 111 */               iIolOo = iIolOo2;
/* 112 */               this = oIIlIII0Ili;
/* 113 */               io10IOI = io10IOI2;
                    }
                }

                public abstract void I010l1ol111();

                public final OIIlIII0Ili I010lI0oi(OIIlIII0Ili oIIlIII0Ili) {
/* 1 */             O0iiOioolIi o0iiOioolIiI001IO000 = oIIlIII0Ili.I00oO101o;
/* 3 */             O0iiOioolIi o0iiOioolIi = this.I00oO101o;
/* 5 */             if (o0iiOioolIiI001IO000 == o0iiOioolIi) {
/* 7 */                 O1ooOo o1ooOoI0110OiO = oIIlIII0Ili.I0110OiO();
/* 11 */                O1ooOo o1ooOoI0110OiO2 = I0110OiO();
/* 19 */                if (!o1ooOoI0110OiO2.I00iOIl.I00lll10) {
/* 23 */                    IolioOO1.I0000Il00O("visitLocalAncestors called on an unattached node");
                        }
/* 30 */                for (O1ooOo o1ooOo = o1ooOoI0110OiO2.I00iOIl.I00ilI0I1; o1ooOo != null; o1ooOo = o1ooOo.I00ilI0I1) {
/* 36 */                    if ((o1ooOo.I00iiO & 2) != 0 && o1ooOo == o1ooOoI0110OiO) {
/* 96 */                        return oIIlIII0Ili;
                            }
                        }
/* 91 */                return this;
                    }
/* 48 */            while (o0iiOioolIiI001IO000.I00o101lO > o0iiOioolIi.I00o101lO) {
/* 50 */                o0iiOioolIiI001IO000 = o0iiOioolIiI001IO000.I001IO000();
                    }
/* 55 */            O0iiOioolIi o0iiOioolIiI001IO0002 = o0iiOioolIi;
/* 60 */            while (o0iiOioolIiI001IO0002.I00o101lO > o0iiOioolIiI001IO000.I00o101lO) {
/* 62 */                o0iiOioolIiI001IO0002 = o0iiOioolIiI001IO0002.I001IO000();
                    }
/* 67 */            while (o0iiOioolIiI001IO000 != o0iiOioolIiI001IO0002) {
/* 69 */                o0iiOioolIiI001IO000 = o0iiOioolIiI001IO000.I001IO000();
/* 73 */                o0iiOioolIiI001IO0002 = o0iiOioolIiI001IO0002.I001IO000();
/* 77 */                if (o0iiOioolIiI001IO000 == null || o0iiOioolIiI001IO0002 == null) {
/* 84 */                    I000II.I000iOII("layouts are not part of the same hierarchy");
/* 87 */                    return null;
                        }
                    }
/* 89 */            if (o0iiOioolIiI001IO0002 != o0iiOioolIi) {
/* 94 */                if (o0iiOioolIiI001IO000 != oIIlIII0Ili.I00oO101o) {
/* 101 */                   return (Iollol0oI) o0iiOioolIiI001IO000.I010101Oo1lO.I00iio;
                        }
/* 96 */                return oIIlIII0Ili;
                    }
/* 91 */            return this;
                }

                public final long I010o0o0oO(long j, boolean z) {
/* 1 */             if (z || !this.I00ll1) {
/* 8 */                 long j2 = this.I010I0;
/* 23 */                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
/* 38 */                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
/* 51 */                j = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                    }
/* 52 */            OIlIooO oIlIooO = this.I01101olii;
/* 54 */            if (oIlIooO != null) {
/* 56 */                Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooO;
/* 58 */                float[] fArrI00000oIO = io10OIiiOll.I00000oIO();
/* 62 */                if (fArrI00000oIO == null) {
/* 64 */                    return 9187343241974906880L;
                        }
/* 72 */                if (!io10OIiiOll.I00oII) {
/* 75 */                    return O1i010l1l.I0000Il00O(j, fArrI00000oIO);
                        }
                    }
/* 106 */           return j;
                }

                public final IlliIl1l11O I010oio1OO0() {
/* 1 */             O1oiiIIo111o o1oiiIIo111o = this.I010o0o0oO;
/* 3 */             if (o1oiiIIo111o != null) {
/* 55 */                return o1oiiIIo111o;
                    }
/* 8 */             OIIl1io oIIl1io = new OIIl1io(0);
/* 11 */            oIIl1io.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 19 */            O1oiiIIo111o o1oiiIIo111o2 = new O1oiiIIo111o(2);
/* 22 */            o1oiiIIo111o2.I00iiI = this;
/* 24 */            o1oiiIIo111o2.I00iiO = oIIl1io;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            this.I010o0o0oO = o1oiiIIo111o2;
/* 31 */            return o1oiiIIo111o2;
                }

                public abstract O1IiiOil0o0l I01101IOlO();

                public final long I01101olii() {
/* 11 */            return this.I00ooiO1I.I00oI0i(this.I00oO101o.I00ooIo0.I0000O());
                }

                public abstract O1ooOo I0110OiO();

                public final O1ooOo I0110o(int i) {
/* 1 */             boolean zI000II = OIIlOOiIlo.I000II(i);
/* 5 */             O1ooOo o1ooOoI0110OiO = I0110OiO();
/* 9 */             if (!zI000II && (o1ooOoI0110OiO = o1ooOoI0110OiO.I00ilI0I1) == null) {
/* 39 */                return null;
                    }
/* 21 */            for (O1ooOo o1ooOoI0111i = I0111i(zI000II); o1ooOoI0111i != null && (o1ooOoI0111i.I00iio & i) != 0; o1ooOoI0111i = o1ooOoI0111i.I00ilO0) {
/* 31 */                if ((o1ooOoI0111i.I00iiO & i) != 0) {
/* 33 */                    return o1ooOoI0111i;
                        }
/* 34 */                if (o1ooOoI0111i == o1ooOoI0110OiO) {
/* 39 */                    return null;
                        }
                    }
/* 39 */            return null;
                }

                public final O1ooOo I0111i(boolean z) {
                    O1ooOo o1ooOoI0110OiO;
/* 3 */             IIlOoolol0ll iIlOoolol0ll = this.I00oO101o.I010101Oo1lO;
/* 9 */             if (((OIIlIII0Ili) iIlOoolol0ll.I00ilI0I1) == this) {
/* 13 */                return (O1ooOo) iIlOoolol0ll.I00io1l;
                    }
/* 16 */            OIIlIII0Ili oIIlIII0Ili = this.I00oli;
/* 18 */            if (!z) {
/* 31 */                if (oIIlIII0Ili != null) {
/* 33 */                    return oIIlIII0Ili.I0110OiO();
                        }
/* 38 */                return null;
                    }
/* 20 */            if (oIIlIII0Ili == null || (o1ooOoI0110OiO = oIIlIII0Ili.I0110OiO()) == null) {
/* 38 */                return null;
                    }
/* 28 */            return o1ooOoI0110OiO.I00ilO0;
                }

                public final void I011IO1I11OI(O1ooOo o1ooOo, OIIlI1Oi oIIlI1Oi, long j, Io1l0iI11iII io1l0iI11iII, int i, boolean z) {
/* 1 */             if (o1ooOo == null) {
/* 9 */                 I011Io0I1ioi(oIIlI1Oi, j, io1l0iI11iII, i, z);
/* 12 */                return;
                    }
/* 17 */            if (!oIIlI1Oi.I0000O(o1ooOo)) {
/* 27 */                I011IO1I11OI(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z);
/* 30 */                return;
                    }
/* 31 */            int i2 = io1l0iI11iII.I00iiO;
/* 33 */            OI0oiiIO0 oI0oiiIO0 = io1l0iI11iII.I00iOIl;
/* 39 */            io1l0iI11iII.I0000O(i2 + 1, oI0oiiIO0.I00000oOI);
                    io1l0iI11iII.I00iiO++;
/* 48 */            oI0oiiIO0.I00000oOI(o1ooOo);
/* 60 */            io1l0iI11iII.I00iiI.I00000oIO(iloI1O.I00000oIO(-1.0f, z, false));
/* 71 */            I011IO1I11OI(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z);
/* 74 */            io1l0iI11iII.I00iiO = i2;
                }

                public final void I011IOil(O1ooOo o1ooOo, OIIlI1Oi oIIlI1Oi, long j, Io1l0iI11iII io1l0iI11iII, int i, boolean z, float f) {
/* 1 */             if (o1ooOo == null) {
/* 12 */                I011Io0I1ioi(oIIlI1Oi, j, io1l0iI11iII, i, z);
/* 15 */                return;
                    }
/* 20 */            if (!oIIlI1Oi.I0000O(o1ooOo)) {
/* 41 */                I011IOil(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z, f);
/* 44 */                return;
                    }
/* 47 */            int i2 = io1l0iI11iII.I00iiO;
/* 49 */            OI0oiiIO0 oI0oiiIO0 = io1l0iI11iII.I00iOIl;
/* 55 */            io1l0iI11iII.I0000O(i2 + 1, oI0oiiIO0.I00000oOI);
                    io1l0iI11iII.I00iiO++;
/* 64 */            oI0oiiIO0.I00000oOI(o1ooOo);
/* 78 */            io1l0iI11iII.I00iiI.I00000oIO(iloI1O.I00000oIO(f, z, false));
/* 95 */            I011olOoO(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z, f, true);
/* 98 */            io1l0iI11iII.I00iiO = i2;
                }

                public final void I011Ill(OIIlI1Oi oIIlI1Oi, long j, Io1l0iI11iII io1l0iI11iII, int i, boolean z) {
                    boolean z2;
                    boolean z3;
/* 11 */            O1ooOo o1ooOoI0110o = I0110o(oIIlI1Oi.I00000oOI());
/* 26 */            if (!I01Io000(j)) {
/* 28 */                if (i == 1) {
/* 34 */                    float fI010ioo = I010ioo(j, I01101olii());
/* 43 */                    if ((Float.floatToRawIntBits(fI010ioo) & Integer.MAX_VALUE) < 2139095040) {
/* 51 */                        if (io1l0iI11iII.I00iiO != IOOi1I.I000II(io1l0iI11iII)) {
/* 66 */                            if (il1iiOO1ioI1.I00000oIO(io1l0iI11iII.I00000oOI(), iloI1O.I00000oIO(fI010ioo, false, false)) <= 0) {
/* 75 */                                return;
                                    }
                                }
/* 72 */                        I011IOil(o1ooOoI0110o, oIIlI1Oi, j, io1l0iI11iII, i, false, fI010ioo);
/* 75 */                        return;
                            }
/* 75 */                    return;
                        }
/* 75 */                return;
                    }
/* 76 */            if (o1ooOoI0110o == null) {
/* 78 */                I011Io0I1ioi(oIIlI1Oi, j, io1l0iI11iII, i, z);
/* 81 */                return;
                    }
/* 87 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 99 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
/* 106 */           if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < I00Ol10() && fIntBitsToFloat2 < I00Oio()) {
/* 140 */               I011IO1I11OI(o1ooOoI0110o, oIIlI1Oi, j, io1l0iI11iII, i, z);
/* 143 */               return;
                    }
/* 161 */           float fI010ioo2 = i == 1 ? I010ioo(j, I01101olii()) : Float.POSITIVE_INFINITY;
/* 168 */           if ((Float.floatToRawIntBits(fI010ioo2) & Integer.MAX_VALUE) < 2139095040) {
/* 176 */               if (io1l0iI11iII.I00iiO != IOOi1I.I000II(io1l0iI11iII)) {
/* 181 */                   z2 = z;
/* 195 */                   if (il1iiOO1ioI1.I00000oIO(io1l0iI11iII.I00000oOI(), iloI1O.I00000oIO(fI010ioo2, z2, false)) > 0) {
                            }
/* 206 */                   I011olOoO(o1ooOoI0110o, oIIlI1Oi, j, io1l0iI11iII, i, z2, fI010ioo2, z3);
                        }
/* 178 */               z2 = z;
/* 197 */               z3 = true;
/* 206 */               I011olOoO(o1ooOoI0110o, oIIlI1Oi, j, io1l0iI11iII, i, z2, fI010ioo2, z3);
                    }
/* 202 */           z2 = z;
/* 204 */           z3 = false;
/* 206 */           I011olOoO(o1ooOoI0110o, oIIlI1Oi, j, io1l0iI11iII, i, z2, fI010ioo2, z3);
                }

                public void I011Io0I1ioi(OIIlI1Oi oIIlI1Oi, long j, Io1l0iI11iII io1l0iI11iII, int i, boolean z) {
/* 1 */             OIIlIII0Ili oIIlIII0Ili = this.I00olI;
/* 3 */             if (oIIlIII0Ili != null) {
/* 10 */                oIIlIII0Ili.I011Ill(oIIlI1Oi, oIIlIII0Ili.I010o0o0oO(j, true), io1l0iI11iII, i, z);
                    }
                }

                public final void I011Ol0() {
/* 1 */             OIlIooO oIlIooO = this.I01101olii;
/* 3 */             if (oIlIooO != null) {
/* 7 */                 ((Io10OIiiOll) oIlIooO).I0000Il00O();
/* 10 */                return;
                    }
/* 11 */            OIIlIII0Ili oIIlIII0Ili = this.I00oli;
/* 13 */            if (oIIlIII0Ili != null) {
/* 15 */                oIIlIII0Ili.I011Ol0();
                    }
                }

                public final boolean I011iIOio() {
/* 3 */             if (this.I01101olii != null && this.I0100i <= 0.0f) {
/* 12 */                return true;
                    }
/* 14 */            OIIlIII0Ili oIIlIII0Ili = this.I00oli;
/* 16 */            if (oIIlIII0Ili != null) {
/* 18 */                return oIIlIII0Ili.I011iIOio();
                    }
/* 23 */            return false;
                }

                public final void I011iO() {
/* 5 */             this.I00oO101o.I010I0.I00000oOI();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v10 */
                /* JADX WARN: Type inference failed for: r7v11 */
                /* JADX WARN: Type inference failed for: r7v12 */
                /* JADX WARN: Type inference failed for: r7v13 */
                /* JADX WARN: Type inference failed for: r7v14 */
                /* JADX WARN: Type inference failed for: r7v15 */
                /* JADX WARN: Type inference failed for: r7v4 */
                /* JADX WARN: Type inference failed for: r7v5, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r7v7, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r7v8 */
                /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v0 */
                /* JADX WARN: Type inference failed for: r8v1 */
                /* JADX WARN: Type inference failed for: r8v10 */
                /* JADX WARN: Type inference failed for: r8v11 */
                /* JADX WARN: Type inference failed for: r8v2, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r8v3 */
                /* JADX WARN: Type inference failed for: r8v4 */
                /* JADX WARN: Type inference failed for: r8v5 */
                /* JADX WARN: Type inference failed for: r8v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r8v8 */
                /* JADX WARN: Type inference failed for: r8v9 */
                public final void I011iiii0i() {
                    O1ooOo o1ooOoI0110OiO;
/* 3 */             boolean zI000II = OIIlOOiIlo.I000II(Barcode.FORMAT_ITF);
/* 7 */             O1ooOo o1ooOoI0111i = I0111i(zI000II);
/* 11 */            if (o1ooOoI0111i == null || (o1ooOoI0111i.I00iOIl.I00iio & Barcode.FORMAT_ITF) == 0) {
/* 245 */               return;
                    }
/* 20 */            Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 32 */            Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 33 */            Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                    try {
/* 37 */                if (!zI000II) {
/* 51 */                    o1ooOoI0110OiO = I0110OiO().I00ilI0I1;
/* 53 */                    if (o1ooOoI0110OiO == null) {
                            }
                        }
/* 39 */                o1ooOoI0110OiO = I0110OiO();
/* 61 */                for (O1ooOo o1ooOoI0111i2 = I0111i(zI000II); o1ooOoI0111i2 != null; o1ooOoI0111i2 = o1ooOoI0111i2.I00ilO0) {
/* 66 */                    if ((o1ooOoI0111i2.I00iio & Barcode.FORMAT_ITF) == 0) {
                                break;
                            }
/* 71 */                    if ((o1ooOoI0111i2.I00iiO & Barcode.FORMAT_ITF) != 0) {
/* 73 */                        IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOoI0111i2;
/* 74 */                        ?? oi110o0 = 0;
/* 75 */                        while (iiIioO0ol1oII0000Il00O != 0) {
/* 79 */                            if (iiIioO0ol1oII0000Il00O instanceof O1iOiiOo) {
/* 85 */                                ((O1iOiiOo) iiIioO0ol1oII0000Il00O).I00000oOI(this.I00iiO);
                                    } else if ((iiIioO0ol1oII0000Il00O.I00iiO & Barcode.FORMAT_ITF) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 101 */                               O1ooOo o1ooOo = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 103 */                               int i = 0;
                                        iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                        oi110o0 = oi110o0;
/* 105 */                               while (o1ooOo != null) {
/* 110 */                                   if ((o1ooOo.I00iiO & Barcode.FORMAT_ITF) != 0) {
/* 112 */                                       i++;
                                                oi110o0 = oi110o0;
/* 114 */                                       if (i == 1) {
/* 116 */                                           iiIioO0ol1oII0000Il00O = o1ooOo;
                                                } else {
/* 118 */                                           if (oi110o0 == 0) {
/* 126 */                                               oi110o0 = new OI110O0(new O1ooOo[16]);
                                                    }
/* 129 */                                           if (iiIioO0ol1oII0000Il00O != 0) {
/* 131 */                                               oi110o0.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 134 */                                               iiIioO0ol1oII0000Il00O = 0;
                                                    }
/* 135 */                                           oi110o0.I00000oOI(o1ooOo);
                                                }
                                            }
/* 138 */                                   o1ooOo = o1ooOo.I00ilO0;
                                            iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                            oi110o0 = oi110o0;
                                        }
/* 141 */                               if (i == 1) {
                                        }
                                    }
/* 144 */                           iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                }
                            }
/* 149 */                   if (o1ooOoI0111i2 == o1ooOoI0110OiO) {
                                break;
                            }
                        }
                    } finally {
/* 158 */               iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v3 */
                /* JADX WARN: Type inference failed for: r4v4, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v7 */
                /* JADX WARN: Type inference failed for: r4v8 */
                /* JADX WARN: Type inference failed for: r4v9 */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v11 */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r5v8 */
                /* JADX WARN: Type inference failed for: r5v9 */
                public final void I011lIilI0lo() {
/* 3 */             boolean zI000II = OIIlOOiIlo.I000II(4194304);
/* 7 */             O1ooOo o1ooOoI0110OiO = I0110OiO();
/* 11 */            if (!zI000II && (o1ooOoI0110OiO = o1ooOoI0110OiO.I00ilI0I1) == null) {
/* 245 */               return;
                    }
/* 24 */            for (O1ooOo o1ooOoI0111i = I0111i(zI000II); o1ooOoI0111i != null && (o1ooOoI0111i.I00iio & 4194304) != 0; o1ooOoI0111i = o1ooOoI0111i.I00ilO0) {
/* 34 */                if ((o1ooOoI0111i.I00iiO & 4194304) != 0) {
/* 37 */                    IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOoI0111i;
/* 38 */                    ?? oi110o0 = 0;
/* 39 */                    while (iiIioO0ol1oII0000Il00O != 0) {
/* 43 */                        if (iiIioO0ol1oII0000Il00O instanceof O0iOIlio1O) {
/* 47 */                            ((O0iOIlio1O) iiIioO0ol1oII0000Il00O).I000iOII(this);
                                } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 4194304) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 63 */                            O1ooOo o1ooOo = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 65 */                            int i = 0;
                                    iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                    oi110o0 = oi110o0;
/* 67 */                            while (o1ooOo != null) {
/* 72 */                                if ((o1ooOo.I00iiO & 4194304) != 0) {
/* 74 */                                    i++;
                                            oi110o0 = oi110o0;
/* 76 */                                    if (i == 1) {
/* 78 */                                        iiIioO0ol1oII0000Il00O = o1ooOo;
                                            } else {
/* 80 */                                        if (oi110o0 == 0) {
/* 88 */                                            oi110o0 = new OI110O0(new O1ooOo[16]);
                                                }
/* 91 */                                        if (iiIioO0ol1oII0000Il00O != 0) {
/* 93 */                                            oi110o0.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 96 */                                            iiIioO0ol1oII0000Il00O = 0;
                                                }
/* 97 */                                        oi110o0.I00000oOI(o1ooOo);
                                            }
                                        }
/* 100 */                               o1ooOo = o1ooOo.I00ilO0;
                                        iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                        oi110o0 = oi110o0;
                                    }
/* 103 */                           if (i == 1) {
                                    }
                                }
/* 106 */                       iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                            }
                        }
/* 111 */               if (o1ooOoI0111i == o1ooOoI0110OiO) {
/* 245 */                   return;
                        }
                    }
                }

                public final void I011lO1liO1O() {
/* 2 */             this.I00oliIiO01i = true;
/* 6 */             this.I010oio1OO0.invoke();
/* 9 */             I01II10();
/* 20 */            if (IooO0O.I0000Il00O(this.I010I0, 0L)) {
/* 55 */                return;
                    }
/* 24 */            this.I00oO101o.I00O0i0ii(this);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0 */
                /* JADX WARN: Type inference failed for: r3v1, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r3v10 */
                /* JADX WARN: Type inference failed for: r3v11 */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v4, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v6 */
                /* JADX WARN: Type inference failed for: r3v7 */
                /* JADX WARN: Type inference failed for: r3v8 */
                /* JADX WARN: Type inference failed for: r3v9 */
                /* JADX WARN: Type inference failed for: r4v0 */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v10 */
                /* JADX WARN: Type inference failed for: r4v11 */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v3, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r4v4 */
                /* JADX WARN: Type inference failed for: r4v5 */
                /* JADX WARN: Type inference failed for: r4v6, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r4v8 */
                /* JADX WARN: Type inference failed for: r4v9 */
                public final void I011lOIoo0l() {
/* 3 */             boolean zI000II = OIIlOOiIlo.I000II(1048576);
/* 7 */             O1ooOo o1ooOoI0111i = I0111i(zI000II);
/* 11 */            if (o1ooOoI0111i == null || (o1ooOoI0111i.I00iOIl.I00iio & 1048576) == 0) {
/* 245 */               return;
                    }
/* 20 */            O1ooOo o1ooOoI0110OiO = I0110OiO();
/* 24 */            if (!zI000II && (o1ooOoI0110OiO = o1ooOoI0110OiO.I00ilI0I1) == null) {
/* 245 */               return;
                    }
/* 37 */            for (O1ooOo o1ooOoI0111i2 = I0111i(zI000II); o1ooOoI0111i2 != null && (o1ooOoI0111i2.I00iio & 1048576) != 0; o1ooOoI0111i2 = o1ooOoI0111i2.I00ilO0) {
/* 47 */                if ((o1ooOoI0111i2.I00iiO & 1048576) != 0) {
/* 50 */                    IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOoI0111i2;
/* 51 */                    ?? oi110o0 = 0;
/* 52 */                    while (iiIioO0ol1oII0000Il00O != 0) {
/* 56 */                        if (iiIioO0ol1oII0000Il00O instanceof Ooii0O0) {
/* 60 */                            ((Ooii0O0) iiIioO0ol1oII0000Il00O).I00ooIo0();
                                } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 1048576) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 76 */                            O1ooOo o1ooOo = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 78 */                            int i = 0;
                                    iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                    oi110o0 = oi110o0;
/* 80 */                            while (o1ooOo != null) {
/* 85 */                                if ((o1ooOo.I00iiO & 1048576) != 0) {
/* 87 */                                    i++;
                                            oi110o0 = oi110o0;
/* 89 */                                    if (i == 1) {
/* 91 */                                        iiIioO0ol1oII0000Il00O = o1ooOo;
                                            } else {
/* 93 */                                        if (oi110o0 == 0) {
/* 101 */                                           oi110o0 = new OI110O0(new O1ooOo[16]);
                                                }
/* 104 */                                       if (iiIioO0ol1oII0000Il00O != 0) {
/* 106 */                                           oi110o0.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 109 */                                           iiIioO0ol1oII0000Il00O = 0;
                                                }
/* 110 */                                       oi110o0.I00000oOI(o1ooOo);
                                            }
                                        }
/* 113 */                               o1ooOo = o1ooOo.I00ilO0;
                                        iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                        oi110o0 = oi110o0;
                                    }
/* 116 */                           if (i == 1) {
                                    }
                                }
/* 119 */                       iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                            }
                        }
/* 124 */               if (o1ooOoI0111i2 == o1ooOoI0110OiO) {
/* 245 */                   return;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:77:0x01d7 A[PHI: r3
                  0x01d7: PHI (r3v27 OI110O0) = (r3v1 OI110O0), (r3v1 OI110O0), (r3v29 OI110O0) binds: [B:59:0x01a1, B:61:0x01a5, B:75:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Type inference failed for: r2v1 */
                /* JADX WARN: Type inference failed for: r2v18 */
                /* JADX WARN: Type inference failed for: r2v2, types: [O1ooOo] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I011olOoO(O1ooOo o1ooOo, OIIlI1Oi oIIlI1Oi, long j, Io1l0iI11iII io1l0iI11iII, int i, boolean z, float f, boolean z2) {
                    O1ooOo o1ooOoI0000Il00O;
/* 3 */             if (o1ooOo == null) {
/* 17 */                I011Io0I1ioi(oIIlI1Oi, j, io1l0iI11iII, i, z);
/* 20 */                return;
                    }
/* 27 */            if (!oIIlI1Oi.I0000O(o1ooOo)) {
/* 51 */                I011olOoO(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z, f, z2);
/* 54 */                return;
                    }
/* 57 */            int i2 = i;
/* 59 */            boolean z3 = z;
/* 62 */            if (i2 == 3 || i2 == 4) {
/* 69 */                IiIioO0ol1oI iiIioO0ol1oI = o1ooOo;
/* 70 */                OI110O0 oi110o0 = null;
                        while (true) {
/* 71 */                    if (iiIioO0ol1oI == 0) {
                                break;
                            }
/* 76 */                    if (iiIioO0ol1oI instanceof OO1iloII0lOo) {
/* 80 */                        long jI000oI1ioi = ((OO1iloII0lOo) iiIioO0ol1oI).I000oI1ioi();
/* 88 */                        int i3 = (int) (j >> 32);
/* 89 */                        float fIntBitsToFloat = Float.intBitsToFloat(i3);
/* 95 */                        O0iiOioolIi o0iiOioolIi = this.I00oO101o;
/* 97 */                        O0iOOoiioO o0iOOoiioO = o0iiOioolIi.I00oo1iO0ll;
/* 99 */                        int i4 = OoI01lI.I00000oOI;
/* 103 */                       long j2 = Long.MIN_VALUE & jI000oI1ioi;
/* 129 */                       if (fIntBitsToFloat >= (-(((j2 == 0 || o0iOOoiioO == O0iOOoiioO.I00iOIl) ? (int) jI000oI1ioi : (int) (jI000oI1ioi >> 30)) & 32767))) {
/* 160 */                           if (Float.intBitsToFloat(i3) < I00Ol10() + (((j2 == 0 || o0iiOioolIi.I00oo1iO0ll == O0iOOoiioO.I00iOIl) ? (int) (jI000oI1ioi >> 30) : (int) jI000oI1ioi) & 32767)) {
/* 169 */                               int i5 = (int) (j & 4294967295L);
/* 185 */                               if (Float.intBitsToFloat(i5) >= (-(((int) (jI000oI1ioi >> 15)) & 32767))) {
/* 205 */                                   if (Float.intBitsToFloat(i5) < (((int) (jI000oI1ioi >> 45)) & 32767) + I00Oio()) {
/* 207 */                                       OI0llOl1ooO0 oI0llOl1ooO0 = io1l0iI11iII.I00iiI;
/* 209 */                                       OI0oiiIO0 oI0oiiIO0 = io1l0iI11iII.I00iOIl;
/* 218 */                                       if (io1l0iI11iII.I00iiO == IOOi1I.I000II(io1l0iI11iII)) {
/* 220 */                                           int i6 = io1l0iI11iII.I00iiO;
/* 226 */                                           io1l0iI11iII.I0000O(i6 + 1, oI0oiiIO0.I00000oOI);
                                                    io1l0iI11iII.I00iiO++;
/* 234 */                                           oI0oiiIO0.I00000oOI(o1ooOo);
/* 241 */                                           oI0llOl1ooO0.I00000oIO(iloI1O.I00000oIO(0.0f, z3, true));
/* 261 */                                           I011olOoO(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i2, z3, f, z2);
/* 264 */                                           io1l0iI11iII.I00iiO = i6;
/* 266 */                                           return;
                                                }
/* 267 */                                       long jI00000oOI = io1l0iI11iII.I00000oOI();
/* 271 */                                       int i7 = io1l0iI11iII.I00iiO;
/* 277 */                                       if (!il1iiOO1ioI1.I0000Il00O(jI00000oOI)) {
/* 361 */                                           if (il1iiOO1ioI1.I00000oOI(jI00000oOI) > 0.0f) {
/* 363 */                                               int i8 = io1l0iI11iII.I00iiO;
/* 369 */                                               io1l0iI11iII.I0000O(i8 + 1, oI0oiiIO0.I00000oOI);
                                                        io1l0iI11iII.I00iiO++;
/* 377 */                                               oI0oiiIO0.I00000oOI(o1ooOo);
/* 384 */                                               oI0llOl1ooO0.I00000oIO(iloI1O.I00000oIO(0.0f, z3, true));
/* 407 */                                               I011olOoO(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z3, f, z2);
/* 410 */                                               io1l0iI11iII.I00iiO = i8;
/* 412 */                                               return;
                                                    }
/* 412 */                                           return;
                                                }
/* 279 */                                       int iI000II = IOOi1I.I000II(io1l0iI11iII);
/* 283 */                                       io1l0iI11iII.I00iiO = iI000II;
/* 289 */                                       io1l0iI11iII.I0000O(iI000II + 1, oI0oiiIO0.I00000oOI);
                                                io1l0iI11iII.I00iiO++;
/* 297 */                                       oI0oiiIO0.I00000oOI(o1ooOo);
/* 304 */                                       oI0llOl1ooO0.I00000oIO(iloI1O.I00000oIO(0.0f, z3, true));
/* 327 */                                       I011olOoO(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z3, f, z2);
/* 330 */                                       io1l0iI11iII.I00iiO = iI000II;
/* 342 */                                       if (il1iiOO1ioI1.I00000oOI(io1l0iI11iII.I00000oOI()) < 0.0f) {
/* 349 */                                           io1l0iI11iII.I0000O(i7 + 1, io1l0iI11iII.I00iiO + 1);
                                                }
/* 352 */                                       io1l0iI11iII.I00iiO = i7;
/* 354 */                                       return;
                                            }
                                        }
                                    }
                                }
                            } else {
/* 418 */                       if ((iiIioO0ol1oI.I00iiO & 16) == 0 || !(iiIioO0ol1oI instanceof IiIioO0ol1oI)) {
/* 472 */                           o1ooOoI0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                } else {
/* 427 */                           O1ooOo o1ooOo2 = iiIioO0ol1oI.I00o0l1o1o0;
/* 429 */                           int i9 = 0;
                                    o1ooOoI0000Il00O = iiIioO0ol1oI;
                                    oi110o0 = oi110o0;
/* 430 */                           while (o1ooOo2 != null) {
/* 435 */                               if ((o1ooOo2.I00iiO & 16) != 0) {
/* 437 */                                   i9++;
                                            oi110o0 = oi110o0;
/* 439 */                                   if (i9 == 1) {
/* 441 */                                       o1ooOoI0000Il00O = o1ooOo2;
                                            } else {
/* 443 */                                       if (oi110o0 == null) {
/* 449 */                                           oi110o0 = new OI110O0(new O1ooOo[16]);
                                                }
/* 452 */                                       if (o1ooOoI0000Il00O != null) {
/* 454 */                                           oi110o0.I00000oOI(o1ooOoI0000Il00O);
/* 457 */                                           o1ooOoI0000Il00O = null;
                                                }
/* 458 */                                       oi110o0.I00000oOI(o1ooOo2);
                                            }
                                        }
/* 461 */                               o1ooOo2 = o1ooOo2.I00ilO0;
                                        o1ooOoI0000Il00O = o1ooOoI0000Il00O;
                                        oi110o0 = oi110o0;
                                    }
/* 464 */                           if (i9 == 1) {
                                    }
                                }
/* 466 */                       i2 = i;
/* 468 */                       z3 = z;
                                iiIioO0ol1oI = o1ooOoI0000Il00O;
                                oi110o0 = oi110o0;
                            }
                        }
                    }
/* 477 */           if (z2) {
/* 479 */               I011IOil(o1ooOo, oIIlI1Oi, j, io1l0iI11iII, i, z, f);
                    } else {
/* 483 */               I01IO1il(o1ooOo, oIIlI1Oi, j, io1l0iI11iII, i, z, f);
                    }
                }

                public abstract void I01I01Oolii(IIolOo iIolOo, Io10IOI io10IOI);

                public final void I01I0Iioooo0(long j, float f, Function1 function1, Io10IOI io10IOI) {
/* 2 */             O0iiOioolIi o0iiOioolIi = this.I00oO101o;
/* 5 */             if (io10IOI != null) {
/* 7 */                 if (function1 != null) {
/* 12 */                    IolioOO1.I00000oIO("both ways to create layers shouldn't be used together");
                        }
/* 17 */                if (this.I0110OiO != io10IOI) {
/* 19 */                    this.I0110OiO = null;
/* 21 */                    I01Ilioliio(null, false);
/* 24 */                    this.I0110OiO = io10IOI;
                        }
/* 28 */                if (this.I01101olii == null) {
/* 30 */                    OIlO000O01 oIlO000O01I00000oIO = O0iillo1ol0.I00000oIO(o0iiOioolIi);
/* 34 */                    IlliIl1l11O illiIl1l11OI010oio1OO0 = I010oio1OO0();
/* 40 */                    OIIl1io oIIl1io = this.I010oio1OO0;
/* 42 */                    OIlIooO oIlIooOI0000oI00 = ((I0lio1O01i01) oIlO000O01I00000oIO).I0000oI00(illiIl1l11OI010oio1OO0, oIIl1io, io10IOI);
/* 49 */                    Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooOI0000oI00;
/* 51 */                    io10OIiiOll.I0000oI00(this.I00iiO);
/* 54 */                    io10OIiiOll.I0000O(j);
/* 57 */                    this.I01101olii = oIlIooOI0000oI00;
/* 60 */                    o0iiOioolIi.I010i10l = true;
/* 62 */                    oIIl1io.invoke();
                        }
                    } else {
/* 68 */                if (this.I0110OiO != null) {
/* 70 */                    this.I0110OiO = null;
/* 72 */                    I01Ilioliio(null, false);
                        }
/* 75 */                I01Ilioliio(function1, false);
                    }
/* 84 */            if (!IooO0O.I0000Il00O(this.I010I0, j)) {
/* 94 */                ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).I00Io1lO(-4.0f);
/* 97 */                this.I010I0 = j;
/* 99 */                OIlIooO oIlIooO = this.I01101olii;
/* 101 */               if (oIlIooO != null) {
/* 105 */                   ((Io10OIiiOll) oIlIooO).I0000O(j);
                        } else {
/* 109 */                   OIIlIII0Ili oIIlIII0Ili = this.I00oli;
/* 111 */                   if (oIIlIII0Ili != null) {
/* 113 */                       oIIlIII0Ili.I011Ol0();
                            }
                        }
/* 116 */               o0iiOioolIi.I00O0i0ii(this);
/* 119 */               O1IiO0l.I0100o111I(this);
/* 122 */               OIlO000O01 oIlO000O01 = o0iiOioolIi.I00o0iI0io1;
/* 124 */               if (oIlO000O01 != null) {
/* 128 */                   ((I0lio1O01i01) oIlO000O01).I001IO000(o0iiOioolIi);
                        }
                    }
/* 131 */           this.I010II = f;
/* 139 */           if (this == ((OIIlIII0Ili) o0iiOioolIi.I010101Oo1lO.I00ilI0I1)) {
/* 151 */               ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).getRectManager().I000II(o0iiOioolIi);
                    }
/* 156 */           if (this.I00o0iI0io1) {
/* 204 */               return;
                    }
/* 162 */           I00ll1(I00ooIo0());
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I01I1Oo0oll(II1i0i0ilO iI1i0i0ilO, boolean z, boolean z2) {
                    long jFloatToRawIntBits;
/* 1 */             OIlIooO oIlIooO = this.I01101olii;
/* 10 */            if (oIlIooO != null) {
/* 15 */                if (this.I00oo1iO0ll) {
/* 17 */                    if (z2) {
/* 19 */                        long jI01101olii = I01101olii();
/* 23 */                        float f = iI1i0i0ilO.I00000oOI;
/* 25 */                        float f2 = iI1i0i0ilO.I0000Il00O;
/* 31 */                        if (iI1i0i0ilO.I0000O >= 0.0f) {
/* 33 */                            long j = this.I00iiO;
/* 41 */                            if (f > ((int) (j >> 32)) || iI1i0i0ilO.I0000oI00 < 0.0f || f2 > ((int) (j & 4294967295L))) {
/* 131 */                               jFloatToRawIntBits = 0;
                                    } else {
/* 60 */                                float fIntBitsToFloat = Float.intBitsToFloat((int) (jI01101olii >> 32));
/* 67 */                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jI01101olii & 4294967295L));
/* 80 */                                float f3 = (fIntBitsToFloat - (iI1i0i0ilO.I0000O - iI1i0i0ilO.I00000oOI)) / 2.0f;
/* 83 */                                if (f3 > 0.0f) {
/* 85 */                                    f -= f3;
                                        } else {
/* 88 */                                    float f4 = (-fIntBitsToFloat) / 2.0f;
/* 91 */                                    if (f < f4) {
/* 93 */                                        f = f4;
                                            }
                                        }
/* 101 */                               float f5 = (fIntBitsToFloat2 - (iI1i0i0ilO.I0000oI00 - iI1i0i0ilO.I0000Il00O)) / 2.0f;
/* 104 */                               if (f5 > 0.0f) {
/* 106 */                                   f2 -= f5;
                                        } else {
/* 109 */                                   float f6 = (-fIntBitsToFloat2) / 2.0f;
/* 112 */                                   if (f2 < f6) {
/* 114 */                                       f2 = f6;
                                            }
                                        }
/* 129 */                               jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                                    }
/* 136 */                           float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
/* 142 */                           float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
/* 146 */                           long j2 = this.I00iiO;
/* 150 */                           float f7 = (int) (j2 >> 32);
/* 156 */                           int i = (int) (jI01101olii >> 32);
/* 152 */                           float f8 = (int) (j2 & 4294967295L);
/* 177 */                           int i2 = (int) (jI01101olii & 4294967295L);
/* 196 */                           iI1i0i0ilO.I00000oIO(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                                }
                            } else if (z) {
/* 202 */                       long j3 = this.I00iiO;
/* 211 */                       iI1i0i0ilO.I00000oIO(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                            }
/* 218 */                   if (iI1i0i0ilO.I00000oOI()) {
/* 220 */                       return;
                            }
                        }
/* 221 */               Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooO;
/* 223 */               float[] fArrI00000oOI = io10OIiiOll.I00000oOI();
/* 229 */               if (!io10OIiiOll.I00oII) {
/* 231 */                   if (fArrI00000oOI == null) {
/* 233 */                       iI1i0i0ilO.I00000oOI = 0.0f;
/* 235 */                       iI1i0i0ilO.I0000Il00O = 0.0f;
/* 237 */                       iI1i0i0ilO.I0000O = 0.0f;
/* 239 */                       iI1i0i0ilO.I0000oI00 = 0.0f;
                            } else {
/* 242 */                       O1i010l1l.I0000O(fArrI00000oOI, iI1i0i0ilO);
                            }
                        }
                    }
/* 245 */           long j4 = this.I010I0;
/* 249 */           float f9 = (int) (j4 >> 32);
                    iI1i0i0ilO.I00000oOI += f9;
                    iI1i0i0ilO.I0000O += f9;
/* 262 */           float f10 = (int) (j4 & 4294967295L);
                    iI1i0i0ilO.I0000Il00O += f10;
                    iI1i0i0ilO.I0000oI00 += f10;
                }

                public final void I01II10() {
/* 3 */             if (this.I01101olii != null) {
/* 8 */                 if (this.I0110OiO != null) {
/* 10 */                    this.I0110OiO = null;
                        }
/* 13 */                I01Ilioliio(null, false);
/* 18 */                this.I00oO101o.I00Oio(false);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v0 */
                /* JADX WARN: Type inference failed for: r8v1, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r8v12 */
                /* JADX WARN: Type inference failed for: r8v13 */
                /* JADX WARN: Type inference failed for: r8v3 */
                /* JADX WARN: Type inference failed for: r8v4, types: [O1ooOo] */
                /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v6 */
                /* JADX WARN: Type inference failed for: r8v7 */
                /* JADX WARN: Type inference failed for: r8v8 */
                /* JADX WARN: Type inference failed for: r8v9 */
                /* JADX WARN: Type inference failed for: r9v13 */
                /* JADX WARN: Type inference failed for: r9v14 */
                /* JADX WARN: Type inference failed for: r9v15 */
                /* JADX WARN: Type inference failed for: r9v16 */
                /* JADX WARN: Type inference failed for: r9v2 */
                /* JADX WARN: Type inference failed for: r9v3 */
                /* JADX WARN: Type inference failed for: r9v4 */
                /* JADX WARN: Type inference failed for: r9v5, types: [OI110O0] */
                /* JADX WARN: Type inference failed for: r9v6 */
                /* JADX WARN: Type inference failed for: r9v7 */
                /* JADX WARN: Type inference failed for: r9v8, types: [OI110O0] */
                public final void I01IO0oio(O1iOIo0o0 o1iOIo0o0) {
                    OIIlIII0Ili oIIlIII0Ili;
/* 5 */             O1iOIo0o0 o1iOIo0o02 = this.I0100o111I;
/* 7 */             if (o1iOIo0o0 != o1iOIo0o02) {
/* 9 */                 this.I0100o111I = o1iOIo0o0;
/* 11 */                O0iiOioolIi o0iiOioolIi = this.I00oO101o;
/* 13 */                int i = 0;
/* 14 */                if (o1iOIo0o02 == null || o1iOIo0o0.I0001Ioi1lo() != o1iOIo0o02.I0001Ioi1lo() || o1iOIo0o0.I0000O() != o1iOIo0o02.I0000O()) {
/* 36 */                    int iI0001Ioi1lo = o1iOIo0o0.I0001Ioi1lo();
/* 40 */                    int iI0000O = o1iOIo0o0.I0000O();
/* 44 */                    OIlIooO oIlIooO = this.I01101olii;
/* 53 */                    if (oIlIooO != null) {
/* 62 */                        ((Io10OIiiOll) oIlIooO).I0000oI00((iI0001Ioi1lo << 32) | (iI0000O & 4294967295L));
                            } else if (o0iiOioolIi.I00Io1o110i() && (oIIlIII0Ili = this.I00oli) != null) {
/* 76 */                        oIIlIII0Ili.I011Ol0();
                            }
/* 85 */                    I00iOIl((iI0000O & 4294967295L) | (iI0001Ioi1lo << 32));
/* 90 */                    if (this.I00ooIo0 != null) {
/* 92 */                        I01Ilo0i(false);
                            }
/* 96 */                    boolean zI000II = OIIlOOiIlo.I000II(4);
/* 100 */                   O1ooOo o1ooOoI0110OiO = I0110OiO();
/* 104 */                   if (zI000II || (o1ooOoI0110OiO = o1ooOoI0110OiO.I00ilI0I1) != null) {
/* 117 */                       for (O1ooOo o1ooOoI0111i = I0111i(zI000II); o1ooOoI0111i != null && (o1ooOoI0111i.I00iio & 4) != 0; o1ooOoI0111i = o1ooOoI0111i.I00ilO0) {
/* 127 */                           if ((o1ooOoI0111i.I00iiO & 4) != 0) {
/* 130 */                               IiIioO0ol1oI iiIioO0ol1oII0000Il00O = o1ooOoI0111i;
/* 131 */                               ?? oi110o0 = 0;
/* 132 */                               while (iiIioO0ol1oII0000Il00O != 0) {
/* 136 */                                   if (iiIioO0ol1oII0000Il00O instanceof Iillo1il11l) {
/* 140 */                                       ((Iillo1il11l) iiIioO0ol1oII0000Il00O).I00IoO0();
                                            } else if ((iiIioO0ol1oII0000Il00O.I00iiO & 4) != 0 && (iiIioO0ol1oII0000Il00O instanceof IiIioO0ol1oI)) {
/* 156 */                                       O1ooOo o1ooOo = iiIioO0ol1oII0000Il00O.I00o0l1o1o0;
/* 158 */                                       int i2 = 0;
                                                iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                oi110o0 = oi110o0;
/* 160 */                                       while (o1ooOo != null) {
/* 165 */                                           if ((o1ooOo.I00iiO & 4) != 0) {
/* 167 */                                               i2++;
                                                        oi110o0 = oi110o0;
/* 169 */                                               if (i2 == 1) {
/* 171 */                                                   iiIioO0ol1oII0000Il00O = o1ooOo;
                                                        } else {
/* 173 */                                                   if (oi110o0 == 0) {
/* 181 */                                                       oi110o0 = new OI110O0(new O1ooOo[16]);
                                                            }
/* 184 */                                                   if (iiIioO0ol1oII0000Il00O != 0) {
/* 186 */                                                       oi110o0.I00000oOI(iiIioO0ol1oII0000Il00O);
/* 189 */                                                       iiIioO0ol1oII0000Il00O = 0;
                                                            }
/* 190 */                                                   oi110o0.I00000oOI(o1ooOo);
                                                        }
                                                    }
/* 193 */                                           o1ooOo = o1ooOo.I00ilO0;
                                                    iiIioO0ol1oII0000Il00O = iiIioO0ol1oII0000Il00O;
                                                    oi110o0 = oi110o0;
                                                }
/* 196 */                                       if (i2 == 1) {
                                                }
                                            }
/* 199 */                                   iiIioO0ol1oII0000Il00O = il0lI1i1olii.I0000Il00O(oi110o0);
                                        }
                                    }
/* 204 */                           if (o1ooOoI0111i == o1ooOoI0110OiO) {
                                        break;
                                    }
                                }
                            }
/* 209 */                   OIlO000O01 oIlO000O01 = o0iiOioolIi.I00o0iI0io1;
/* 211 */                   if (oIlO000O01 != null) {
/* 215 */                       ((I0lio1O01i01) oIlO000O01).I001IO000(o0iiOioolIi);
                            }
/* 218 */                   o0iiOioolIi.I00O0i0ii(this);
                        }
/* 221 */               OI0o11I1 oI0o11I1 = this.I010101Oo1lO;
/* 223 */               if ((oI0o11I1 == null || oI0o11I1.I0000oI00 == 0) && o1iOIo0o0.I00000oOI().isEmpty()) {
/* 437 */                   return;
                        }
/* 240 */               OI0o11I1 oI0o11I12 = this.I010101Oo1lO;
/* 242 */               Map mapI00000oOI = o1iOIo0o0.I00000oOI();
/* 246 */               if (oI0o11I12 != null && oI0o11I12.I0000oI00 == mapI00000oOI.size()) {
/* 258 */                   Object[] objArr = oI0o11I12.I00000oOI;
/* 260 */                   int[] iArr = oI0o11I12.I0000Il00O;
/* 262 */                   long[] jArr = oI0o11I12.I00000oIO;
                            int length = jArr.length - 2;
/* 267 */                   if (length < 0) {
/* 437 */                       return;
                            }
/* 269 */                   int i3 = 0;
                            loop0: while (true) {
/* 270 */                       long j = jArr[i3];
/* 284 */                       if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 293 */                           int i4 = 8 - ((~(i3 - length)) >>> 31);
/* 296 */                           for (int i5 = i; i5 < i4; i5++) {
/* 305 */                               if ((255 & j) < 128) {
/* 309 */                                   int i6 = (i3 << 3) + i5;
/* 310 */                                   Object obj = objArr[i6];
/* 312 */                                   int i7 = iArr[i6];
/* 322 */                                   Integer num = (Integer) mapI00000oOI.get((I0iolili01) obj);
/* 324 */                                   if (num == null || num.intValue() != i7) {
                                                break loop0;
                                            }
                                        }
/* 400 */                               j >>= 8;
                                    }
/* 405 */                           if (i4 != 8) {
/* 437 */                               return;
                                    }
                                }
/* 407 */                       if (i3 == length) {
/* 437 */                           return;
                                }
/* 409 */                       i3++;
/* 411 */                       i = 0;
                            }
                        }
/* 339 */               o0iiOioolIi.I010I0.I00100l0.I00oli.I0001Ioi1lo();
/* 342 */               OI0o11I1 oI0o11I13 = this.I010101Oo1lO;
/* 344 */               if (oI0o11I13 == null) {
/* 346 */                   OI0o11I1 oI0o11I14 = OIOi1iO01.I00000oIO;
/* 350 */                   oI0o11I13 = new OI0o11I1();
/* 353 */                   this.I010101Oo1lO = oI0o11I13;
                        }
/* 355 */               oI0o11I13.I00000oIO();
/* 374 */               for (Map.Entry entry : o1iOIo0o0.I00000oOI().entrySet()) {
/* 396 */                   oI0o11I13.I000II(((Number) entry.getValue()).intValue(), entry.getKey());
                        }
                    }
                }

                public final void I01IO1il(O1ooOo o1ooOo, OIIlI1Oi oIIlI1Oi, long j, Io1l0iI11iII io1l0iI11iII, int i, boolean z, float f) {
                    int i2;
/* 3 */             if (o1ooOo == null) {
/* 17 */                I011Io0I1ioi(oIIlI1Oi, j, io1l0iI11iII, i, z);
/* 20 */                return;
                    }
/* 27 */            if (!oIIlI1Oi.I0000O(o1ooOo)) {
/* 49 */                I01IO1il(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z, f);
/* 52 */                return;
                    }
/* 63 */            if (!oIIlI1Oi.I00000oIO(o1ooOo)) {
/* 310 */               I011olOoO(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z, f, false);
/* 965 */               return;
                    }
/* 65 */            OI0llOl1ooO0 oI0llOl1ooO0 = io1l0iI11iII.I00iiI;
/* 67 */            OI0oiiIO0 oI0oiiIO0 = io1l0iI11iII.I00iOIl;
/* 76 */            if (io1l0iI11iII.I00iiO != IOOi1I.I000II(io1l0iI11iII)) {
/* 181 */               long jI00000oOI = io1l0iI11iII.I00000oOI();
/* 185 */               int i3 = io1l0iI11iII.I00iiO;
/* 187 */               int iI000II = IOOi1I.I000II(io1l0iI11iII);
/* 191 */               io1l0iI11iII.I00iiO = iI000II;
/* 197 */               io1l0iI11iII.I0000O(iI000II + 1, oI0oiiIO0.I00000oOI);
                        io1l0iI11iII.I00iiO++;
/* 206 */               oI0oiiIO0.I00000oOI(o1ooOo);
/* 213 */               oI0llOl1ooO0.I00000oIO(iloI1O.I00000oIO(f, z, false));
/* 233 */               I011olOoO(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z, f, false);
/* 236 */               io1l0iI11iII.I00iiO = iI000II;
/* 238 */               long jI00000oOI2 = io1l0iI11iII.I00000oOI();
/* 250 */               if (io1l0iI11iII.I00iiO + 1 >= IOOi1I.I000II(io1l0iI11iII) || il1iiOO1ioI1.I00000oIO(jI00000oOI, jI00000oOI2) <= 0) {
/* 283 */                   io1l0iI11iII.I0000O(io1l0iI11iII.I00iiO + 1, oI0oiiIO0.I00000oOI);
                        } else {
/* 258 */                   int i4 = i3 + 1;
/* 260 */                   boolean zI0000Il00O = il1iiOO1ioI1.I0000Il00O(jI00000oOI2);
/* 264 */                   int i5 = io1l0iI11iII.I00iiO;
/* 273 */                   io1l0iI11iII.I0000O(i4, zI0000Il00O ? i5 + 2 : i5 + 1);
                        }
/* 286 */               io1l0iI11iII.I00iiO = i3;
/* 288 */               return;
                    }
/* 78 */            int i6 = io1l0iI11iII.I00iiO;
/* 80 */            int i7 = i6 + 1;
/* 84 */            io1l0iI11iII.I0000O(i7, oI0oiiIO0.I00000oOI);
                    io1l0iI11iII.I00iiO++;
/* 93 */            oI0oiiIO0.I00000oOI(o1ooOo);
/* 100 */           oI0llOl1ooO0.I00000oIO(iloI1O.I00000oIO(f, z, false));
/* 118 */           I011olOoO(l1il101OlO.I00000oIO(o1ooOo, oIIlI1Oi.I00000oOI()), oIIlI1Oi, j, io1l0iI11iII, i, z, f, false);
/* 121 */           io1l0iI11iII.I00iiO = i6;
/* 127 */           if (i7 == IOOi1I.I000II(io1l0iI11iII) || il1iiOO1ioI1.I0000Il00O(io1l0iI11iII.I00000oOI())) {
/* 141 */               int i8 = io1l0iI11iII.I00iiO;
/* 143 */               int i9 = i8 + 1;
/* 145 */               oI0oiiIO0.I000l1(i9);
/* 148 */               if (i9 < 0 || i9 >= (i2 = oI0llOl1ooO0.I00000oOI)) {
/* 176 */                   lO00l0o.I00000oOI("Index must be between 0 and size");
/* 180 */                   throw null;
                        }
/* 154 */               long[] jArr = oI0llOl1ooO0.I00000oIO;
/* 156 */               long j2 = jArr[i9];
/* 160 */               if (i9 != i2 - 1) {
/* 164 */                   I1IoiO1l.I000OiO(jArr, jArr, i9, i8 + 2, i2);
                        }
                        oI0llOl1ooO0.I00000oOI--;
                    }
                }

                public final OOo0IO I01IiOO() {
/* 7 */             if (I0110OiO().I00lll10) {
/* 11 */                O0iOOo0Ii o0iOOo0IiI0000Il00O = l0o0IlOil1.I0000Il00O(this);
/* 15 */                II1i0i0ilO iI1i0i0ilO = this.I010OIo1l;
/* 17 */                if (iI1i0i0ilO == null) {
/* 21 */                    iI1i0i0ilO = new II1i0i0ilO();
/* 24 */                    this.I010OIo1l = iI1i0i0ilO;
                        }
/* 30 */                long jI010iIIOlo = I010iIIOlo(I01101olii());
/* 47 */                float f = this.I010ioo.I000II() ? 0.0f : this.I010ioo.I00000oIO;
/* 60 */                float f2 = this.I010ioo.I000II() ? 0.0f : this.I010ioo.I00000oOI;
/* 78 */                float fI00Ol10 = this.I010ioo.I000II() ? I00Ol10() : this.I010ioo.I0000Il00O;
/* 96 */                float fI00Oio = this.I010ioo.I000II() ? I00Oio() : this.I010ioo.I0000O;
/* 102 */               int i = (int) (jI010iIIOlo >> 32);
/* 108 */               iI1i0i0ilO.I00000oOI = f - Float.intBitsToFloat(i);
/* 116 */               int i2 = (int) (jI010iIIOlo & 4294967295L);
/* 122 */               iI1i0i0ilO.I0000Il00O = f2 - Float.intBitsToFloat(i2);
/* 129 */               iI1i0i0ilO.I0000O = Float.intBitsToFloat(i) + fI00Ol10;
/* 136 */               iI1i0i0ilO.I0000oI00 = Float.intBitsToFloat(i2) + fI00Oio;
/* 138 */               while (this != o0iOOo0IiI0000Il00O) {
/* 142 */                   this.I01I1Oo0oll(iI1i0i0ilO, false, true);
/* 149 */                   if (!iI1i0i0ilO.I00000oOI()) {
/* 154 */                       this = this.I00oli;
                            }
                        }
/* 167 */               return new OOo0IO(iI1i0i0ilO.I00000oOI, iI1i0i0ilO.I0000Il00O, iI1i0i0ilO.I0000O, iI1i0i0ilO.I0000oI00);
                    }
/* 151 */           return OOo0IO.I0000oI00;
                }

                public final void I01Iio10lo(OIIlIII0Ili oIIlIII0Ili, float[] fArr) {
                    float[] fArrI00000oIO;
/* 5 */             if (O0000Ioio00.I0000O(oIIlIII0Ili, this)) {
/* 106 */               return;
                    }
/* 9 */             this.I00oli.I01Iio10lo(oIIlIII0Ili, fArr);
/* 20 */            if (!IooO0O.I0000Il00O(this.I010I0, 0L)) {
/* 22 */                float[] fArr2 = I011Ill;
/* 24 */                O1i010l1l.I0000oI00(fArr2);
/* 27 */                long j = this.I010I0;
/* 45 */                O1i010l1l.I000O01llI0(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
/* 48 */                O1i010l1l.I000II(fArr, fArr2);
                    }
/* 51 */            OIlIooO oIlIooO = this.I01101olii;
/* 53 */            if (oIlIooO == null || (fArrI00000oIO = ((Io10OIiiOll) oIlIooO).I00000oIO()) == null) {
/* 106 */               return;
                    }
/* 63 */            O1i010l1l.I000II(fArr, fArrI00000oIO);
                }

                public final void I01IlIoOI(OIIlIII0Ili oIIlIII0Ili, float[] fArr) {
/* 5 */             while (!this.equals(oIIlIII0Ili)) {
/* 7 */                 OIlIooO oIlIooO = this.I01101olii;
/* 9 */                 if (oIlIooO != null) {
/* 17 */                    O1i010l1l.I000II(fArr, ((Io10OIiiOll) oIlIooO).I00000oOI());
                        }
/* 28 */                if (!IooO0O.I0000Il00O(this.I010I0, 0L)) {
/* 30 */                    float[] fArr2 = I011Ill;
/* 32 */                    O1i010l1l.I0000oI00(fArr2);
/* 49 */                    O1i010l1l.I000O01llI0(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
/* 52 */                    O1i010l1l.I000II(fArr, fArr2);
                        }
/* 55 */                this = this.I00oli;
                    }
                }

                public final void I01Ilioliio(Function1 function1, boolean z) {
                    OIlO000O01 oIlO000O01;
                    OI110O0 oi110o0;
                    Reference referencePoll;
/* 1 */             if (function1 != null && this.I0110OiO != null) {
/* 10 */                IolioOO1.I00000oIO("layerBlock can't be provided when explicitLayer is provided");
                    }
/* 15 */            O0iiOioolIi o0iiOioolIi = this.I00oO101o;
/* 42 */            boolean z2 = (!z && this.I00ooIo0 == function1 && O0000Ioio00.I0000O(this.I00ooiO1I, o0iiOioolIi.I00oliIiO01i) && this.I00oooO == o0iiOioolIi.I00oo1iO0ll) ? false : true;
/* 45 */            this.I00ooiO1I = o0iiOioolIi.I00oliIiO01i;
/* 49 */            this.I00oooO = o0iiOioolIi.I00oo1iO0ll;
/* 51 */            boolean zI00Io1lO = o0iiOioolIi.I00Io1lO();
/* 55 */            OIIl1io oIIl1io = this.I010oio1OO0;
/* 58 */            if (zI00Io1lO && function1 != null) {
/* 62 */                this.I00ooIo0 = function1;
/* 66 */                if (this.I01101olii != null) {
/* 106 */                   if (z2) {
/* 108 */                       I01Ilo0i(true);
/* 111 */                       return;
                            }
/* 111 */                   return;
                        }
/* 78 */                OIlIooO oIlIooOI0000oI00 = ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi)).I0000oI00(I010oio1OO0(), oIIl1io, null);
/* 85 */                Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooOI0000oI00;
/* 87 */                io10OIiiOll.I0000oI00(this.I00iiO);
/* 92 */                io10OIiiOll.I0000O(this.I010I0);
/* 95 */                this.I01101olii = oIlIooOI0000oI00;
/* 97 */                I01Ilo0i(true);
/* 100 */               o0iiOioolIi.I010i10l = true;
/* 102 */               oIIl1io.invoke();
/* 105 */               return;
                    }
/* 112 */           this.I00ooIo0 = null;
/* 114 */           OIlIooO oIlIooO = this.I01101olii;
/* 116 */           if (oIlIooO != null) {
/* 118 */               Io10OIiiOll io10OIiiOll2 = (Io10OIiiOll) oIlIooO;
/* 128 */               if (!l1II0lo.I00000oIO(io10OIiiOll2.I00000oOI())) {
/* 130 */                   o0iiOioolIi.I00O0i0ii(this);
                        }
/* 133 */               io10OIiiOll2.I00iio = null;
/* 135 */               io10OIiiOll2.I00ilI0I1 = null;
/* 137 */               io10OIiiOll2.I00io1l = true;
/* 139 */               io10OIiiOll2.I0001Ioi1lo(false);
/* 142 */               Io10IIII io10IIII = io10OIiiOll2.I00iiI;
/* 144 */               if (io10IIII != null) {
/* 148 */                   io10IIII.I00000oIO(io10OIiiOll2.I00iOIl);
/* 151 */                   I0lio1O01i01 i0lio1O01i01 = io10OIiiOll2.I00iiO;
/* 153 */                   i000IO i000io = i0lio1O01i01.I01I0Iioooo0;
/* 172 */                   do {
/* 157 */                       ReferenceQueue referenceQueue = (ReferenceQueue) i000io.I00iiO;
/* 161 */                       oi110o0 = (OI110O0) i000io.I00iiI;
/* 163 */                       referencePoll = referenceQueue.poll();
/* 167 */                       if (referencePoll != null) {
/* 169 */                           oi110o0.I000iOII(referencePoll);
                                }
/* 172 */                   } while (referencePoll != null);
/* 183 */                   oi110o0.I00000oOI(new WeakReference(io10OIiiOll2, (ReferenceQueue) i000io.I00iiO));
/* 188 */                   i0lio1O01i01.I00oo1iO0ll.I000iOII(io10OIiiOll2);
                        }
/* 191 */               this.I01101olii = null;
/* 193 */               o0iiOioolIi.I010i10l = true;
/* 195 */               oIIl1io.invoke();
/* 204 */               if (I0110OiO().I00lll10 && o0iiOioolIi.I00Io1o110i() && (oIlO000O01 = o0iiOioolIi.I00o0iI0io1) != null) {
/* 218 */                   ((I0lio1O01i01) oIlO000O01).I001IO000(o0iiOioolIi);
                        }
                    }
/* 221 */           this.I01101IOlO = false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I01Ilo0i(boolean z) {
                    O0iiOioolIi o0iiOioolIi;
                    float f;
                    Object[] objArr;
                    long j;
                    boolean z2;
                    O0iiOioolIi o0iiOioolIi2;
                    int i;
                    IllOOo00lI illOOo00lI;
/* 5 */             if (this.I0110OiO != null) {
/* 1297 */              return;
                    }
/* 9 */             OIlIooO oIlIooO = this.I01101olii;
/* 11 */            Function1 function1 = this.I00ooIo0;
/* 13 */            if (oIlIooO == null) {
/* 1295 */              if (function1 == null) {
/* 1297 */                  return;
                        }
/* 1300 */              IolioOO1.I0000Il00O("null layer with a non-null layerBlock");
/* 2856 */              return;
                    }
/* 15 */            if (function1 == null) {
/* 1294 */              throw IIlIOloOOO.I000OOo1O("updateLayerParameters requires a non-null layerBlock");
                    }
/* 17 */            Oi11lOiIoi oi11lOiIoi = I011IO1I11OI;
/* 19 */            oi11lOiIoi.I00000oOI();
/* 22 */            O0iiOioolIi o0iiOioolIi3 = this.I00oO101o;
/* 26 */            oi11lOiIoi.I00oIiI10 = o0iiOioolIi3.I00oliIiO01i;
/* 30 */            oi11lOiIoi.I00oO101o = o0iiOioolIi3.I00oo1iO0ll;
/* 38 */            oi11lOiIoi.I00oI0i = l000O1l.I00000oOI(this.I00iiO);
/* 42 */            OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 51 */            OIlOIi0 snapshotObserver = ((I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi3)).getSnapshotObserver();
/* 58 */            O1oiilO o1oiilO = new O1oiilO(4);
/* 61 */            o1oiilO.I00iiI = function1;
/* 63 */            o1oiilO.I00iiO = this;
/* 65 */            o1oiilO.I00iio = oOo0l0ii10l;
/* 67 */            VarHandle.storeStoreFence();
/* 74 */            snapshotObserver.I00000oIO.I0000oI00(this, I0110o, o1oiilO);
/* 77 */            O0iOIliOil0 o0iOIliOil0 = this.I010i10l;
/* 79 */            if (o0iOIliOil0 == null) {
/* 83 */                o0iOIliOil0 = new O0iOIliOil0();
/* 86 */                this.I010i10l = o0iOIliOil0;
                    }
/* 88 */            O0iOIliOil0 o0iOIliOil02 = I011IOil;
/* 90 */            o0iOIliOil02.getClass();
/* 95 */            o0iOIliOil02.I00000oIO = o0iOIliOil0.I00000oIO;
/* 99 */            o0iOIliOil02.I00000oOI = o0iOIliOil0.I00000oOI;
/* 103 */           o0iOIliOil02.I0000Il00O = o0iOIliOil0.I0000Il00O;
/* 107 */           o0iOIliOil02.I0000O = o0iOIliOil0.I0000O;
/* 111 */           o0iOIliOil02.I0000oI00 = o0iOIliOil0.I0000oI00;
/* 115 */           o0iOIliOil02.I0001Ioi1lo = o0iOIliOil0.I0001Ioi1lo;
/* 119 */           o0iOIliOil02.I000II = o0iOIliOil0.I000II;
/* 123 */           o0iOIliOil02.I000O01llI0 = o0iOIliOil0.I000O01llI0;
/* 127 */           o0iOIliOil02.I000OOo1O = o0iOIliOil0.I000OOo1O;
/* 131 */           o0iOIliOil0.I00000oIO = oi11lOiIoi.I00iiI;
/* 135 */           o0iOIliOil0.I00000oOI = oi11lOiIoi.I00iiO;
/* 139 */           o0iOIliOil0.I0000Il00O = oi11lOiIoi.I00ilI0I1;
/* 143 */           o0iOIliOil0.I0000O = oi11lOiIoi.I00ilO0;
/* 147 */           o0iOIliOil0.I0000oI00 = oi11lOiIoi.I00l0OO0IO;
/* 151 */           o0iOIliOil0.I0001Ioi1lo = oi11lOiIoi.I00li1OI;
/* 155 */           o0iOIliOil0.I000II = oi11lOiIoi.I00ll1;
/* 159 */           o0iOIliOil0.I000O01llI0 = oi11lOiIoi.I00lli11;
/* 163 */           o0iOIliOil0.I000OOo1O = oi11lOiIoi.I00lll10;
/* 165 */           Io10OIiiOll io10OIiiOll = (Io10OIiiOll) oIlIooO;
/* 167 */           I0lio1O01i01 i0lio1O01i01 = io10OIiiOll.I00iiO;
/* 173 */           int i2 = oi11lOiIoi.I00iOIl | io10OIiiOll.I00lll10;
/* 176 */           io10OIiiOll.I00ll1 = oi11lOiIoi.I00oO101o;
/* 178 */           IiIooOOOI iiIooOOOI = oi11lOiIoi.I00oIiI10;
/* 180 */           io10OIiiOll.I00li1OI = iiIooOOOI;
/* 186 */           if ((1048576 & i2) != 0) {
/* 188 */               Io10IOI io10IOI = io10OIiiOll.I00iOIl;
/* 192 */               oi11lOiIoi.I00oII.getClass();
/* 195 */               int iI00l0OO0IO = iiIooOOOI.I00l0OO0IO(0.0f);
/* 201 */               oi11lOiIoi.I00oII.getClass();
/* 204 */               int iI00l0OO0IO2 = iiIooOOOI.I00l0OO0IO(0.0f);
/* 210 */               oi11lOiIoi.I00oII.getClass();
/* 213 */               int iI00l0OO0IO3 = iiIooOOOI.I00l0OO0IO(0.0f);
/* 219 */               oi11lOiIoi.I00oII.getClass();
/* 222 */               int iI00l0OO0IO4 = iiIooOOOI.I00l0OO0IO(0.0f);
/* 226 */               io10IOI.I001IO000 = iI00l0OO0IO;
/* 228 */               io10IOI.I001i1O0Ol = iI00l0OO0IO2;
/* 230 */               io10IOI.I001i1lo1io = iI00l0OO0IO3;
/* 232 */               io10IOI.I001iOo1i0O = iI00l0OO0IO4;
/* 234 */               Io10OiIIOi0o io10OiIIOi0o = io10IOI.I00000oIO;
/* 236 */               if (iI00l0OO0IO < 0 || iI00l0OO0IO2 < 0 || iI00l0OO0IO3 < 0 || iI00l0OO0IO4 < 0) {
/* 251 */                   f = 0.0f;
/* 255 */                   o0iiOioolIi = o0iiOioolIi3;
/* 259 */                   StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("Outsets cannot be negative! Left: ", iI00l0OO0IO, ", Top: ", iI00l0OO0IO2, ", Right: ");
/* 263 */                   sbI0010I0i.append(iI00l0OO0IO3);
/* 268 */                   sbI0010I0i.append(", Bottom: ");
/* 271 */                   sbI0010I0i.append(iI00l0OO0IO4);
/* 278 */                   Iolilol.I00000oIO(sbI0010I0i.toString());
                        } else {
/* 244 */                   o0iiOioolIi = o0iiOioolIi3;
/* 246 */                   f = 0.0f;
                        }
/* 281 */               int i3 = io10OiIIOi0o.I001i1lo1io;
/* 283 */               if (iI00l0OO0IO != i3 || iI00l0OO0IO2 != io10OiIIOi0o.I001iOo1i0O || iI00l0OO0IO3 != io10OiIIOi0o.I001l0I00 || iI00l0OO0IO4 != io10OiIIOi0o.I001lIiIIo1O) {
/* 306 */                   boolean z3 = (iI00l0OO0IO == i3 && iI00l0OO0IO2 == io10OiIIOi0o.I001iOo1i0O) ? false : true;
/* 307 */                   io10OiIIOi0o.I001i1lo1io = iI00l0OO0IO;
/* 309 */                   io10OiIIOi0o.I001iOo1i0O = iI00l0OO0IO2;
/* 311 */                   io10OiIIOi0o.I001l0I00 = iI00l0OO0IO3;
/* 313 */                   io10OiIIOi0o.I001lIiIIo1O = iI00l0OO0IO4;
/* 315 */                   io10OiIIOi0o.I0000oI00();
/* 318 */                   if (z3) {
/* 320 */                       io10OiIIOi0o.I0000O();
                            }
                        }
/* 323 */               io10OIiiOll.I0000Il00O();
                    } else {
/* 327 */               o0iiOioolIi = o0iiOioolIi3;
/* 329 */               f = 0.0f;
                    }
/* 331 */           int i4 = i2 & Barcode.FORMAT_AZTEC;
/* 333 */           if (i4 != 0) {
/* 337 */               io10OIiiOll.I00o0iI0io1 = oi11lOiIoi.I00lll10;
                    }
/* 341 */           if ((i2 & 1) != 0) {
/* 343 */               Io10IOI io10IOI2 = io10OIiiOll.I00iOIl;
/* 345 */               float f2 = oi11lOiIoi.I00iiI;
/* 347 */               Io10OiIIOi0o io10OiIIOi0o2 = io10IOI2.I00000oIO;
/* 353 */               if (io10OiIIOi0o2.I000l1 != f2) {
/* 356 */                   io10OiIIOi0o2.I000l1 = f2;
/* 360 */                   io10OiIIOi0o2.I0000Il00O.setScaleX(f2);
                        }
                    }
/* 365 */           if ((i2 & 2) != 0) {
/* 367 */               Io10IOI io10IOI3 = io10OIiiOll.I00iOIl;
/* 369 */               float f3 = oi11lOiIoi.I00iiO;
/* 371 */               Io10OiIIOi0o io10OiIIOi0o3 = io10IOI3.I00000oIO;
/* 377 */               if (io10OiIIOi0o3.I000lI != f3) {
/* 380 */                   io10OiIIOi0o3.I000lI = f3;
/* 384 */                   io10OiIIOi0o3.I0000Il00O.setScaleY(f3);
                        }
                    }
/* 389 */           if ((i2 & 4) != 0) {
/* 395 */               io10OIiiOll.I00iOIl.I000II(oi11lOiIoi.I00iio);
                    }
/* 400 */           if ((i2 & 8) != 0) {
/* 402 */               Io10IOI io10IOI4 = io10OIiiOll.I00iOIl;
/* 404 */               float f4 = oi11lOiIoi.I00ilI0I1;
/* 406 */               Io10OiIIOi0o io10OiIIOi0o4 = io10IOI4.I00000oIO;
/* 412 */               if (io10OiIIOi0o4.I000o00OoI0I != f4) {
/* 415 */                   io10OiIIOi0o4.I000o00OoI0I = f4;
/* 419 */                   io10OiIIOi0o4.I0000Il00O.setTranslationX(f4);
                        }
                    }
/* 424 */           if ((i2 & 16) != 0) {
/* 426 */               Io10IOI io10IOI5 = io10OIiiOll.I00iOIl;
/* 428 */               float f5 = oi11lOiIoi.I00ilO0;
/* 430 */               Io10OiIIOi0o io10OiIIOi0o5 = io10IOI5.I00000oIO;
/* 436 */               if (io10OiIIOi0o5.I000oI1ioi != f5) {
/* 439 */                   io10OiIIOi0o5.I000oI1ioi = f5;
/* 443 */                   io10OiIIOi0o5.I0000Il00O.setTranslationY(f5);
                        }
                    }
/* 448 */           if ((i2 & 32) != 0) {
/* 450 */               Io10IOI io10IOI6 = io10OIiiOll.I00iOIl;
/* 452 */               float f6 = oi11lOiIoi.I00io1l;
/* 454 */               Io10OiIIOi0o io10OiIIOi0o6 = io10IOI6.I00000oIO;
/* 460 */               if (io10OiIIOi0o6.I00100l0 != f6) {
/* 463 */                   io10OiIIOi0o6.I00100l0 = f6;
/* 467 */                   io10OiIIOi0o6.I0000Il00O.setElevation(f6);
/* 471 */                   io10IOI6.I000II = true;
/* 473 */                   io10IOI6.I00000oIO();
                        }
/* 480 */               if (oi11lOiIoi.I00io1l > f && !io10OIiiOll.I00oIiI10 && (illOOo00lI = io10OIiiOll.I00ilI0I1) != null) {
/* 490 */                   illOOo00lI.invoke();
                        }
                    }
/* 495 */           if ((i2 & 64) != 0) {
/* 497 */               Io10IOI io10IOI7 = io10OIiiOll.I00iOIl;
/* 499 */               long j2 = oi11lOiIoi.I00ioIO;
/* 501 */               Io10OiIIOi0o io10OiIIOi0o7 = io10IOI7.I00000oIO;
/* 503 */               long j3 = io10OiIIOi0o7.I00100o1O0lo;
/* 505 */               int i5 = IOOiio0i.I000oI1ioi;
/* 511 */               if (!Ooi0i1.I00000oOI(j2, j3)) {
/* 513 */                   io10OiIIOi0o7.I00100o1O0lo = j2;
/* 521 */                   io10OiIIOi0o7.I0000Il00O.setAmbientShadowColor(iiO01ll11o1l.I000OOo1O(j2));
                        }
                    }
/* 526 */           if ((i2 & Barcode.FORMAT_ITF) != 0) {
/* 528 */               Io10IOI io10IOI8 = io10OIiiOll.I00iOIl;
/* 530 */               long j4 = oi11lOiIoi.I00l0I0l0lO1;
/* 532 */               Io10OiIIOi0o io10OiIIOi0o8 = io10IOI8.I00000oIO;
/* 534 */               long j5 = io10OiIIOi0o8.I0010I0i;
/* 536 */               int i6 = IOOiio0i.I000oI1ioi;
/* 542 */               if (!Ooi0i1.I00000oOI(j4, j5)) {
/* 544 */                   io10OiIIOi0o8.I0010I0i = j4;
/* 552 */                   io10OiIIOi0o8.I0000Il00O.setSpotShadowColor(iiO01ll11o1l.I000OOo1O(j4));
                        }
                    }
/* 557 */           if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
/* 559 */               Io10IOI io10IOI9 = io10OIiiOll.I00iOIl;
/* 561 */               float f7 = oi11lOiIoi.I00ll1;
/* 563 */               Io10OiIIOi0o io10OiIIOi0o9 = io10IOI9.I00000oIO;
/* 569 */               if (io10OiIIOi0o9.I001IIilI0O != f7) {
/* 572 */                   io10OiIIOi0o9.I001IIilI0O = f7;
/* 576 */                   io10OiIIOi0o9.I0000Il00O.setRotationZ(f7);
                        }
                    }
/* 581 */           if ((i2 & Barcode.FORMAT_QR_CODE) != 0) {
/* 583 */               Io10IOI io10IOI10 = io10OIiiOll.I00iOIl;
/* 585 */               float f8 = oi11lOiIoi.I00l0OO0IO;
/* 587 */               Io10OiIIOi0o io10OiIIOi0o10 = io10IOI10.I00000oIO;
/* 593 */               if (io10OiIIOi0o10.I0010o != f8) {
/* 596 */                   io10OiIIOi0o10.I0010o = f8;
/* 600 */                   io10OiIIOi0o10.I0000Il00O.setRotationX(f8);
                        }
                    }
/* 605 */           if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
/* 607 */               Io10IOI io10IOI11 = io10OIiiOll.I00iOIl;
/* 609 */               float f9 = oi11lOiIoi.I00li1OI;
/* 611 */               Io10OiIIOi0o io10OiIIOi0o11 = io10IOI11.I00000oIO;
/* 617 */               if (io10OiIIOi0o11.I00111O != f9) {
/* 620 */                   io10OiIIOi0o11.I00111O = f9;
/* 624 */                   io10OiIIOi0o11.I0000Il00O.setRotationY(f9);
                        }
                    }
/* 629 */           if ((i2 & Barcode.FORMAT_PDF417) != 0) {
/* 631 */               Io10IOI io10IOI12 = io10OIiiOll.I00iOIl;
/* 633 */               float f10 = oi11lOiIoi.I00lli11;
/* 635 */               Io10OiIIOi0o io10OiIIOi0o12 = io10IOI12.I00000oIO;
/* 641 */               if (io10OiIIOi0o12.I001IO000 != f10) {
/* 644 */                   io10OiIIOi0o12.I001IO000 = f10;
/* 648 */                   io10OiIIOi0o12.I0000Il00O.setCameraDistance(f10);
                        }
                    }
/* 658 */           if (i4 != 0) {
/* 662 */               j = 4294967295L;
/* 669 */               boolean zI00000oOI = OoI0l01O.I00000oOI(io10OIiiOll.I00o0iI0io1, OoI0l01O.I00000oOI);
/* 673 */               Io10IOI io10IOI13 = io10OIiiOll.I00iOIl;
/* 675 */               if (zI00000oOI) {
/* 677 */                   io10IOI13.I000OOo1O(9205357640488583168L);
/* 680 */                   objArr = 32;
                        } else {
/* 693 */                   float fI0000Il00O = OoI0l01O.I0000Il00O(io10OIiiOll.I00o0iI0io1) * ((int) (io10OIiiOll.I00ilO0 >> 32));
/* 706 */                   float fI0000O = OoI0l01O.I0000O(io10OIiiOll.I00o0iI0io1) * ((int) (io10OIiiOll.I00ilO0 & 4294967295L));
/* 707 */                   long jFloatToRawIntBits = Float.floatToRawIntBits(fI0000Il00O);
/* 712 */                   int iFloatToRawIntBits = Float.floatToRawIntBits(fI0000O);
/* 716 */                   objArr = 32;
/* 726 */                   io10IOI13.I000OOo1O((jFloatToRawIntBits << 32) | (iFloatToRawIntBits & 4294967295L));
                        }
                    } else {
/* 730 */               objArr = 32;
/* 731 */               j = 4294967295L;
                    }
/* 738 */           if ((i2 & 16384) != 0) {
/* 740 */               Io10IOI io10IOI14 = io10OIiiOll.I00iOIl;
/* 742 */               boolean z4 = oi11lOiIoi.I00o0l1o1o0;
/* 746 */               if (io10IOI14.I001lIiIIo1O != z4) {
/* 748 */                   io10IOI14.I001lIiIIo1O = z4;
/* 751 */                   io10IOI14.I000II = true;
/* 753 */                   io10IOI14.I00000oIO();
                        }
                    }
/* 759 */           if ((131072 & i2) != 0) {
/* 763 */               Io10OiIIOi0o io10OiIIOi0o13 = io10OIiiOll.I00iOIl.I00000oIO;
                    }
/* 768 */           if ((262144 & i2) != 0) {
/* 770 */               Io10IOI io10IOI15 = io10OIiiOll.I00iOIl;
/* 772 */               IOOil0 iOOil0 = oi11lOiIoi.I00oOio10iI1;
/* 774 */               Io10OiIIOi0o io10OiIIOi0o14 = io10IOI15.I00000oIO;
/* 782 */               if (!O0000Ioio00.I0000O(io10OiIIOi0o14.I000OiO, iOOil0)) {
/* 784 */                   io10OiIIOi0o14.I000OiO = iOOil0;
/* 786 */                   Paint paint = io10OiIIOi0o14.I0000oI00;
/* 788 */                   if (paint == null) {
/* 792 */                       paint = new Paint();
/* 795 */                       io10OiIIOi0o14.I0000oI00 = paint;
                            }
/* 803 */                   paint.setColorFilter(iOOil0 != null ? iOOil0.I00000oIO : null);
/* 806 */                   io10OiIIOi0o14.I0000Il00O();
                        }
                    }
/* 812 */           if ((524288 & i2) != 0) {
/* 814 */               Io10IOI io10IOI16 = io10OIiiOll.I00iOIl;
/* 816 */               int i7 = oi11lOiIoi.I00ol1;
/* 818 */               Io10OiIIOi0o io10OiIIOi0o15 = io10IOI16.I00000oIO;
/* 822 */               if (io10OiIIOi0o15.I000OOo1O != i7) {
/* 825 */                   io10OiIIOi0o15.I000OOo1O = i7;
/* 827 */                   Paint paint2 = io10OiIIOi0o15.I0000oI00;
/* 829 */                   if (paint2 == null) {
/* 833 */                       paint2 = new Paint();
/* 836 */                       io10OiIIOi0o15.I0000oI00 = paint2;
                            }
/* 842 */                   paint2.setBlendMode(iOIill.I00000oIO(i7));
/* 845 */                   io10OiIIOi0o15.I0000Il00O();
                        }
                    }
/* 852 */           if ((32768 & i2) != 0) {
/* 854 */               Io10IOI io10IOI17 = io10OIiiOll.I00iOIl;
/* 856 */               int i8 = oi11lOiIoi.I00o101lO;
/* 858 */               if (i8 == 0) {
/* 860 */                   i = 0;
                        } else if (i8 == 1) {
/* 865 */                   i = 1;
                        } else {
/* 867 */                   i = 2;
/* 868 */                   if (i8 != 2) {
/* 876 */                       I000II.I001IO000("Not supported composition strategy");
/* 879 */                       return;
                            }
                        }
/* 870 */               io10IOI17.I000O01llI0(i);
                    }
/* 882 */           if ((i2 & 7963) != 0) {
/* 885 */               io10OIiiOll.I00o101lO = true;
/* 887 */               io10OIiiOll.I00oI0i = true;
                    }
/* 897 */           if (O0000Ioio00.I0000O(io10OIiiOll.I00o0l1o1o0, oi11lOiIoi.I00olI)) {
/* 1105 */              z2 = false;
                    } else {
/* 899 */               l1lOoiII1l l1looiii1l = oi11lOiIoi.I00olI;
/* 901 */               io10OIiiOll.I00o0l1o1o0 = l1looiii1l;
/* 903 */               if (l1looiii1l != null) {
/* 907 */                   Io10IOI io10IOI18 = io10OIiiOll.I00iOIl;
/* 911 */                   if (l1looiii1l instanceof OIioiIl) {
/* 915 */                       OOo0IO oOo0IO = ((OIioiIl) l1looiii1l).I00000oIO;
/* 917 */                       float f11 = oOo0IO.I00000oIO;
/* 919 */                       float f12 = oOo0IO.I00000oOI;
/* 926 */                       Object[] objArr2 = objArr;
/* 965 */                       io10IOI18.I000iOII(0.0f, (Float.floatToRawIntBits(f11) << (objArr2 == true ? 1L : 0L)) | (Float.floatToRawIntBits(f12) & j), (Float.floatToRawIntBits(oOo0IO.I0000Il00O - f11) << (objArr2 == true ? 1L : 0L)) | (Float.floatToRawIntBits(oOo0IO.I0000O - f12) & j));
                            } else {
/* 970 */                       Object[] objArr3 = objArr;
/* 977 */                       if (l1looiii1l instanceof OIio1O0ll0I) {
/* 981 */                           I0ol0lI i0ol0lI = ((OIio1O0ll0I) l1looiii1l).I00000oIO;
/* 984 */                           io10IOI18.I000iOII = null;
/* 986 */                           io10IOI18.I000OOo1O = 9205357640488583168L;
/* 988 */                           io10IOI18.I000O01llI0 = 0L;
/* 992 */                           io10IOI18.I000OiO = f;
/* 995 */                           io10IOI18.I000II = true;
/* 998 */                           io10IOI18.I000o00OoI0I = false;
/* 1000 */                          io10IOI18.I000l1 = i0ol0lI;
/* 1002 */                          io10IOI18.I00000oIO();
                                } else {
/* 1008 */                          if (!(l1looiii1l instanceof OIiolOlo1iI)) {
/* 1101 */                              I000II.I00000oIO();
/* 1104 */                              return;
                                    }
/* 1010 */                          OIiolOlo1iI oIiolOlo1iI = (OIiolOlo1iI) l1looiii1l;
/* 1012 */                          I0ol0lI i0ol0lI2 = oIiolOlo1iI.I00000oOI;
/* 1014 */                          if (i0ol0lI2 != null) {
/* 1017 */                              io10IOI18.I000iOII = null;
/* 1019 */                              io10IOI18.I000OOo1O = 9205357640488583168L;
/* 1021 */                              io10IOI18.I000O01llI0 = 0L;
/* 1024 */                              io10IOI18.I000OiO = 0.0f;
/* 1027 */                              io10IOI18.I000II = true;
/* 1030 */                              io10IOI18.I000o00OoI0I = false;
/* 1032 */                              io10IOI18.I000l1 = i0ol0lI2;
/* 1034 */                              io10IOI18.I00000oIO();
                                    } else {
/* 1096 */                              io10IOI18.I000iOII(Float.intBitsToFloat((int) (oIiolOlo1iI.I00000oIO.I000O01llI0 >> (objArr3 == true ? 1L : 0L))), (Float.floatToRawIntBits(r4.I00000oIO) << (objArr3 == true ? 1L : 0L)) | (Float.floatToRawIntBits(r4.I00000oOI) & j), (Float.floatToRawIntBits(r4.I00000oOI()) << (objArr3 == true ? 1L : 0L)) | (Float.floatToRawIntBits(r4.I00000oIO()) & j));
                                    }
                                }
                            }
                        }
/* 1099 */              z2 = true;
                    }
/* 1108 */          io10OIiiOll.I00lll10 = oi11lOiIoi.I00iOIl;
/* 1110 */          if (i2 != 0 || z2) {
/* 1114 */              ViewParent parent = i0lio1O01i01.getParent();
/* 1118 */              if (parent != null) {
/* 1120 */                  parent.onDescendantInvalidated(i0lio1O01i01, i0lio1O01i01);
                        }
/* 1127 */              if (I0lio1O01i01.I000l1()) {
/* 1130 */                  i0lio1O01i01.I00Io1lO(0.0f);
                        }
                    }
/* 1133 */          boolean z5 = this.I00oo1iO0ll;
/* 1137 */          this.I00oo1iO0ll = oi11lOiIoi.I00o0l1o1o0;
/* 1141 */          this.I0100i = oi11lOiIoi.I00iio;
/* 1219 */          boolean z6 = o0iOIliOil02.I00000oIO == o0iOIliOil0.I00000oIO && o0iOIliOil02.I00000oOI == o0iOIliOil0.I00000oOI && o0iOIliOil02.I0000Il00O == o0iOIliOil0.I0000Il00O && o0iOIliOil02.I0000O == o0iOIliOil0.I0000O && o0iOIliOil02.I0000oI00 == o0iOIliOil0.I0000oI00 && o0iOIliOil02.I0001Ioi1lo == o0iOIliOil0.I0001Ioi1lo && o0iOIliOil02.I000II == o0iOIliOil0.I000II && o0iOIliOil02.I000O01llI0 == o0iOIliOil0.I000O01llI0 && OoI0l01O.I00000oOI(o0iOIliOil02.I000OOo1O, o0iOIliOil0.I000OOo1O);
/* 1220 */          if (!z || (z6 && z5 == this.I00oo1iO0ll && !oOo0l0ii10l.I00iOIl)) {
/* 1235 */              o0iiOioolIi2 = o0iiOioolIi;
                    } else {
/* 1232 */              o0iiOioolIi2 = o0iiOioolIi;
/* 1238 */              OIlO000O01 oIlO000O01 = o0iiOioolIi2.I00o0iI0io1;
/* 1240 */              if (oIlO000O01 != null) {
/* 1244 */                  ((I0lio1O01i01) oIlO000O01).I001IO000(o0iiOioolIi2);
                        }
                    }
/* 1247 */          if (z6) {
/* 1297 */              return;
                    }
/* 1249 */          o0iiOioolIi2.I00O0i0ii(this);
/* 1254 */          if (o0iiOioolIi2.I010lI0oi > 0) {
/* 1260 */              I0lio1O01i01 i0lio1O01i012 = (I0lio1O01i01) O0iillo1ol0.I00000oIO(o0iiOioolIi2);
/* 1264 */              IoloOio0I ioloOio0I = i0lio1O01i012.I010l1ol111.I0000oI00;
/* 1266 */              ioloOio0I.getClass();
/* 1271 */              if (o0iiOioolIi2.I010lI0oi > 0) {
/* 1277 */                  ((OI110O0) ioloOio0I.I00iiI).I00000oOI(o0iiOioolIi2);
/* 1281 */                  o0iiOioolIi2.I010l1ol111 = true;
                        }
/* 1284 */              i0lio1O01i012.I00II0oii1o(null);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I01Io000(long j) {
                    boolean z;
                    boolean z2;
                    boolean zI00000oOI;
/* 27 */            if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
/* 431 */               return false;
                    }
/* 29 */            OIlIooO oIlIooO = this.I01101olii;
/* 31 */            if (oIlIooO == null || !this.I00oo1iO0ll) {
/* 428 */               return true;
                    }
/* 44 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
/* 56 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
/* 60 */            Io10IOI io10IOI = ((Io10OIiiOll) oIlIooO).I00iOIl;
/* 64 */            if (io10IOI.I001lIiIIo1O) {
/* 66 */                l1lOoiII1l l1looiii1lI0000O = io10IOI.I0000O();
/* 72 */                if (l1looiii1lI0000O instanceof OIioiIl) {
/* 76 */                    OOo0IO oOo0IO = ((OIioiIl) l1looiii1lI0000O).I00000oIO;
/* 82 */                    if (oOo0IO.I00000oIO > fIntBitsToFloat || fIntBitsToFloat >= oOo0IO.I0000Il00O || oOo0IO.I00000oOI > fIntBitsToFloat2 || fIntBitsToFloat2 >= oOo0IO.I0000O) {
/* 104 */                       z = false;
/* 106 */                       z2 = true;
                            }
/* 420 */                   z = false;
/* 422 */                   z2 = true;
                        } else if (l1looiii1lI0000O instanceof OIiolOlo1iI) {
/* 116 */                   OiI101I1oIi oiI101I1oIi = ((OIiolOlo1iI) l1looiii1lI0000O).I00000oIO;
/* 118 */                   float f = oiI101I1oIi.I00000oIO;
/* 120 */                   long j2 = oiI101I1oIi.I0001Ioi1lo;
/* 122 */                   long j3 = oiI101I1oIi.I000O01llI0;
/* 124 */                   long j4 = oiI101I1oIi.I000II;
/* 126 */                   float f2 = oiI101I1oIi.I0000O;
/* 130 */                   float f3 = oiI101I1oIi.I00000oOI;
/* 132 */                   z = false;
/* 134 */                   float f4 = oiI101I1oIi.I0000Il00O;
/* 138 */                   z2 = true;
/* 140 */                   long j5 = oiI101I1oIi.I0000oI00;
/* 144 */                   if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
/* 164 */                       int i = (int) (j5 >> 32);
/* 175 */                       int i2 = (int) (j2 >> 32);
/* 187 */                       if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= oiI101I1oIi.I00000oOI()) {
/* 191 */                           int i3 = (int) (j3 >> 32);
/* 201 */                           int i4 = (int) (j4 >> 32);
/* 213 */                           if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= oiI101I1oIi.I00000oOI()) {
/* 217 */                               int i5 = (int) (j5 & 4294967295L);
/* 224 */                               int i6 = (int) (j3 & 4294967295L);
/* 236 */                               if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= oiI101I1oIi.I00000oIO()) {
/* 240 */                                   int i7 = (int) (j2 & 4294967295L);
/* 247 */                                   int i8 = (int) (j4 & 4294967295L);
/* 259 */                                   if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= oiI101I1oIi.I00000oIO()) {
/* 265 */                                       float fIntBitsToFloat3 = Float.intBitsToFloat(i) + f;
/* 270 */                                       float fIntBitsToFloat4 = Float.intBitsToFloat(i5) + f3;
/* 275 */                                       float fIntBitsToFloat5 = f4 - Float.intBitsToFloat(i2);
/* 281 */                                       float fIntBitsToFloat6 = Float.intBitsToFloat(i7) + f3;
/* 286 */                                       float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i4);
/* 292 */                                       float fIntBitsToFloat8 = f2 - Float.intBitsToFloat(i8);
/* 298 */                                       float fIntBitsToFloat9 = f2 - Float.intBitsToFloat(i6);
/* 303 */                                       float fIntBitsToFloat10 = Float.intBitsToFloat(i3) + f;
/* 378 */                                       zI00000oOI = (fIntBitsToFloat >= fIntBitsToFloat3 || fIntBitsToFloat2 >= fIntBitsToFloat4) ? (fIntBitsToFloat >= fIntBitsToFloat10 || fIntBitsToFloat2 <= fIntBitsToFloat9) ? (fIntBitsToFloat <= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) ? (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) ? z2 : lOI1iO.I00000oOI(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, oiI101I1oIi.I000II) : lOI1iO.I00000oOI(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, oiI101I1oIi.I0001Ioi1lo) : lOI1iO.I00000oOI(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat10, fIntBitsToFloat9, oiI101I1oIi.I000O01llI0) : lOI1iO.I00000oOI(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, oiI101I1oIi.I0000oI00);
                                            } else {
/* 383 */                                       I0ol0lI i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 387 */                                       I0ol0lI.I0000Il00O(i0ol0lII00000oIO, oiI101I1oIi);
/* 390 */                                       zI00000oOI = lOI1iO.I00000oIO(fIntBitsToFloat, fIntBitsToFloat2, i0ol0lII00000oIO);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
/* 399 */                   z = false;
/* 401 */                   z2 = true;
/* 405 */                   if (!(l1looiii1lI0000O instanceof OIio1O0ll0I)) {
/* 416 */                       I000II.I00000oIO();
/* 399 */                       return false;
                            }
/* 411 */                   zI00000oOI = lOI1iO.I00000oIO(fIntBitsToFloat, fIntBitsToFloat2, ((OIio1O0ll0I) l1looiii1lI0000O).I00000oIO);
                        }
/* 395 */               zI00000oOI = z;
                    } else {
/* 420 */               z = false;
/* 422 */               z2 = true;
                    }
                    return zI00000oOI ? z2 : z;
                }

                @Override
                public final O0iOOoiioO getLayoutDirection() {
/* 3 */             return this.I00oO101o.I00oo1iO0ll;
                }

                @Override
/* 19 */        public final O0iOOo0Ii I00oIiI10() {
/* 20 */            return this;
                }
            }
