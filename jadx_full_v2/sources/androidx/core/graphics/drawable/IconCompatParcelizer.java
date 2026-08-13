            package androidx.core.graphics.drawable;

            import android.content.res.ColorStateList;
            import android.graphics.PorterDuff;
            import android.os.Parcel;
            import android.os.Parcelable;
            import java.nio.charset.Charset;
            import p000.I000II;
            import p000.OooOI0Il00l;
            import p000.OooOIIIO;
            
            public class IconCompatParcelizer {
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public static IconCompat read(OooOI0Il00l oooOI0Il00l) {
/* 3 */             IconCompat iconCompat = new IconCompat();
/* 6 */             int i = iconCompat.I00000oIO;
/* 13 */            if (oooOI0Il00l.I0000oI00(1)) {
/* 21 */                i = ((OooOIIIO) oooOI0Il00l).I0000oI00.readInt();
                    }
/* 25 */            iconCompat.I00000oIO = i;
/* 27 */            byte[] bArr = iconCompat.I0000Il00O;
/* 35 */            if (oooOI0Il00l.I0000oI00(2)) {
/* 41 */                Parcel parcel = ((OooOIIIO) oooOI0Il00l).I0000oI00;
/* 43 */                int i2 = parcel.readInt();
/* 47 */                if (i2 < 0) {
/* 49 */                    bArr = null;
                        } else {
/* 51 */                    byte[] bArr2 = new byte[i2];
/* 53 */                    parcel.readByteArray(bArr2);
/* 56 */                    bArr = bArr2;
                        }
                    }
/* 57 */            iconCompat.I0000Il00O = bArr;
/* 66 */            iconCompat.I0000O = oooOI0Il00l.I0001Ioi1lo(iconCompat.I0000O, 3);
/* 68 */            int i3 = iconCompat.I0000oI00;
/* 75 */            if (oooOI0Il00l.I0000oI00(4)) {
/* 83 */                i3 = ((OooOIIIO) oooOI0Il00l).I0000oI00.readInt();
                    }
/* 87 */            iconCompat.I0000oI00 = i3;
/* 89 */            int i4 = iconCompat.I0001Ioi1lo;
/* 96 */            if (oooOI0Il00l.I0000oI00(5)) {
/* 104 */               i4 = ((OooOIIIO) oooOI0Il00l).I0000oI00.readInt();
                    }
/* 108 */           iconCompat.I0001Ioi1lo = i4;
/* 119 */           iconCompat.I000II = (ColorStateList) oooOI0Il00l.I0001Ioi1lo(iconCompat.I000II, 6);
/* 121 */           String string = iconCompat.I000OOo1O;
/* 128 */           if (oooOI0Il00l.I0000oI00(7)) {
/* 136 */               string = ((OooOIIIO) oooOI0Il00l).I0000oI00.readString();
                    }
/* 140 */           iconCompat.I000OOo1O = string;
/* 142 */           String string2 = iconCompat.I000OiO;
/* 150 */           if (oooOI0Il00l.I0000oI00(8)) {
/* 157 */               string2 = ((OooOIIIO) oooOI0Il00l).I0000oI00.readString();
                    }
/* 161 */           iconCompat.I000OiO = string2;
/* 169 */           iconCompat.I000O01llI0 = PorterDuff.Mode.valueOf(iconCompat.I000OOo1O);
                    switch (iconCompat.I00000oIO) {
                        case -1:
/* 237 */                   Parcelable parcelable = iconCompat.I0000O;
/* 239 */                   if (parcelable != null) {
/* 241 */                       iconCompat.I00000oOI = parcelable;
/* 243 */                       return iconCompat;
                            }
/* 246 */                   I000II.I000iOII("Invalid icon");
/* 34 */                    return null;
                        case 0:
                        default:
/* 217 */                   return iconCompat;
                        case 1:
                        case 5:
/* 218 */                   Parcelable parcelable2 = iconCompat.I0000O;
/* 220 */                   if (parcelable2 != null) {
/* 222 */                       iconCompat.I00000oOI = parcelable2;
/* 224 */                       return iconCompat;
                            }
/* 225 */                   byte[] bArr3 = iconCompat.I0000Il00O;
/* 227 */                   iconCompat.I00000oOI = bArr3;
/* 229 */                   iconCompat.I00000oIO = 3;
/* 231 */                   iconCompat.I0000oI00 = 0;
/* 234 */                   iconCompat.I0001Ioi1lo = bArr3.length;
/* 236 */                   return iconCompat;
                        case 2:
                        case 4:
                        case 6:
/* 193 */                   String str = new String(iconCompat.I0000Il00O, Charset.forName("UTF-16"));
/* 196 */                   iconCompat.I00000oOI = str;
/* 200 */                   if (iconCompat.I00000oIO == 2 && iconCompat.I000OiO == null) {
/* 215 */                       iconCompat.I000OiO = str.split(":", -1)[0];
                            }
/* 217 */                   return iconCompat;
                        case 3:
/* 180 */                   iconCompat.I00000oOI = iconCompat.I0000Il00O;
/* 182 */                   return iconCompat;
                    }
                }

                public static void write(IconCompat iconCompat, OooOI0Il00l oooOI0Il00l) {
/* 1 */             oooOI0Il00l.getClass();
/* 10 */            iconCompat.I000OOo1O = iconCompat.I000O01llI0.name();
                    switch (iconCompat.I00000oIO) {
                        case -1:
/* 70 */                    iconCompat.I0000O = (Parcelable) iconCompat.I00000oOI;
                            break;
                        case 1:
                        case 5:
/* 63 */                    iconCompat.I0000O = (Parcelable) iconCompat.I00000oOI;
                            break;
                        case 2:
/* 56 */                    iconCompat.I0000Il00O = ((String) iconCompat.I00000oOI).getBytes(Charset.forName("UTF-16"));
                            break;
                        case 3:
/* 41 */                    iconCompat.I0000Il00O = (byte[]) iconCompat.I00000oOI;
                            break;
                        case 4:
                        case 6:
/* 34 */                    iconCompat.I0000Il00O = iconCompat.I00000oOI.toString().getBytes(Charset.forName("UTF-16"));
                            break;
                    }
/* 72 */            int i = iconCompat.I00000oIO;
/* 75 */            if (-1 != i) {
/* 78 */                oooOI0Il00l.I000O01llI0(1);
/* 86 */                ((OooOIIIO) oooOI0Il00l).I0000oI00.writeInt(i);
                    }
/* 89 */            byte[] bArr = iconCompat.I0000Il00O;
/* 91 */            if (bArr != null) {
/* 94 */                oooOI0Il00l.I000O01llI0(2);
/* 100 */               Parcel parcel = ((OooOIIIO) oooOI0Il00l).I0000oI00;
/* 103 */               parcel.writeInt(bArr.length);
/* 106 */               parcel.writeByteArray(bArr);
                    }
/* 109 */           Parcelable parcelable = iconCompat.I0000O;
/* 112 */           if (parcelable != null) {
/* 115 */               oooOI0Il00l.I000O01llI0(3);
/* 123 */               ((OooOIIIO) oooOI0Il00l).I0000oI00.writeParcelable(parcelable, 0);
                    }
/* 126 */           int i2 = iconCompat.I0000oI00;
/* 128 */           if (i2 != 0) {
/* 131 */               oooOI0Il00l.I000O01llI0(4);
/* 139 */               ((OooOIIIO) oooOI0Il00l).I0000oI00.writeInt(i2);
                    }
/* 142 */           int i3 = iconCompat.I0001Ioi1lo;
/* 144 */           if (i3 != 0) {
/* 147 */               oooOI0Il00l.I000O01llI0(5);
/* 155 */               ((OooOIIIO) oooOI0Il00l).I0000oI00.writeInt(i3);
                    }
/* 158 */           ColorStateList colorStateList = iconCompat.I000II;
/* 160 */           if (colorStateList != null) {
/* 163 */               oooOI0Il00l.I000O01llI0(6);
/* 171 */               ((OooOIIIO) oooOI0Il00l).I0000oI00.writeParcelable(colorStateList, 0);
                    }
/* 174 */           String str = iconCompat.I000OOo1O;
/* 176 */           if (str != null) {
/* 179 */               oooOI0Il00l.I000O01llI0(7);
/* 187 */               ((OooOIIIO) oooOI0Il00l).I0000oI00.writeString(str);
                    }
/* 190 */           String str2 = iconCompat.I000OiO;
/* 192 */           if (str2 != null) {
/* 196 */               oooOI0Il00l.I000O01llI0(8);
/* 203 */               ((OooOIIIO) oooOI0Il00l).I0000oI00.writeString(str2);
                    }
                }
            }
