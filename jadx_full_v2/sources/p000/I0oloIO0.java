            package p000;

            import java.util.Comparator;
            
            public final class I0oloIO0 implements Comparator {
                public final int I00iOIl;

                public I0oloIO0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final int compare(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 154 */                   return O0000Ioio00.I0000oI00(((OOIl01) obj2).I00000oIO, ((OOIl01) obj).I00000oIO);
                        case 1:
/* 116 */                   byte[] bArr = (byte[]) obj;
/* 118 */                   byte[] bArr2 = (byte[]) obj2;
/* 122 */                   if (bArr.length != bArr2.length) {
/* 126 */                       return bArr.length - bArr2.length;
                            }
/* 131 */                   for (int i = 0; i < bArr.length; i++) {
/* 133 */                       byte b = bArr[i];
/* 135 */                       byte b2 = bArr2[i];
/* 137 */                       if (b != b2) {
/* 139 */                           return b - b2;
                                }
                            }
/* 128 */                   return 0;
                        case 2:
/* 111 */                   return O0000Ioio00.I0000oI00(((O00I0lllo) obj).I00000oOI, ((O00I0lllo) obj2).I00000oOI);
                        case 3:
/* 87 */                    IooO11l iooO11l = (IooO11l) obj;
/* 89 */                    IooO11l iooO11l2 = (IooO11l) obj2;
/* 101 */                   return (iooO11l.I00iiI - iooO11l.I00iOIl) - (iooO11l2.I00iiI - iooO11l2.I00iOIl);
                        case 4:
/* 49 */                    O0iiOioolIi o0iiOioolIi = (O0iiOioolIi) obj;
/* 51 */                    O0iiOioolIi o0iiOioolIi2 = (O0iiOioolIi) obj2;
/* 57 */                    float f = o0iiOioolIi.I010I0.I00100l0.I0100o111I;
/* 63 */                    float f2 = o0iiOioolIi2.I010I0.I00100l0.I0100o111I;
                            return f == f2 ? O0000Ioio00.I0000oI00(o0iiOioolIi.I001i1O0Ol(), o0iiOioolIi2.I001i1O0Ol()) : Float.compare(f, f2);
                        case 5:
/* 44 */                    return O0000Ioio00.I0000oI00(((O0lilO) obj).getIndex(), ((O0lilO) obj2).getIndex());
                        case 6:
/* 27 */                    return ((I1ioiI) obj).I00000oIO.compareTo(((I1ioiI) obj2).I00000oIO);
                        default:
/* 14 */                    return ((Number) Oil0i0I1I.I00000oOI.invoke(obj, obj2)).intValue();
                    }
                }
            }
