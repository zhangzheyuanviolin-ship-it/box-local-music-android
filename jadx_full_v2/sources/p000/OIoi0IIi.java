            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIoi0IIi extends O1ooOo implements O0iOoioOoI, Iillo1il11l {
                public OIoOo11 I00o0iI0io1;
                public boolean I00o0l1o1o0;
                public I0iolI1I11l1 I00o101lO;
                public IOoOOI1ii I00oI0i;
                public float I00oII;
                public IOOil0 I00oIiI10;

                public static boolean I010l1ol111(long j) {
                    return !Ol0i1I.I00000oOI(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
                }

                public static boolean I010lI0oi(long j) {
                    return !Ol0i1I.I00000oOI(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
                }

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 5 */             OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(I010o0o0oO(j));
/* 9 */             int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 11 */            int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 17 */            I0li0o i0li0o = new I0li0o(9);
/* 20 */            i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 22 */            VarHandle.storeStoreFence();
/* 27 */            return o1iOIoOiO0.I001i1lo1io(i, i2, Il011I1OiO0I.I00iOIl, i0li0o);
                }

                @Override
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 5 */             if (!I010l1O()) {
/* 30 */                return o1iIo0ll.I001iOo1i0O(i);
                    }
/* 13 */            long jI010o0o0oO = I010o0o0oO(IOo0olo.I00000oOI(0, 0, 0, i, 7));
/* 25 */            return Math.max(IOo0oO11ll1O.I000l1(jI010o0o0oO), o1iIo0ll.I001iOo1i0O(i));
                }

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 5 */             if (!I010l1O()) {
/* 31 */                return o1iIo0ll.I0000Il00O(i);
                    }
/* 14 */            long jI010o0o0oO = I010o0o0oO(IOo0olo.I00000oOI(0, i, 0, 0, 13));
/* 26 */            return Math.max(IOo0oO11ll1O.I000iOII(jI010o0o0oO), o1iIo0ll.I0000Il00O(i));
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 5 */             if (!I010l1O()) {
/* 31 */                return o1iIo0ll.I00OI1(i);
                    }
/* 14 */            long jI010o0o0oO = I010o0o0oO(IOo0olo.I00000oOI(0, i, 0, 0, 13));
/* 26 */            return Math.max(IOo0oO11ll1O.I000iOII(jI010o0o0oO), o1iIo0ll.I00OI1(i));
                }

                @Override
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) {
/* 5 */             IIolilIo iIolilIo = o0iiliOio.I00iOIl;
/* 9 */             long jI000OOo1O = this.I00o0iI0io1.I000OOo1O();
/* 80 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(I010lI0oi(jI000OOo1O) ? Float.intBitsToFloat((int) (jI000OOo1O >> 32)) : Float.intBitsToFloat((int) (iIolilIo.I0000oI00() >> 32))) << 32) | (Float.floatToRawIntBits(I010l1ol111(jI000OOo1O) ? Float.intBitsToFloat((int) (jI000OOo1O & 4294967295L)) : Float.intBitsToFloat((int) (iIolilIo.I0000oI00() & 4294967295L))) & 4294967295L);
/* 124 */           long jI00000oIO = (Float.intBitsToFloat((int) (iIolilIo.I0000oI00() >> 32)) == 0.0f || Float.intBitsToFloat((int) (iIolilIo.I0000oI00() & 4294967295L)) == 0.0f) ? 0L : lO0l1ooI0lo1.I00000oIO(jFloatToRawIntBits, this.I00oI0i.I00000oOI(jFloatToRawIntBits, iIolilIo.I0000oI00()));
/* 197 */           long jI00000oIO2 = this.I00o101lO.I00000oIO((Math.round(Float.intBitsToFloat((int) (jI00000oIO >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jI00000oIO & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (iIolilIo.I0000oI00() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (iIolilIo.I0000oI00() & 4294967295L))) & 4294967295L), o0iiliOio.getLayoutDirection());
/* 203 */           float f = (int) (jI00000oIO2 >> 32);
/* 207 */           float f2 = (int) (jI00000oIO2 & 4294967295L);
/* 215 */           ((IIOOoll) iIolilIo.I00iiI.I00iiI).I00i0oil(f, f2);
                    try {
/* 230 */               this.I00o0iI0io1.I000II(o0iiliOio, jI00000oIO, this.I00oII, this.I00oIiI10);
/* 241 */               ((IIOOoll) iIolilIo.I00iiI.I00iiI).I00i0oil(-f, -f2);
/* 244 */               o0iiliOio.I00000oOI();
                    } catch (Throwable th) {
/* 257 */               ((IIOOoll) iIolilIo.I00iiI.I00iiI).I00i0oil(-f, -f2);
/* 437 */               throw th;
                    }
                }

                @Override
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 5 */             if (!I010l1O()) {
/* 30 */                return o1iIo0ll.I000l1(i);
                    }
/* 13 */            long jI010o0o0oO = I010o0o0oO(IOo0olo.I00000oOI(0, 0, 0, i, 7));
/* 25 */            return Math.max(IOo0oO11ll1O.I000l1(jI010o0o0oO), o1iIo0ll.I000l1(i));
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                public final boolean I010l1O() {
                    return this.I00o0l1o1o0 && this.I00o0iI0io1.I000OOo1O() != 9205357640488583168L;
                }

                public final long I010o0o0oO(long j) {
/* 5 */             boolean z = false;
/* 17 */            boolean z2 = IOo0oO11ll1O.I0001Ioi1lo(j) && IOo0oO11ll1O.I0000oI00(j);
/* 22 */            if (IOo0oO11ll1O.I000O01llI0(j) && IOo0oO11ll1O.I000II(j)) {
/* 30 */                z = true;
                    }
/* 35 */            if ((!I010l1O() && z2) || z) {
/* 54 */                return IOo0oO11ll1O.I0000Il00O(j, IOo0oO11ll1O.I000OiO(j), 0, IOo0oO11ll1O.I000OOo1O(j), 0, 10);
                    }
/* 62 */            long jI000OOo1O = this.I00o0iI0io1.I000OOo1O();
/* 86 */            int iRound = I010lI0oi(jI000OOo1O) ? Math.round(Float.intBitsToFloat((int) (jI000OOo1O >> 32))) : IOo0oO11ll1O.I000l1(j);
/* 112 */           int iRound2 = I010l1ol111(jI000OOo1O) ? Math.round(Float.intBitsToFloat((int) (jI000OOo1O & 4294967295L))) : IOo0oO11ll1O.I000iOII(j);
/* 116 */           int iI000II = IOo0olo.I000II(iRound, j);
/* 138 */           long jFloatToRawIntBits = (Float.floatToRawIntBits(IOo0olo.I0001Ioi1lo(iRound2, j)) & 4294967295L) | (Float.floatToRawIntBits(iI000II) << 32);
/* 143 */           if (I010l1O()) {
/* 223 */               long jFloatToRawIntBits2 = (Float.floatToRawIntBits(!I010lI0oi(this.I00o0iI0io1.I000OOo1O()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.I00o0iI0io1.I000OOo1O() >> 32))) << 32) | (Float.floatToRawIntBits(!I010l1ol111(this.I00o0iI0io1.I000OOo1O()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.I00o0iI0io1.I000OOo1O() & 4294967295L))) & 4294967295L);
/* 257 */               jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : lO0l1ooI0lo1.I00000oIO(jFloatToRawIntBits2, this.I00oI0i.I00000oOI(jFloatToRawIntBits2, jFloatToRawIntBits));
                    }
/* 295 */           return IOo0oO11ll1O.I0000Il00O(j, IOo0olo.I000II(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, IOo0olo.I0001Ioi1lo(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
                }

                public final String toString() {
/* 58 */            return "PainterModifier(painter=" + this.I00o0iI0io1 + ", sizeToIntrinsics=" + this.I00o0l1o1o0 + ", alignment=" + this.I00o101lO + ", alpha=" + this.I00oII + ", colorFilter=" + this.I00oIiI10 + ")";
                }
            }
