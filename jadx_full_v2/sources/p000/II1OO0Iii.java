            package p000;
            
            public abstract class II1OO0Iii {
                public static boolean I00000oIO(i01lOO0li i01loo0li, i01lOO0li i01loo0li2) {
/* 7 */             OOiliIii[] oOiliIiiArr = (OOiliIii[]) i01loo0li.I00iio.clone();
/* 15 */            OOiliIii[] oOiliIiiArr2 = (OOiliIii[]) i01loo0li2.I00iio.clone();
/* 20 */            if (oOiliIiiArr.length == oOiliIiiArr2.length) {
/* 62 */                boolean z = (oOiliIiiArr[0].I000o00OoI0I() == null || oOiliIiiArr2[0].I000o00OoI0I() == null) ? false : !oOiliIiiArr[0].I000o00OoI0I().I00iOIl.I0010o(oOiliIiiArr2[0].I000o00OoI0I().I00iOIl);
/* 65 */                for (int i = 0; i != oOiliIiiArr.length; i++) {
/* 67 */                    OOiliIii oOiliIii = oOiliIiiArr[i];
/* 70 */                    if (z) {
/* 74 */                        for (int length = oOiliIiiArr2.length - 1; length >= 0; length--) {
/* 76 */                            OOiliIii oOiliIii2 = oOiliIiiArr2[length];
/* 78 */                            if (oOiliIii2 != null && io0i0iOO1iI.I0000Il00O(oOiliIii, oOiliIii2)) {
/* 86 */                                oOiliIiiArr2[length] = null;
                                    }
                                }
                            } else {
/* 94 */                        for (int i2 = 0; i2 != oOiliIiiArr2.length; i2++) {
/* 96 */                            OOiliIii oOiliIii3 = oOiliIiiArr2[i2];
/* 98 */                            if (oOiliIii3 != null && io0i0iOO1iI.I0000Il00O(oOiliIii, oOiliIii3)) {
/* 106 */                               oOiliIiiArr2[i2] = null;
                                    }
                                }
                            }
                        }
/* 29 */                return true;
                    }
/* 19 */            return false;
                }
            }
