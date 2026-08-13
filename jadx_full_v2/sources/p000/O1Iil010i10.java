            package p000;
            
            public final class O1Iil010i10 implements O0iOOo0Ii {
                public O1IiiOil0o0l I00iOIl;

                public final long I00000oIO() {
/* 1 */             O1IiiOil0o0l o1IiiOil0o0l = this.I00iOIl;
/* 3 */             O1IiiOil0o0l o1IiiOil0o0lI00000oIO = l11OlI1O0lOo.I00000oIO(o1IiiOil0o0l);
/* 24 */            return OIOlIiiioi.I0001Ioi1lo(I00O0i0ii(o1IiiOil0o0lI00000oIO.I00olI, 0L, true), o1IiiOil0o0l.I00oO101o.I00O0i0ii(o1IiiOil0o0lI00000oIO.I00oO101o, 0L, true));
                }

                @Override
                public final long I0000O(long j) {
/* 13 */            return this.I00iOIl.I00oO101o.I0000O(OIOlIiiioi.I000II(j, I00000oIO()));
                }

                @Override
                public final void I000OOo1O(float[] fArr) {
/* 5 */             this.I00iOIl.I00oO101o.I000OOo1O(fArr);
                }

                @Override
                public final void I000OiO(O0iOOo0Ii o0iOOo0Ii, float[] fArr) {
/* 5 */             this.I00iOIl.I00oO101o.I000OiO(o0iOOo0Ii, fArr);
                }

                @Override
                public final long I000iOII() {
/* 1 */             O1IiiOil0o0l o1IiiOil0o0l = this.I00iOIl;
/* 18 */            return (o1IiiOil0o0l.I00iOIl << 32) | (o1IiiOil0o0l.I00iiI & 4294967295L);
                }

                @Override
                public final boolean I0010o() {
/* 9 */             return this.I00iOIl.I00oO101o.I0110OiO().I00lll10;
                }

                @Override
                public final long I001l0I00(long j) {
/* 13 */            return this.I00iOIl.I00oO101o.I001l0I00(OIOlIiiioi.I000II(j, I00000oIO()));
                }

                @Override
                public final long I001lloI(long j) {
/* 13 */            return OIOlIiiioi.I000II(this.I00iOIl.I00oO101o.I001lloI(j), I00000oIO());
                }

                @Override
                public final O0iOOo0Ii I00II0oii1o() {
                    O1IiiOil0o0l o1IiiOil0o0lI01101IOlO;
/* 5 */             if (!I0010o()) {
/* 9 */                 IolioOO1.I0000Il00O("LayoutCoordinate operations are only valid when isAttached is true");
                    }
/* 24 */            OIIlIII0Ili oIIlIII0Ili = ((OIIlIII0Ili) this.I00iOIl.I00oO101o.I00oO101o.I010101Oo1lO.I00ilI0I1).I00oli;
/* 26 */            if (oIIlIII0Ili == null || (o1IiiOil0o0lI01101IOlO = oIIlIII0Ili.I01101IOlO()) == null) {
/* 37 */                return null;
                    }
/* 34 */            return o1IiiOil0o0lI01101IOlO.I00olI;
                }

                @Override
                public final long I00IoIO0lI(O0iOOo0Ii o0iOOo0Ii, long j) {
/* 2 */             return I00O0i0ii(o0iOOo0Ii, j, true);
                }

                @Override
                public final long I00IoO0(long j) {
/* 13 */            return OIOlIiiioi.I000II(this.I00iOIl.I00oO101o.I00IoO0(j), I00000oIO());
                }

                @Override
                public final OOo0IO I00IoiI(O0iOOo0Ii o0iOOo0Ii, boolean z) {
/* 5 */             return this.I00iOIl.I00oO101o.I00IoiI(o0iOOo0Ii, z);
                }

                @Override
                public final long I00Iooi00oi(long j) {
/* 13 */            return this.I00iOIl.I00oO101o.I00Iooi00oi(OIOlIiiioi.I000II(j, I00000oIO()));
                }

                @Override
                public final long I00O0i0ii(O0iOOo0Ii o0iOOo0Ii, long j, boolean z) {
/* 1 */             O1IiiOil0o0l o1IiiOil0o0l = this.I00iOIl;
/* 12 */            if (!(o0iOOo0Ii instanceof O1Iil010i10)) {
/* 155 */               O1IiiOil0o0l o1IiiOil0o0lI00000oIO = l11OlI1O0lOo.I00000oIO(o1IiiOil0o0l);
/* 159 */               OIIlIII0Ili oIIlIII0Ili = o1IiiOil0o0lI00000oIO.I00oO101o;
/* 163 */               long jI00O0i0ii = I00O0i0ii(o1IiiOil0o0lI00000oIO.I00olI, j, z);
/* 174 */               float f = (int) (o1IiiOil0o0lI00000oIO.I00oOio10iI1 & 4294967295L);
/* 190 */               long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(jI00O0i0ii, (4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
/* 200 */               if (!oIIlIII0Ili.I0110OiO().I00lll10) {
/* 204 */                   IolioOO1.I0000Il00O("LayoutCoordinate operations are only valid when isAttached is true");
                        }
/* 207 */               oIIlIII0Ili.I011iO();
/* 210 */               OIIlIII0Ili oIIlIII0Ili2 = oIIlIII0Ili.I00oli;
/* 212 */               if (oIIlIII0Ili2 != null) {
/* 215 */                   oIIlIII0Ili = oIIlIII0Ili2;
                        }
/* 222 */               return OIOlIiiioi.I000II(jI0001Ioi1lo, oIIlIII0Ili.I00O0i0ii(o0iOOo0Ii, 0L, z));
                    }
/* 16 */            O1IiiOil0o0l o1IiiOil0o0l2 = ((O1Iil010i10) o0iOOo0Ii).I00iOIl;
/* 18 */            OIIlIII0Ili oIIlIII0Ili3 = o1IiiOil0o0l2.I00oO101o;
/* 20 */            oIIlIII0Ili3.I011iO();
/* 29 */            O1IiiOil0o0l o1IiiOil0o0lI01101IOlO = o1IiiOil0o0l.I00oO101o.I010lI0oi(oIIlIII0Ili3).I01101IOlO();
/* 33 */            if (o1IiiOil0o0lI01101IOlO != null) {
                        boolean z2 = !z;
/* 53 */                long jI0000O = IooO0O.I0000O(IooO0O.I0000oI00(o1IiiOil0o0l2.I010ioo(o1IiiOil0o0lI01101IOlO, z2), ioolillioIIO.I00000oOI(j)), o1IiiOil0o0l.I010ioo(o1IiiOil0o0lI01101IOlO, z2));
/* 78 */                return (Float.floatToRawIntBits((int) (jI0000O >> 32)) << 32) | (Float.floatToRawIntBits((int) (jI0000O & 4294967295L)) & 4294967295L);
                    }
/* 80 */            O1IiiOil0o0l o1IiiOil0o0lI00000oIO2 = l11OlI1O0lOo.I00000oIO(o1IiiOil0o0l2);
                    boolean z3 = !z;
/* 100 */           long jI0000oI00 = IooO0O.I0000oI00(IooO0O.I0000oI00(o1IiiOil0o0l2.I010ioo(o1IiiOil0o0lI00000oIO2, z3), o1IiiOil0o0lI00000oIO2.I00oOio10iI1), ioolillioIIO.I00000oOI(j));
/* 104 */           O1IiiOil0o0l o1IiiOil0o0lI00000oIO3 = l11OlI1O0lOo.I00000oIO(o1IiiOil0o0l);
/* 118 */           long jI0000O2 = IooO0O.I0000O(jI0000oI00, IooO0O.I0000oI00(o1IiiOil0o0l.I010ioo(o1IiiOil0o0lI00000oIO3, z3), o1IiiOil0o0lI00000oIO3.I00oOio10iI1));
/* 129 */           long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jI0000O2 >> 32));
/* 150 */           return o1IiiOil0o0lI00000oIO3.I00oO101o.I00oli.I00O0i0ii(o1IiiOil0o0lI00000oIO2.I00oO101o.I00oli, (Float.floatToRawIntBits((int) (jI0000O2 & 4294967295L)) & 4294967295L) | (jFloatToRawIntBits << 32), z);
                }
            }
