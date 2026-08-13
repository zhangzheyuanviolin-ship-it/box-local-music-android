            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class Ol0O010O1o01 implements Function1 {
                public float I00iOIl;
                public ArrayList I00iiI;
                public Oli1oI111 I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public ArrayList I00ilO0;
                public float I00io1l;
                public Function1 I00ioIO;

                @Override
                public final Object invoke(Object obj) {
                    Iterator it;
/* 3 */             float f = this.I00iOIl;
/* 5 */             ArrayList arrayList = this.I00iiI;
/* 7 */             Oli1oI111 oli1oI111 = this.I00iiO;
/* 9 */             int i = this.I00iio;
/* 11 */            int i2 = this.I00ilI0I1;
/* 13 */            ArrayList arrayList2 = this.I00ilO0;
/* 15 */            float f2 = this.I00io1l;
/* 17 */            Function1 function1 = this.I00ioIO;
/* 21 */            OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 25 */            ArrayList arrayList3 = new ArrayList();
/* 30 */            ArrayList arrayList4 = new ArrayList();
/* 33 */            Iterator it2 = arrayList.iterator();
/* 37 */            float fFloatValue = f;
/* 38 */            int i3 = 0;
/* 45 */            while (it2.hasNext()) {
/* 47 */                Object next = it2.next();
/* 51 */                int i4 = i3 + 1;
/* 53 */                if (i3 < 0) {
/* 174 */                   IOOi1I.I000lI();
/* 178 */                   throw null;
                        }
/* 57 */                float f3 = f / 2.0f;
/* 65 */                arrayList3.add(Float.valueOf(fFloatValue - f3));
/* 74 */                float f4 = f;
/* 79 */                for (Iterator it3 = ((List) next).iterator(); it3.hasNext(); it3 = it3) {
/* 85 */                    float f5 = f;
/* 89 */                    OO1I0001000i oO1I0001000i = (OO1I0001000i) it3.next();
/* 91 */                    if (i3 == 0) {
/* 95 */                        it = it2;
/* 101 */                       arrayList4.add(Float.valueOf(f4 - f3));
                            } else {
/* 105 */                       it = it2;
                            }
/* 111 */                   float f6 = f2;
/* 120 */                   oO11o0IO.I000O01llI0(oO1I0001000i, O1OooO0IlOo.I000II(f4), O1OooO0IlOo.I000II(fFloatValue), 0.0f);
/* 125 */                   f4 += f6 + f5;
/* 126 */                   it2 = it;
/* 128 */                   f2 = f6;
/* 130 */                   f = f5;
                        }
/* 135 */               float f7 = f;
/* 137 */               Iterator it4 = it2;
/* 139 */               float f8 = f2;
/* 141 */               if (i3 == 0) {
/* 148 */                   arrayList4.add(Float.valueOf(f4 - f3));
                        }
/* 163 */               fFloatValue += ((Number) arrayList2.get(i3)).floatValue() + f7;
/* 164 */               it2 = it4;
/* 166 */               i3 = i4;
/* 168 */               f2 = f8;
/* 170 */               f = f7;
                    }
/* 188 */           arrayList3.add(Float.valueOf(fFloatValue - (f / 2.0f)));
/* 193 */           Olo0i0 olo0i0 = new Olo0i0();
/* 196 */           olo0i0.I00000oIO = arrayList3;
/* 198 */           olo0i0.I00000oOI = arrayList4;
/* 200 */           VarHandle.storeStoreFence();
/* 203 */           Boolean bool = Boolean.TRUE;
/* 208 */           II01l1Oii iI01l1Oii = new II01l1Oii(5);
/* 211 */           iI01l1Oii.I00iiI = function1;
/* 213 */           iI01l1Oii.I00iiO = olo0i0;
/* 215 */           VarHandle.storeStoreFence();
/* 235 */           O1iIo0ll o1iIo0ll = (O1iIo0ll) IOOi0Ool1i.I00OilO00Il(oli1oI111.I000o00OoI0I(new IOii1l(-1387549559, iI01l1Oii, true), bool));
/* 247 */           if (!((i >= 0) & (i2 >= 0))) {
/* 251 */               Ioliol1Ii.I00000oIO("width and height must be >= 0");
                    }
/* 263 */           OO11o0IO.I000iOII(oO11o0IO, o1iIo0ll.I001lllioOl(IOo0olo.I000O01llI0(i, i, i2, i2)), 0, 0);
/* 266 */           return OoiIlOl1iI.I00000oIO;
                }
            }
