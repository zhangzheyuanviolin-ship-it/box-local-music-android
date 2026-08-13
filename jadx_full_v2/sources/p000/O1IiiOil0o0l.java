            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import kotlin.jvm.functions.Function1;
            
            public abstract class O1IiiOil0o0l extends O1IiO0l implements O1iIo0ll {
                public final OIIlIII0Ili I00oO101o;
                public long I00oOio10iI1 = 0;
                public LinkedHashMap I00ol1;
                public final O1Iil010i10 I00olI;
                public O1iOIo0o0 I00oli;
                public final OI0o11I1 I00oliIiO01i;

                public O1IiiOil0o0l(OIIlIII0Ili oIIlIII0Ili) {
/* 4 */             this.I00oO101o = oIIlIII0Ili;
/* 12 */            O1Iil010i10 o1Iil010i10 = new O1Iil010i10();
/* 15 */            o1Iil010i10.I00iOIl = this;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            this.I00olI = o1Iil010i10;
/* 22 */            OI0o11I1 oI0o11I1 = OIOi1iO01.I00000oIO;
/* 29 */            this.I00oliIiO01i = new OI0o11I1();
                }

                @Override
                public final float I00000oIO() {
/* 3 */             return this.I00oO101o.I00000oIO();
                }

                @Override
                public final Object I00II0Ol1O0l() {
/* 3 */             return this.I00oO101o.I00II0Ol1O0l();
                }

                @Override
                public final float I00Ol00() {
/* 3 */             return this.I00oO101o.I00Ol00();
                }

                @Override
                public final boolean I00OloOo() {
/* 1 */             return true;
                }

                @Override
                public final void I00iIi0i1o(long j, float f, Function1 function1) {
/* 1 */             I010iIIOlo(j);
/* 6 */             if (this.I00lll10) {
/* 8 */                 return;
                    }
/* 9 */             I010i10l();
                }

                @Override
                public final O1IiO0l I00o0iI0io1() {
/* 3 */             OIIlIII0Ili oIIlIII0Ili = this.I00oO101o.I00olI;
/* 5 */             if (oIIlIII0Ili != null) {
/* 7 */                 return oIIlIII0Ili.I01101IOlO();
                    }
/* 12 */            return null;
                }

                @Override
                public final O0iOOo0Ii I00oIiI10() {
/* 1 */             return this.I00olI;
                }

                @Override
                public final boolean I00oOio10iI1() {
                    return this.I00oli != null;
                }

                @Override
                public final O0iiOioolIi I00olI() {
/* 3 */             return this.I00oO101o.I00oO101o;
                }

                @Override
                public final O1iOIo0o0 I00ooIo0() {
/* 1 */             O1iOIo0o0 o1iOIo0o0 = this.I00oli;
/* 3 */             if (o1iOIo0o0 != null) {
/* 5 */                 return o1iOIo0o0;
                    }
/* 20 */            throw IIlIOloOOO.I000OOo1O("LookaheadDelegate has not been measured yet when measureResult is requested.");
                }

                @Override
                public final O1IiO0l I00ooiO1I() {
/* 3 */             OIIlIII0Ili oIIlIII0Ili = this.I00oO101o.I00oli;
/* 5 */             if (oIIlIII0Ili != null) {
/* 7 */                 return oIIlIII0Ili.I01101IOlO();
                    }
/* 12 */            return null;
                }

                @Override
                public final long I00oooO() {
/* 1 */             return this.I00oOio10iI1;
                }

                @Override
                public final void I010I0() {
/* 5 */             I00iIi0i1o(this.I00oOio10iI1, 0.0f, null);
                }

                public final long I010OIo1l() {
/* 16 */            return (this.I00iOIl << 32) | (this.I00iiI & 4294967295L);
                }

                public void I010i10l() {
/* 5 */             I00ooIo0().I00000oIO();
                }

                public final void I010iIIOlo(long j) {
/* 7 */             if (!IooO0O.I0000Il00O(this.I00oOio10iI1, j)) {
/* 9 */                 this.I00oOio10iI1 = j;
/* 11 */                OIIlIII0Ili oIIlIII0Ili = this.I00oO101o;
/* 17 */                O1IioI o1IioI = oIIlIII0Ili.I00oO101o.I010I0.I00100o1O0lo;
/* 19 */                if (o1IioI != null) {
/* 21 */                    o1IioI.I00ll1();
                        }
/* 24 */                O1IiO0l.I0100o111I(oIIlIII0Ili);
                    }
/* 29 */            if (this.I00o0iI0io1) {
/* 77 */                return;
                    }
/* 35 */            I00ll1(I00ooIo0());
                }

                public final long I010ioo(O1IiiOil0o0l o1IiiOil0o0l, boolean z) {
/* 1 */             long jI0000oI00 = 0;
/* 7 */             while (!this.equals(o1IiiOil0o0l)) {
/* 11 */                if (!this.I00ll1 || !z) {
/* 17 */                    jI0000oI00 = IooO0O.I0000oI00(jI0000oI00, this.I00oOio10iI1);
                        }
/* 25 */                this = this.I00oO101o.I00oli.I01101IOlO();
                    }
/* 37 */            return jI0000oI00;
                }

                public final void I010l10O(O1iOIo0o0 o1iOIo0o0) {
                    LinkedHashMap linkedHashMap;
/* 1 */             if (o1iOIo0o0 != null) {
/* 23 */                I00iOIl((o1iOIo0o0.I0000O() & 4294967295L) | (o1iOIo0o0.I0001Ioi1lo() << 32));
                    } else {
/* 29 */                I00iOIl(0L);
                    }
/* 38 */            if (!O0000Ioio00.I0000O(this.I00oli, o1iOIo0o0) && o1iOIo0o0 != null && ((((linkedHashMap = this.I00ol1) != null && !linkedHashMap.isEmpty()) || !o1iOIo0o0.I00000oOI().isEmpty()) && !O0000Ioio00.I0000O(o1iOIo0o0.I00000oOI(), this.I00ol1))) {
/* 84 */                this.I00oO101o.I00oO101o.I010I0.I00100o1O0lo.I00oII.I0001Ioi1lo();
/* 87 */                LinkedHashMap linkedHashMap2 = this.I00ol1;
/* 89 */                if (linkedHashMap2 == null) {
/* 93 */                    linkedHashMap2 = new LinkedHashMap();
/* 96 */                    this.I00ol1 = linkedHashMap2;
                        }
/* 98 */                linkedHashMap2.clear();
/* 105 */               linkedHashMap2.putAll(o1iOIo0o0.I00000oOI());
                    }
/* 108 */           this.I00oli = o1iOIo0o0;
                }

                @Override
                public final O0iOOoiioO getLayoutDirection() {
/* 5 */             return this.I00oO101o.I00oO101o.I00oo1iO0ll;
                }
            }
