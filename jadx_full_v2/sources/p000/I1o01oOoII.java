            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I1o01oOoII implements Function1 {
                public long I00iOIl;
                public long I00iiI;

                @Override
                public final Object invoke(Object obj) {
                    char c;
                    long j;
                    long j2;
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    long j3;
/* 3 */             long j4 = this.I00iOIl;
/* 5 */             long j5 = this.I00iiI;
/* 9 */             IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 15 */            char c2 = ' ';
/* 28 */            int iIntBitsToFloat = ((int) (Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32)) / 24.0f)) + 1;
/* 49 */            int iIntBitsToFloat2 = ((int) (Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L)) / 24.0f)) + 1;
/* 51 */            if (iIntBitsToFloat2 >= 0) {
/* 55 */                int i6 = 0;
                        while (true) {
/* 57 */                    if (iIntBitsToFloat >= 0) {
/* 59 */                        int i7 = 0;
                                while (true) {
/* 65 */                            if ((i6 + i7) % 2 == 0) {
/* 67 */                                i4 = iIntBitsToFloat;
/* 68 */                                i5 = iIntBitsToFloat2;
/* 69 */                                j3 = j4;
                                    } else {
/* 71 */                                i4 = iIntBitsToFloat;
/* 72 */                                i5 = iIntBitsToFloat2;
/* 73 */                                j3 = j5;
                                    }
/* 99 */                            c = c2;
/* 105 */                           j = j4;
/* 116 */                           i3 = i6;
/* 119 */                           int i8 = i7;
/* 126 */                           j2 = j5;
/* 132 */                           i = i4;
/* 133 */                           i2 = i5;
/* 136 */                           IilloIOOO0i.I00ilI0I1(iilloIOOO0i, j3, (Float.floatToRawIntBits(i6 * 24.0f) & 4294967295L) | (Float.floatToRawIntBits(i7 * 24.0f) << c2), (Float.floatToRawIntBits(24.0f) & 4294967295L) | (Float.floatToRawIntBits(24.0f) << c), 0.0f, null, 0, 120);
/* 139 */                           if (i8 == i) {
                                        break;
                                    }
/* 141 */                           i7 = i8 + 1;
/* 143 */                           iIntBitsToFloat = i;
/* 144 */                           iIntBitsToFloat2 = i2;
/* 145 */                           i6 = i3;
/* 146 */                           j4 = j;
/* 148 */                           j5 = j2;
/* 150 */                           c2 = c;
                                }
                            } else {
/* 153 */                       c = c2;
/* 155 */                       j = j4;
/* 157 */                       j2 = j5;
/* 159 */                       i = iIntBitsToFloat;
/* 160 */                       i2 = iIntBitsToFloat2;
/* 161 */                       i3 = i6;
                            }
/* 162 */                   if (i3 == i2) {
                                break;
                            }
/* 164 */                   i6 = i3 + 1;
/* 166 */                   iIntBitsToFloat = i;
/* 167 */                   iIntBitsToFloat2 = i2;
/* 168 */                   j4 = j;
/* 170 */                   j5 = j2;
/* 172 */                   c2 = c;
                        }
                    }
/* 175 */           return OoiIlOl1iI.I00000oIO;
                }
            }
