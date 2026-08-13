            package p000;

            import com.google.mlkit.genai.imagedescription.zzn;
            
            public final class iOolO1ll1I {
                public iooO1OIlo I00000oIO;
                public zzn I00000oOI;

                public final boolean equals(Object obj) {
/* 2 */             if (obj != this) {
/* 8 */                 if (obj instanceof iOolO1ll1I) {
/* 10 */                    iOolO1ll1I ioolo1ll1i = (iOolO1ll1I) obj;
/* 20 */                    if (this.I00000oIO.equals(ioolo1ll1i.I00000oIO)) {
/* 22 */                        zzn zznVar = this.I00000oOI;
/* 24 */                        zzn zznVar2 = ioolo1ll1i.I00000oOI;
/* 26 */                        if (zznVar != null) {
                                    return zznVar == zznVar2;
                                }
/* 28 */                        if (zznVar2 == null) {
                                }
                            }
                        }
/* 7 */                 return false;
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.I00000oIO.hashCode() ^ 1000003;
/* 11 */            zzn zznVar = this.I00000oOI;
/* 23 */            return ((zznVar == null ? 0 : zznVar.hashCode()) ^ (iHashCode * 1000003)) * 1000003;
                }

                public final String toString() {
/* 19 */            return Oi010OO0.I001IO000("ImageDescriptionRequest{images=", this.I00000oIO.toString(), ", onNextTextListener=", String.valueOf(this.I00000oOI), ", overrideRequestKind=0}");
                }
            }
