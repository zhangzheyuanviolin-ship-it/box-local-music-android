            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iI0OO101i0lO {
                public Oo1ol1ll I00000oIO;

                public static iI0OO101i0lO I00000oIO(iI1iii00l ii1iii00l, iI1iii00l ii1iii00l2, Object obj) {
/* 3 */             iI0OO101i0lO ii0oo101i0lo = new iI0OO101i0lO();
/* 10 */            Oo1ol1ll oo1ol1ll = new Oo1ol1ll(8);
/* 13 */            oo1ol1ll.I00iiI = ii1iii00l;
/* 15 */            oo1ol1ll.I00iiO = ii1iii00l2;
/* 17 */            oo1ol1ll.I00iio = obj;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            ii0oo101i0lo.I00000oIO = oo1ol1ll;
/* 24 */            VarHandle.storeStoreFence();
/* 98 */            return ii0oo101i0lo;
                }

                public static void I00000oOI(i1lllO0 i1lllo0, Oo1ol1ll oo1ol1ll, Object obj, Object obj2) {
/* 6 */             i1oI1Oi.I00000oOI(i1lllo0, (iI1iii00l) oo1ol1ll.I00iiI, 1, obj);
/* 14 */            i1oI1Oi.I00000oOI(i1lllo0, (iI1iii00l) oo1ol1ll.I00iiO, 2, obj2);
                }

                /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0178  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x01ab  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x01b4  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x01ce  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x01d5  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x01dc  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01e2  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x01ee  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x01f9  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static int I0000Il00O(Oo1ol1ll oo1ol1ll, Object obj, Object obj2) {
                    int iI00000oOI;
                    int iI00000oOI2;
                    int iI00000oIO;
                    int iI00000oOI3;
                    int iI00000oIO2;
/* 3 */             iI1iii00l ii1iii00l = (iI1iii00l) oo1ol1ll.I00iiI;
/* 7 */             iI1iii00l ii1iii00l2 = (iI1iii00l) oo1ol1ll.I00iiO;
/* 9 */             int i = i1oI1Oi.I0000Il00O;
/* 11 */            int iI00000oOI4 = 8;
/* 13 */            int iI00000oIO3 = i1lllO0.I00000oIO(8);
/* 17 */            iI1iii00l ii1iii00l3 = iI1iii00l.I00iio;
/* 19 */            if (ii1iii00l == ii1iii00l3) {
/* 21 */                iI00000oIO3 += iI00000oIO3;
                    }
/* 22 */            iI1ilOliIi ii1iloliii = iI1ilOliIi.I00iOIl;
                    switch (ii1iii00l.ordinal()) {
                        case 0:
/* 271 */                   ((Double) obj).getClass();
/* 81 */                    iI00000oOI = 8;
/* 276 */                   int i2 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO4 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
/* 285 */                       iI00000oIO4 += iI00000oIO4;
                            }
                            switch (ii1iii00l2.ordinal()) {
                                case 0:
/* 526 */                           ((Double) obj2).getClass();
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 1:
/* 519 */                           ((Float) obj2).getClass();
/* 344 */                           iI00000oOI4 = 4;
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 2:
/* 512 */                           iI00000oOI4 = i1lllO0.I00000oOI(((Long) obj2).longValue());
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 3:
/* 501 */                           iI00000oOI4 = i1lllO0.I00000oOI(((Long) obj2).longValue());
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 4:
/* 490 */                           iI00000oOI4 = i1lllO0.I00000oOI(((Integer) obj2).intValue());
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 5:
/* 479 */                           ((Long) obj2).getClass();
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 6:
/* 472 */                           ((Integer) obj2).getClass();
/* 344 */                           iI00000oOI4 = 4;
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 7:
/* 465 */                           ((Boolean) obj2).getClass();
/* 468 */                           iI00000oOI4 = 1;
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 8:
/* 439 */                           if (obj2 instanceof i1lIIl01O) {
/* 443 */                               iI00000oOI3 = ((i1lIIl01O) obj2).I0000O();
/* 447 */                               iI00000oIO2 = i1lllO0.I00000oIO(iI00000oOI3);
                                    } else {
/* 454 */                               iI00000oOI3 = iI1i1o0lIl1o.I00000oOI((String) obj2);
/* 458 */                               iI00000oIO2 = i1lllO0.I00000oIO(iI00000oOI3);
                                    }
/* 403 */                           iI00000oOI4 = iI00000oIO2 + iI00000oOI3;
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 9:
/* 432 */                           iI00000oOI4 = ((i1oi01OllI) ((i1ilO0II) obj2)).I000l1();
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 10:
/* 419 */                           iI00000oOI3 = ((i1oi01OllI) ((i1ilO0II) obj2)).I000l1();
/* 423 */                           iI00000oIO2 = i1lllO0.I00000oIO(iI00000oOI3);
/* 403 */                           iI00000oOI4 = iI00000oIO2 + iI00000oOI3;
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 11:
/* 391 */                           if (obj2 instanceof i1lIIl01O) {
/* 395 */                               iI00000oOI3 = ((i1lIIl01O) obj2).I0000O();
/* 399 */                               iI00000oIO2 = i1lllO0.I00000oIO(iI00000oOI3);
                                    } else {
/* 409 */                               iI00000oOI3 = ((byte[]) obj2).length;
/* 410 */                               iI00000oIO2 = i1lllO0.I00000oIO(iI00000oOI3);
                                    }
/* 403 */                           iI00000oOI4 = iI00000oIO2 + iI00000oOI3;
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 12:
/* 383 */                           iI00000oOI4 = i1lllO0.I00000oIO(((Integer) obj2).intValue());
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 13:
/* 371 */                           iI00000oOI4 = obj2 instanceof i1ol0il1l0i ? i1lllO0.I00000oOI(((i1ol0il1l0i) obj2).zza()) : i1lllO0.I00000oOI(((Integer) obj2).intValue());
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 14:
/* 341 */                           ((Integer) obj2).getClass();
/* 344 */                           iI00000oOI4 = 4;
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 15:
/* 334 */                           ((Long) obj2).getClass();
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 16:
/* 317 */                           int iIntValue = ((Integer) obj2).intValue();
/* 326 */                           iI00000oOI4 = i1lllO0.I00000oIO((iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                case 17:
/* 301 */                           long jLongValue = ((Long) obj2).longValue();
/* 309 */                           iI00000oOI4 = i1lllO0.I00000oOI((jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 530 */                           return iI00000oOI4 + iI00000oIO4 + i2;
                                default:
/* 298 */                           throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        case 1:
/* 264 */                   ((Float) obj).getClass();
/* 89 */                    iI00000oOI = 4;
/* 276 */                   int i22 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO42 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 2:
/* 257 */                   iI00000oOI = i1lllO0.I00000oOI(((Long) obj).longValue());
/* 276 */                   int i222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO422 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 3:
/* 246 */                   iI00000oOI = i1lllO0.I00000oOI(((Long) obj).longValue());
/* 276 */                   int i2222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO4222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 4:
/* 235 */                   iI00000oOI = i1lllO0.I00000oOI(((Integer) obj).intValue());
/* 276 */                   int i22222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO42222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 5:
/* 223 */                   ((Long) obj).getClass();
/* 81 */                    iI00000oOI = 8;
/* 276 */                   int i222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO422222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 6:
/* 216 */                   ((Integer) obj).getClass();
/* 89 */                    iI00000oOI = 4;
/* 276 */                   int i2222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO4222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 7:
/* 209 */                   ((Boolean) obj).getClass();
/* 212 */                   iI00000oOI = 1;
/* 276 */                   int i22222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO42222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 8:
/* 183 */                   if (obj instanceof i1lIIl01O) {
/* 187 */                       iI00000oOI2 = ((i1lIIl01O) obj).I0000O();
/* 191 */                       iI00000oIO = i1lllO0.I00000oIO(iI00000oOI2);
                            } else {
/* 198 */                       iI00000oOI2 = iI1i1o0lIl1o.I00000oOI((String) obj);
/* 202 */                       iI00000oIO = i1lllO0.I00000oIO(iI00000oOI2);
                            }
/* 148 */                   iI00000oOI = iI00000oOI2 + iI00000oIO;
/* 276 */                   int i222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO422222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 9:
/* 176 */                   iI00000oOI = ((i1oi01OllI) ((i1ilO0II) obj)).I000l1();
/* 276 */                   int i2222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO4222222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 10:
/* 163 */                   iI00000oOI2 = ((i1oi01OllI) ((i1ilO0II) obj)).I000l1();
/* 167 */                   iI00000oIO = i1lllO0.I00000oIO(iI00000oOI2);
/* 148 */                   iI00000oOI = iI00000oOI2 + iI00000oIO;
/* 276 */                   int i22222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO42222222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 11:
/* 136 */                   if (obj instanceof i1lIIl01O) {
/* 140 */                       iI00000oOI2 = ((i1lIIl01O) obj).I0000O();
/* 144 */                       iI00000oIO = i1lllO0.I00000oIO(iI00000oOI2);
                            } else {
/* 153 */                       iI00000oOI2 = ((byte[]) obj).length;
/* 154 */                       iI00000oIO = i1lllO0.I00000oIO(iI00000oOI2);
                            }
/* 148 */                   iI00000oOI = iI00000oOI2 + iI00000oIO;
/* 276 */                   int i222222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO422222222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 12:
/* 128 */                   iI00000oOI = i1lllO0.I00000oIO(((Integer) obj).intValue());
/* 276 */                   int i2222222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO4222222222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 13:
/* 116 */                   iI00000oOI = obj instanceof i1ol0il1l0i ? i1lllO0.I00000oOI(((i1ol0il1l0i) obj).zza()) : i1lllO0.I00000oOI(((Integer) obj).intValue());
/* 276 */                   int i22222222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO42222222222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 14:
/* 86 */                    ((Integer) obj).getClass();
/* 89 */                    iI00000oOI = 4;
/* 276 */                   int i222222222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO422222222222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 15:
/* 78 */                    ((Long) obj).getClass();
/* 81 */                    iI00000oOI = 8;
/* 276 */                   int i2222222222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO4222222222222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 16:
/* 61 */                    int iIntValue2 = ((Integer) obj).intValue();
/* 70 */                    iI00000oOI = i1lllO0.I00000oIO((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
/* 276 */                   int i22222222222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO42222222222222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        case 17:
/* 45 */                    long jLongValue2 = ((Long) obj).longValue();
/* 53 */                    iI00000oOI = i1lllO0.I00000oOI((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
/* 276 */                   int i222222222222222222 = iI00000oOI + iI00000oIO3;
/* 279 */                   int iI00000oIO422222222222222222 = i1lllO0.I00000oIO(16);
/* 283 */                   if (ii1iii00l2 == ii1iii00l3) {
                            }
                            switch (ii1iii00l2.ordinal()) {
                            }
                        default:
/* 42 */                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                    }
                }
            }
