            package p000;
            
            public final class Oiili1Ol00 implements OlooOo {
                public long I00000oIO;
                public long I00000oOI;
                public boolean I0000Il00O;
                public Oiill0lI1il1 I0000O;

                @Override
                public final void I00000oIO(long j, OiiOloi1o oiiOloi1o) {
/* 1 */             boolean z = this.I0000Il00O;
/* 3 */             Oiill0lI1il1 oiill0lI1il1 = this.I0000O;
/* 9 */             if (oiill0lI1il1.I000O01llI0() == null) {
/* 62 */                return;
                    }
/* 12 */            OiiOlI0I oiiOlI0II000OOo1O = oiill0lI1il1.I000OOo1O();
/* 29 */            Object objI0000oI00 = oiill0lI1il1.I00iOIl.I0000Il00O.I0000oI00((z ? oiiOlI0II000OOo1O.I00000oIO : oiiOlI0II000OOo1O.I00000oOI).I0000Il00O);
/* 33 */            if (objI0000oI00 == null) {
/* 93 */                Ioll0IliO1l.I0000O("SelectionRegistrar should contain the current selection's selectableIds");
/* 96 */                IOOlIIilOl0.I0000Il00O();
/* 106 */               return;
                    }
/* 35 */            OI0i1o0iOo0 oI0i1o0iOo0 = (OI0i1o0iOo0) objI0000oI00;
/* 37 */            O0iOOo0Ii o0iOOo0IiI0000Il00O = oI0i1o0iOo0.I0000Il00O();
/* 41 */            if (o0iOOo0IiI0000Il00O == null) {
/* 84 */                Ioll0IliO1l.I0000O("Current selectable should have layout coordinates.");
/* 87 */                IOOlIIilOl0.I0000Il00O();
/* 90 */                return;
                    }
/* 43 */            long jI00000oIO = oI0i1o0iOo0.I00000oIO(oiiOlI0II000OOo1O, z);
/* 60 */            if ((9223372034707292159L & jI00000oIO) == 9205357640488583168L) {
/* 62 */                return;
                    }
/* 75 */            this.I00000oIO = oiill0lI1il1.I000lI().I00IoIO0lI(o0iOOo0IiI0000Il00O, Oiil1O.I00000oIO(jI00000oIO));
/* 79 */            this.I00000oOI = 0L;
                }

                @Override
                public final void I00000oOI() {
/* 1 */             Oiill0lI1il1 oiill0lI1il1 = this.I0000O;
/* 4 */             oiill0lI1il1.I00100l0(true);
/* 10 */            oiill0lI1il1.I00o0l1o1o0.setValue(null);
/* 15 */            oiill0lI1il1.I00o101lO.setValue(null);
                }

                @Override
                public final void I0000Il00O() {
/* 1 */             Oiill0lI1il1 oiill0lI1il1 = this.I0000O;
/* 4 */             oiill0lI1il1.I00100l0(true);
/* 10 */            oiill0lI1il1.I00o0l1o1o0.setValue(null);
/* 15 */            oiill0lI1il1.I00o101lO.setValue(null);
                }

                @Override
                public final void I0000O() {
                    OiiOlI0I oiiOlI0II000OOo1O;
                    O0iOOo0Ii o0iOOo0IiI0000Il00O;
/* 1 */             boolean z = this.I0000Il00O;
/* 3 */             Oiill0lI1il1 oiill0lI1il1 = this.I0000O;
/* 24 */            if ((z ? (OIOlIiiioi) oiill0lI1il1.I00lll10.getValue() : (OIOlIiiioi) oiill0lI1il1.I00o0iI0io1.getValue()) == null || (oiiOlI0II000OOo1O = oiill0lI1il1.I000OOo1O()) == null) {
/* 245 */               return;
                    }
/* 40 */            OI0i1o0iOo0 oI0i1o0iOo0I0001Ioi1lo = oiill0lI1il1.I0001Ioi1lo(z ? oiiOlI0II000OOo1O.I00000oIO : oiiOlI0II000OOo1O.I00000oOI);
/* 44 */            if (oI0i1o0iOo0I0001Ioi1lo == null || (o0iOOo0IiI0000Il00O = oI0i1o0iOo0I0001Ioi1lo.I0000Il00O()) == null) {
/* 245 */               return;
                    }
/* 54 */            long jI00000oIO = oI0i1o0iOo0I0001Ioi1lo.I00000oIO(oiiOlI0II000OOo1O, z);
/* 71 */            if ((9223372034707292159L & jI00000oIO) == 9205357640488583168L) {
/* 245 */               return;
                    }
/* 92 */            oiill0lI1il1.I00o101lO.setValue(OIOlIiiioi.I00000oIO(oiill0lI1il1.I000lI().I00IoIO0lI(o0iOOo0IiI0000Il00O, Oiil1O.I00000oIO(jI00000oIO))));
/* 104 */           oiill0lI1il1.I00o0l1o1o0.setValue(z ? Io11Oll.I00iiI : Io11Oll.I00iiO);
/* 108 */           oiill0lI1il1.I00100l0(false);
                }

                @Override
                public final void I0000oI00(long j) {
/* 1 */             Oiill0lI1il1 oiill0lI1il1 = this.I0000O;
/* 7 */             if (oiill0lI1il1.I000O01llI0() == null) {
/* 77 */                return;
                    }
/* 12 */            long jI000II = OIOlIiiioi.I000II(this.I00000oOI, j);
/* 16 */            this.I00000oOI = jI000II;
/* 20 */            long jI000II2 = OIOlIiiioi.I000II(this.I00000oIO, jI000II);
/* 34 */            if (oiill0lI1il1.I0010o(jI000II2, this.I00000oIO, this.I0000Il00O, loIOiIO1O1.I00l0OO0IO)) {
/* 36 */                this.I00000oIO = jI000II2;
/* 40 */                this.I00000oOI = 0L;
                    }
                }

                @Override
                public final void onCancel() {
/* 1 */             Oiill0lI1il1 oiill0lI1il1 = this.I0000O;
/* 4 */             oiill0lI1il1.I00100l0(true);
/* 10 */            oiill0lI1il1.I00o0l1o1o0.setValue(null);
/* 15 */            oiill0lI1il1.I00o101lO.setValue(null);
                }
            }
