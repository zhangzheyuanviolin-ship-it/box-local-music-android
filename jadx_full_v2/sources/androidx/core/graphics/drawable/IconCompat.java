            package androidx.core.graphics.drawable;

            import android.content.res.ColorStateList;
            import android.graphics.Bitmap;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Icon;
            import android.os.Parcelable;
            import androidx.versionedparcelable.CustomVersionedParcelable;
            import p000.I000II;
            import p000.IoOOl0iOl1io;
            
/* 24 */    public class IconCompat extends CustomVersionedParcelable {
                public static final PorterDuff.Mode I000iOII = PorterDuff.Mode.SRC_IN;
                public int I00000oIO;
                public Object I00000oOI;
                public byte[] I0000Il00O;
                public Parcelable I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public ColorStateList I000II;
                public PorterDuff.Mode I000O01llI0;
                public String I000OOo1O;
                public String I000OiO;

                public IconCompat() {
/* 5 */             this.I00000oIO = -1;
/* 8 */             this.I0000Il00O = null;
/* 10 */            this.I0000O = null;
/* 13 */            this.I0000oI00 = 0;
/* 15 */            this.I0001Ioi1lo = 0;
/* 17 */            this.I000II = null;
/* 21 */            this.I000O01llI0 = I000iOII;
/* 23 */            this.I000OOo1O = null;
                }

                public static IconCompat I00000oIO(int i) {
/* 1 */             if (i == 0) {
/* 20 */                I000II.I000iOII("Drawable resource ID must not be 0");
/* 23 */                return null;
                    }
/* 6 */             IconCompat iconCompat = new IconCompat(2);
/* 9 */             iconCompat.I0000oI00 = i;
/* 13 */            iconCompat.I00000oOI = "";
/* 15 */            iconCompat.I000OiO = "";
/* 17 */            return iconCompat;
                }

                public final int I00000oOI() {
/* 1 */             int i = this.I00000oIO;
/* 4 */             if (i == -1) {
/* 10 */                return ((Icon) this.I00000oOI).getResId();
                    }
/* 16 */            if (i == 2) {
/* 18 */                return this.I0000oI00;
                    }
/* 23 */            IoOOl0iOl1io.I000OOo1O("called getResId() on ", this);
/* 26 */            return 0;
                }

                public final String toString() {
                    String str;
/* 4 */             if (this.I00000oIO == -1) {
/* 8 */                 return String.valueOf(this.I00000oOI);
                    }
/* 17 */            StringBuilder sb = new StringBuilder("Icon(typ=");
                    switch (this.I00000oIO) {
                        case 1:
/* 43 */                    str = "BITMAP";
                            break;
                        case 2:
/* 40 */                    str = "RESOURCE";
                            break;
                        case 3:
/* 37 */                    str = "DATA";
                            break;
                        case 4:
/* 34 */                    str = "URI";
                            break;
                        case 5:
/* 31 */                    str = "BITMAP_MASKABLE";
                            break;
                        case 6:
/* 28 */                    str = "URI_MASKABLE";
                            break;
                        default:
/* 25 */                    str = "UNKNOWN";
                            break;
                    }
/* 45 */            sb.append(str);
                    switch (this.I00000oIO) {
                        case 1:
                        case 5:
/* 129 */                   sb.append(" size=");
/* 140 */                   sb.append(((Bitmap) this.I00000oOI).getWidth());
/* 145 */                   sb.append("x");
/* 156 */                   sb.append(((Bitmap) this.I00000oOI).getHeight());
                            break;
                        case 2:
/* 92 */                    sb.append(" pkg=");
/* 97 */                    sb.append(this.I000OiO);
/* 102 */                   sb.append(" id=");
/* 123 */                   sb.append(String.format("0x%08x", Integer.valueOf(I00000oOI())));
                            break;
                        case 3:
/* 67 */                    sb.append(" len=");
/* 72 */                    sb.append(this.I0000oI00);
/* 77 */                    if (this.I0001Ioi1lo != 0) {
/* 81 */                        sb.append(" off=");
/* 86 */                        sb.append(this.I0001Ioi1lo);
                                break;
                            }
                            break;
                        case 4:
                        case 6:
/* 56 */                    sb.append(" uri=");
/* 61 */                    sb.append(this.I00000oOI);
                            break;
                    }
/* 161 */           if (this.I000II != null) {
/* 165 */               sb.append(" tint=");
/* 170 */               sb.append(this.I000II);
                    }
/* 177 */           if (this.I000O01llI0 != I000iOII) {
/* 181 */               sb.append(" mode=");
/* 186 */               sb.append(this.I000O01llI0);
                    }
/* 191 */           sb.append(")");
/* 194 */           return sb.toString();
                }

/* 25 */        public IconCompat(int i) {
/* 27 */            this.I0000Il00O = null;
/* 28 */            this.I0000O = null;
/* 29 */            this.I0000oI00 = 0;
/* 30 */            this.I0001Ioi1lo = 0;
/* 31 */            this.I000II = null;
/* 32 */            this.I000O01llI0 = I000iOII;
/* 33 */            this.I000OOo1O = null;
/* 34 */            this.I00000oIO = i;
                }
            }
