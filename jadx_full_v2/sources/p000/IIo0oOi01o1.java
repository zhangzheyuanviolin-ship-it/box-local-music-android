            package p000;
            
            public final class IIo0oOi01o1 extends IIo0l10O01O0 {
                public final String I00000oIO;
                public final IOO1iloOl I00000oOI;
                public final Integer I0000Il00O;
                public final Iio1ilIOl10o I0000O;
                public final Throwable I0000oI00;
                public final Iio1ilIOl10o I0001Ioi1lo;
                public final Iio1ilIOl10o I000II;
                public final Iio1ilIOl10o I000O01llI0;
                public final IIlOloloOil I000OOo1O;

                public IIo0oOi01o1(String str, IOO1iloOl iOO1iloOl, Integer num, Iio1ilIOl10o iio1ilIOl10o, Throwable th, Iio1ilIOl10o iio1ilIOl10o2, Iio1ilIOl10o iio1ilIOl10o3, Iio1ilIOl10o iio1ilIOl10o4, IIlOloloOil iIlOloloOil) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = iOO1iloOl;
/* 8 */             this.I0000Il00O = num;
/* 10 */            this.I0000O = iio1ilIOl10o;
/* 12 */            this.I0000oI00 = th;
/* 14 */            this.I0001Ioi1lo = iio1ilIOl10o2;
/* 16 */            this.I000II = iio1ilIOl10o3;
/* 18 */            this.I000O01llI0 = iio1ilIOl10o4;
/* 20 */            this.I000OOo1O = iIlOloloOil;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 108 */               return true;
                    }
/* 7 */             if (!(obj instanceof IIo0oOi01o1)) {
/* 106 */               return false;
                    }
/* 10 */            IIo0oOi01o1 iIo0oOi01o1 = (IIo0oOi01o1) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iIo0oOi01o1.I00000oIO) && this.I00000oOI == iIo0oOi01o1.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, iIo0oOi01o1.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, iIo0oOi01o1.I0000O) && O0000Ioio00.I0000O(this.I0000oI00, iIo0oOi01o1.I0000oI00) && O0000Ioio00.I0000O(this.I0001Ioi1lo, iIo0oOi01o1.I0001Ioi1lo) && O0000Ioio00.I0000O(this.I000II, iIo0oOi01o1.I000II) && O0000Ioio00.I0000O(this.I000O01llI0, iIo0oOi01o1.I000O01llI0) && O0000Ioio00.I0000O(this.I000OOo1O, iIo0oOi01o1.I000OOo1O);
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 19 */            Integer num = this.I0000Il00O;
/* 30 */            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
/* 32 */            Iio1ilIOl10o iio1ilIOl10o = this.I0000O;
/* 45 */            int iHashCode3 = (iHashCode2 + (iio1ilIOl10o == null ? 0 : Long.hashCode(iio1ilIOl10o.I00000oIO))) * 31;
/* 47 */            Throwable th = this.I0000oI00;
/* 58 */            int iHashCode4 = (iHashCode3 + (th == null ? 0 : th.hashCode())) * 31;
/* 60 */            Iio1ilIOl10o iio1ilIOl10o2 = this.I0001Ioi1lo;
/* 73 */            int iHashCode5 = (iHashCode4 + (iio1ilIOl10o2 == null ? 0 : Long.hashCode(iio1ilIOl10o2.I00000oIO))) * 31;
/* 75 */            Iio1ilIOl10o iio1ilIOl10o3 = this.I000II;
/* 88 */            int iHashCode6 = (iHashCode5 + (iio1ilIOl10o3 == null ? 0 : Long.hashCode(iio1ilIOl10o3.I00000oIO))) * 31;
/* 90 */            Iio1ilIOl10o iio1ilIOl10o4 = this.I000O01llI0;
/* 103 */           int iHashCode7 = (iHashCode6 + (iio1ilIOl10o4 == null ? 0 : Long.hashCode(iio1ilIOl10o4.I00000oIO))) * 31;
/* 105 */           IIlOloloOil iIlOloloOil = this.I000OOo1O;
/* 116 */           return iHashCode7 + (iIlOloloOil != null ? Integer.hashCode(iIlOloloOil.I00000oIO) : 0);
                }

                public final String toString() {
/* 102 */           return "CameraStateClosed(cameraId=" + ((Object) IIllI0o.I0000Il00O(this.I00000oIO)) + ", cameraClosedReason=" + this.I00000oOI + ", cameraRetryCount=" + this.I0000Il00O + ", cameraRetryDurationNs=" + this.I0000O + ", cameraException=" + this.I0000oI00 + ", cameraOpenDurationNs=" + this.I0001Ioi1lo + ", cameraActiveDurationNs=" + this.I000II + ", cameraClosingDurationNs=" + this.I000O01llI0 + ", cameraErrorCode=" + this.I000OOo1O + ')';
                }
            }
