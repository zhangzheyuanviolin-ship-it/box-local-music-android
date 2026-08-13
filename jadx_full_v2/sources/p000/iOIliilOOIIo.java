            package p000;

            import android.graphics.Matrix;
            import android.graphics.Shader;
            import java.util.ArrayList;
            
            public abstract class iOIliilOOIIo {
                public static final void I00000oIO(OI0OIIiOi oI0OIIiOi, IIolOo iIolOo, III11l1I iII11l1I, float f, OioOII0oI oioOII0oI, OlooIOI0O olooIOI0O, Iilloo0IOoIo iilloo0IOoIo) {
/* 1 */             iIolOo.I000II();
/* 4 */             ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 11 */            if (arrayList.size() <= 1 || (iII11l1I instanceof OlI00IIlOO)) {
/* 22 */                I00000oOI(oI0OIIiOi, iIolOo, iII11l1I, f, oioOII0oI, olooIOI0O, iilloo0IOoIo);
                    } else {
/* 28 */                if (!(iII11l1I instanceof OioIoiOi)) {
/* 140 */                   I000II.I00000oIO();
/* 965 */                   return;
                        }
/* 30 */                int size = arrayList.size();
/* 37 */                float fMax = 0.0f;
/* 38 */                float f2 = 0.0f;
/* 39 */                for (int i = 0; i < size; i++) {
/* 47 */                    I0oilIol11i i0oilIol11i = ((OIoiIo0o1O) arrayList.get(i)).I00000oIO;
/* 51 */                    f2 += i0oilIol11i.I0000oI00;
/* 56 */                    fMax = Math.max(fMax, i0oilIol11i.I0000oI00());
                        }
/* 85 */                Shader shaderI0000Il00O = ((OioIoiOi) iII11l1I).I0000Il00O((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
/* 91 */                Matrix matrix = new Matrix();
/* 94 */                shaderI0000Il00O.getLocalMatrix(matrix);
/* 97 */                int size2 = arrayList.size();
/* 101 */               for (int i2 = 0; i2 < size2; i2++) {
/* 109 */                   I0oilIol11i i0oilIol11i2 = ((OIoiIo0o1O) arrayList.get(i2)).I00000oIO;
/* 116 */                   i0oilIol11i2.I000O01llI0(iIolOo, new III11lloi(shaderI0000Il00O), f, oioOII0oI, olooIOI0O, iilloo0IOoIo);
/* 121 */                   iIolOo.I000o00OoI0I(0.0f, i0oilIol11i2.I0000oI00);
/* 127 */                   matrix.setTranslate(0.0f, -i0oilIol11i2.I0000oI00);
/* 130 */                   shaderI0000Il00O.setLocalMatrix(matrix);
                        }
                    }
/* 136 */           iIolOo.I00100l0();
                }

                public static final void I00000oOI(OI0OIIiOi oI0OIIiOi, IIolOo iIolOo, III11l1I iII11l1I, float f, OioOII0oI oioOII0oI, OlooIOI0O olooIOI0O, Iilloo0IOoIo iilloo0IOoIo) {
/* 1 */             ArrayList arrayList = oI0OIIiOi.I000O01llI0;
/* 3 */             int size = arrayList.size();
/* 8 */             for (int i = 0; i < size; i++) {
/* 14 */                OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) arrayList.get(i);
/* 25 */                oIoiIo0o1O.I00000oIO.I000O01llI0(iIolOo, iII11l1I, f, oioOII0oI, olooIOI0O, iilloo0IOoIo);
/* 33 */                iIolOo.I000o00OoI0I(0.0f, oIoiIo0o1O.I00000oIO.I0000oI00);
                    }
                }
            }
