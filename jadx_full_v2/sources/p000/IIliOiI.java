            package p000;
            
            public final class IIliOiI {
                public boolean I00000oIO;
                public IIi0oIl I00000oOI;
                public int I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;
                public boolean I0001Ioi1lo;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 53 */                return true;
                    }
/* 7 */             if (obj instanceof IIliOiI) {
/* 10 */                IIliOiI iIliOiI = (IIliOiI) obj;
/* 16 */                if (this.I00000oIO == iIliOiI.I00000oIO && this.I00000oOI == iIliOiI.I00000oOI && this.I0000Il00O == iIliOiI.I0000Il00O && this.I0000O == iIliOiI.I0000O && this.I0000oI00 == iIliOiI.I0000oI00 && this.I0001Ioi1lo == iIliOiI.I0001Ioi1lo) {
/* 53 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 48 */            return Boolean.hashCode(this.I0001Ioi1lo) + Oi010OO0.I000OOo1O(Oi010OO0.I000OOo1O(IIl001iO0Io.I0000O(this.I0000Il00O, (this.I00000oOI.hashCode() + Oi010OO0.I000OOo1O(Boolean.hashCode(false) * 31, 31, this.I00000oIO)) * 961, 31), 31, this.I0000O), 31, this.I0000oI00);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", awaitRepeatingRequestBeforeCapture=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=");
/* 49 */            sb.append((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.I0000Il00O + ')'));
/* 54 */            sb.append(", closeCaptureSessionOnDisconnect=");
/* 59 */            sb.append(this.I0000O);
/* 64 */            sb.append(", closeCameraDeviceOnClose=");
/* 69 */            sb.append(this.I0000oI00);
/* 74 */            sb.append(", enableRestartDelays=");
/* 79 */            sb.append(this.I0001Ioi1lo);
/* 82 */            sb.append(')');
/* 85 */            return sb.toString();
                }
            }
