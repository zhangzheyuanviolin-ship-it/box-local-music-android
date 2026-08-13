            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            
            public final class Ollii0ii0lOl extends O1ooOo implements O0iOoioOoI {
                public OlO01l1oOil I00o0iI0io1;
                public int I00o0l1o1o0;
                public boolean I00o101lO;
                public IlIoO1ilo1 I00oI0i;
                public I10i01 I00oII;
                public I10i01 I00oIiI10;
                public Iil1010O I00oO101o;
                public Iil1010O I00oOio10iI1;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
                    float f;
/* 13 */            boolean zIsEmpty = ((List) this.I00o0iI0io1.getValue()).isEmpty();
/* 17 */            Map map = Il011I1OiO0I.I00iOIl;
/* 19 */            if (zIsEmpty) {
/* 29 */                return o1iOIoOiO0.I001i1lo1io(0, 0, map, new OiioI1Io0o(21));
                    }
/* 34 */            boolean z = this.I00o101lO;
/* 36 */            OlO01l1oOil olO01l1oOil = this.I00o0iI0io1;
/* 72 */            float f2 = z ? ((Olll1Oi) ((List) olO01l1oOil.getValue()).get(this.I00o0l1o1o0)).I0000Il00O : ((Olll1Oi) ((List) olO01l1oOil.getValue()).get(this.I00o0l1o1o0)).I00000oOI;
/* 75 */            Iil1010O iil1010O = this.I00oOio10iI1;
/* 77 */            int i = 3;
/* 80 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 81 */            if (iil1010O != null) {
/* 83 */                I10i01 i10i01 = this.I00oIiI10;
/* 85 */                if (i10i01 == null) {
/* 91 */                    i10i01 = new I10i01(iil1010O, Ooo0ii.I0000Il00O, null, 12);
/* 94 */                    this.I00oIiI10 = i10i01;
                        }
/* 110 */               if (Iil1010O.I0000Il00O(f2, ((Iil1010O) i10i01.I0000oI00.getValue()).I00iOIl)) {
/* 127 */                   f = f2;
                        } else {
/* 122 */                   f = f2;
/* 123 */                   iOi1II01i0.I0000O(I00ooiO1I(), null, null, new OlliOlollI(i10i01, f2, this, iOoil1iiIilo, 0), 3);
                        }
                    } else {
/* 129 */               f = f2;
/* 134 */               this.I00oOio10iI1 = Iil1010O.I00000oIO(f);
                    }
/* 152 */           float f3 = ((Olll1Oi) ((List) this.I00o0iI0io1.getValue()).get(this.I00o0l1o1o0)).I00000oIO;
/* 154 */           Iil1010O iil1010O2 = this.I00oO101o;
/* 156 */           if (iil1010O2 != null) {
/* 158 */               I10i01 i10i012 = this.I00oII;
/* 160 */               if (i10i012 == null) {
/* 166 */                   i10i012 = new I10i01(iil1010O2, Ooo0ii.I0000Il00O, null, 12);
/* 169 */                   this.I00oII = i10i012;
                        }
/* 185 */               if (!Iil1010O.I0000Il00O(f3, ((Iil1010O) i10i012.I0000oI00.getValue()).I00iOIl)) {
/* 197 */                   iOi1II01i0.I0000O(I00ooiO1I(), null, null, new OlliOlollI(i10i012, f3, this, iOoil1iiIilo, 1), 3);
                        }
                    } else {
/* 205 */               this.I00oO101o = Iil1010O.I00000oIO(f3);
                    }
/* 207 */           O0iOOoiioO layoutDirection = o1iOIoOiO0.getLayoutDirection();
/* 211 */           O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 213 */           I10i01 i10i013 = this.I00oII;
/* 215 */           if (layoutDirection != o0iOOoiioO) {
/* 228 */               if (i10i013 != null) {
/* 236 */                   f3 = ((Iil1010O) i10i013.I0000O()).I00iOIl;
                        }
/* 238 */               f3 = -f3;
                    } else if (i10i013 != null) {
/* 225 */               f3 = ((Iil1010O) i10i013.I0000O()).I00iOIl;
                    }
/* 239 */           I10i01 i10i014 = this.I00oIiI10;
/* 241 */           if (i10i014 != null) {
/* 249 */               f = ((Iil1010O) i10i014.I0000O()).I00iOIl;
                    }
/* 274 */           OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0oO11ll1O.I0000Il00O(j, o1iOIoOiO0.I00l0OO0IO(f), o1iOIoOiO0.I00l0OO0IO(f), 0, 0, 12));
/* 278 */           int i2 = oO1I0001000iI001lllioOl.I00iOIl;
/* 280 */           int i3 = oO1I0001000iI001lllioOl.I00iiI;
/* 284 */           II1O00ioi iI1O00ioi = new II1O00ioi(i);
/* 287 */           iI1O00ioi.I00iiO = oO1I0001000iI001lllioOl;
/* 289 */           iI1O00ioi.I00iiI = f3;
/* 291 */           VarHandle.storeStoreFence();
/* 294 */           return o1iOIoOiO0.I001i1lo1io(i2, i3, map, iI1O00ioi);
                }
            }
