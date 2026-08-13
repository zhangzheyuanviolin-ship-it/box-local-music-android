            package p000;

            import android.app.PendingIntent;
            import android.content.Intent;
            import android.graphics.Bitmap;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class i1I1lI001Io0 implements Parcelable.Creator {
                public final int I00000oIO;

                public i1I1lI001Io0(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object createFromParcel(Parcel parcel) {
                    ii00IOi00i1i ii00ioi00i1i;
                    iOolill0lii ioo0loioi;
                    int iI0010I0i;
/* 9 */             double dI000o00OoI0I = 0.0d;
/* 14 */            float fI00100l0 = 0.0f;
/* 18 */            int iI0010I0i2 = 0;
                    switch (this.I00000oIO) {
                        case 0:
/* 4171 */                  int iI001i1O0Ol = lO0Iil10.I001i1O0Ol(parcel);
/* 4175 */                  Intent intent = null;
/* 4180 */                  while (parcel.dataPosition() < iI001i1O0Ol) {
/* 4182 */                      int i = parcel.readInt();
/* 4187 */                      if (((char) i) != 1) {
/* 4189 */                          lO0Iil10.I001IO000(i, parcel);
                                } else {
/* 4200 */                          intent = (Intent) lO0Iil10.I0001Ioi1lo(parcel, i, Intent.CREATOR);
                                }
                            }
/* 4203 */                  lO0Iil10.I000l1(iI001i1O0Ol, parcel);
/* 4208 */                  return new IOO1o0(intent);
                        case 1:
/* 4077 */                  int iI001i1O0Ol2 = lO0Iil10.I001i1O0Ol(parcel);
/* 4081 */                  int iI0010I0i3 = 0;
/* 4082 */                  int iI0010I0i4 = 0;
/* 4084 */                  PendingIntent pendingIntent = null;
/* 4086 */                  String strI000II = null;
                            while (true) {
/* 4088 */                      Integer numValueOf = null;
/* 4094 */                      while (parcel.dataPosition() < iI001i1O0Ol2) {
/* 4096 */                          int i2 = parcel.readInt();
/* 4100 */                          char c = (char) i2;
/* 4101 */                          if (c == 1) {
/* 4157 */                              iI0010I0i3 = lO0Iil10.I0010I0i(i2, parcel);
                                    } else if (c == 2) {
/* 4152 */                              iI0010I0i4 = lO0Iil10.I0010I0i(i2, parcel);
                                    } else if (c == 3) {
/* 4149 */                              pendingIntent = (PendingIntent) lO0Iil10.I0001Ioi1lo(parcel, i2, PendingIntent.CREATOR);
                                    } else if (c == 4) {
/* 4136 */                              strI000II = lO0Iil10.I000II(i2, parcel);
                                    } else if (c != 5) {
/* 4111 */                              lO0Iil10.I001IO000(i2, parcel);
                                    } else {
/* 4115 */                              int iI001IIilI0O = lO0Iil10.I001IIilI0O(i2, parcel);
/* 4119 */                              if (iI001IIilI0O == 0) {
                                            break;
                                        }
/* 4122 */                              lO0Iil10.I001iOo1i0O(parcel, iI001IIilI0O, 4);
/* 4129 */                              numValueOf = Integer.valueOf(parcel.readInt());
                                    }
                                }
/* 4162 */                      lO0Iil10.I000l1(iI001i1O0Ol2, parcel);
/* 4167 */                      return new IOlo10lO1iOl(iI0010I0i3, iI0010I0i4, pendingIntent, strI000II, numValueOf);
                                break;
                            }
                        case 2:
/* 4010 */                  int iI001i1O0Ol3 = lO0Iil10.I001i1O0Ol(parcel);
/* 4014 */                  String strI000II2 = null;
/* 4015 */                  String strI000II3 = null;
/* 4016 */                  String strI000II4 = null;
/* 4021 */                  while (parcel.dataPosition() < iI001i1O0Ol3) {
/* 4023 */                      int i3 = parcel.readInt();
/* 4027 */                      char c2 = (char) i3;
/* 4028 */                      if (c2 == 2) {
/* 4055 */                          iI0010I0i2 = lO0Iil10.I0010I0i(i3, parcel);
                                } else if (c2 == 3) {
/* 4050 */                          strI000II4 = lO0Iil10.I000II(i3, parcel);
                                } else if (c2 == 4) {
/* 4045 */                          strI000II2 = lO0Iil10.I000II(i3, parcel);
                                } else if (c2 != 5) {
/* 4036 */                          lO0Iil10.I001IO000(i3, parcel);
                                } else {
/* 4040 */                          strI000II3 = lO0Iil10.I000II(i3, parcel);
                                }
                            }
/* 4060 */                  lO0Iil10.I000l1(iI001i1O0Ol3, parcel);
/* 4065 */                  lOi1lo loi1lo = new lOi1lo();
/* 4068 */                  loi1lo.I00iOIl = iI0010I0i2;
/* 4070 */                  loi1lo.I00iiI = strI000II4;
/* 4072 */                  loi1lo.I00iiO = strI000II2;
/* 4074 */                  loi1lo.I00iio = strI000II3;
/* 4076 */                  return loi1lo;
                        case 3:
/* 3917 */                  int iI001i1O0Ol4 = lO0Iil10.I001i1O0Ol(parcel);
/* 3921 */                  int iI0010I0i5 = 0;
/* 3922 */                  Bitmap bitmap = null;
/* 3923 */                  ParcelFileDescriptor parcelFileDescriptor = null;
/* 3924 */                  ParcelFileDescriptor parcelFileDescriptor2 = null;
/* 3925 */                  String strI000II5 = null;
/* 3930 */                  while (parcel.dataPosition() < iI001i1O0Ol4) {
/* 3932 */                      int i4 = parcel.readInt();
                                switch ((char) i4) {
                                    case 1:
/* 3981 */                              iI0010I0i2 = lO0Iil10.I0010I0i(i4, parcel);
                                        break;
                                    case 2:
/* 3976 */                              strI000II5 = lO0Iil10.I000II(i4, parcel);
                                        break;
                                    case 3:
/* 3973 */                              bitmap = (Bitmap) lO0Iil10.I0001Ioi1lo(parcel, i4, Bitmap.CREATOR);
                                        break;
                                    case 4:
/* 3962 */                              iI0010I0i5 = lO0Iil10.I0010I0i(i4, parcel);
                                        break;
                                    case 5:
/* 3959 */                              parcelFileDescriptor = (ParcelFileDescriptor) lO0Iil10.I0001Ioi1lo(parcel, i4, ParcelFileDescriptor.CREATOR);
                                        break;
                                    case 6:
/* 3950 */                              parcelFileDescriptor2 = (ParcelFileDescriptor) lO0Iil10.I0001Ioi1lo(parcel, i4, ParcelFileDescriptor.CREATOR);
                                        break;
                                    default:
/* 3940 */                              lO0Iil10.I001IO000(i4, parcel);
                                        break;
                                }
                            }
/* 3986 */                  lO0Iil10.I000l1(iI001i1O0Ol4, parcel);
/* 3991 */                  i1IO1Ol i1io1ol = new i1IO1Ol();
/* 3994 */                  i1io1ol.I00iOIl = iI0010I0i2;
/* 3996 */                  i1io1ol.I00iiI = strI000II5;
/* 3998 */                  i1io1ol.I00iiO = bitmap;
/* 4000 */                  i1io1ol.I00iio = iI0010I0i5;
/* 4002 */                  i1io1ol.I00ilI0I1 = parcelFileDescriptor;
/* 4004 */                  i1io1ol.I00ilO0 = parcelFileDescriptor2;
/* 4006 */                  VarHandle.storeStoreFence();
/* 4009 */                  return i1io1ol;
                        case 4:
/* 3870 */                  int iI001i1O0Ol5 = lO0Iil10.I001i1O0Ol(parcel);
/* 3874 */                  double dI000o00OoI0I2 = 0.0d;
/* 3879 */                  while (parcel.dataPosition() < iI001i1O0Ol5) {
/* 3881 */                      int i5 = parcel.readInt();
/* 3885 */                      char c3 = (char) i5;
/* 3886 */                      if (c3 == 2) {
/* 3899 */                          dI000o00OoI0I = lO0Iil10.I000o00OoI0I(i5, parcel);
                                } else if (c3 != 3) {
/* 3890 */                          lO0Iil10.I001IO000(i5, parcel);
                                } else {
/* 3894 */                          dI000o00OoI0I2 = lO0Iil10.I000o00OoI0I(i5, parcel);
                                }
                            }
/* 3904 */                  lO0Iil10.I000l1(iI001i1O0Ol5, parcel);
/* 3909 */                  li0l01iIOo li0l01iioo = new li0l01iIOo();
/* 3912 */                  li0l01iioo.I00iOIl = dI000o00OoI0I;
/* 3914 */                  li0l01iioo.I00iiI = dI000o00OoI0I2;
/* 3916 */                  return li0l01iioo;
                        case 5:
/* 3783 */                  int iI001i1O0Ol6 = lO0Iil10.I001i1O0Ol(parcel);
/* 3787 */                  String strI000II6 = null;
/* 3788 */                  String strI000II7 = null;
/* 3789 */                  String strI000II8 = null;
/* 3790 */                  String strI000II9 = null;
/* 3791 */                  String strI000II10 = null;
/* 3792 */                  String strI000II11 = null;
/* 3793 */                  String strI000II12 = null;
/* 3798 */                  while (parcel.dataPosition() < iI001i1O0Ol6) {
/* 3800 */                      int i6 = parcel.readInt();
                                switch ((char) i6) {
                                    case 2:
/* 3842 */                              strI000II12 = lO0Iil10.I000II(i6, parcel);
                                        break;
                                    case 3:
/* 3837 */                              strI000II6 = lO0Iil10.I000II(i6, parcel);
                                        break;
                                    case 4:
/* 3832 */                              strI000II7 = lO0Iil10.I000II(i6, parcel);
                                        break;
                                    case 5:
/* 3827 */                              strI000II8 = lO0Iil10.I000II(i6, parcel);
                                        break;
                                    case 6:
/* 3822 */                              strI000II9 = lO0Iil10.I000II(i6, parcel);
                                        break;
                                    case 7:
/* 3817 */                              strI000II10 = lO0Iil10.I000II(i6, parcel);
                                        break;
                                    case '\b':
/* 3812 */                              strI000II11 = lO0Iil10.I000II(i6, parcel);
                                        break;
                                    default:
/* 3808 */                              lO0Iil10.I001IO000(i6, parcel);
                                        break;
                                }
                            }
/* 3847 */                  lO0Iil10.I000l1(iI001i1O0Ol6, parcel);
/* 3852 */                  liiii1looii liiii1looiiVar = new liiii1looii();
/* 3855 */                  liiii1looiiVar.I00iOIl = strI000II12;
/* 3857 */                  liiii1looiiVar.I00iiI = strI000II6;
/* 3859 */                  liiii1looiiVar.I00iiO = strI000II7;
/* 3861 */                  liiii1looiiVar.I00iio = strI000II8;
/* 3863 */                  liiii1looiiVar.I00ilI0I1 = strI000II9;
/* 3865 */                  liiii1looiiVar.I00ilO0 = strI000II10;
/* 3867 */                  liiii1looiiVar.I00io1l = strI000II11;
/* 3869 */                  return liiii1looiiVar;
                        case 6:
/* 3714 */                  int iI001i1O0Ol7 = lO0Iil10.I001i1O0Ol(parcel);
/* 3718 */                  float fI00100l02 = 0.0f;
/* 3719 */                  String strI000II13 = null;
/* 3724 */                  while (parcel.dataPosition() < iI001i1O0Ol7) {
/* 3726 */                      int i7 = parcel.readInt();
/* 3730 */                      char c4 = (char) i7;
/* 3731 */                      if (c4 == 1) {
/* 3758 */                          strI000II13 = lO0Iil10.I000II(i7, parcel);
                                } else if (c4 == 2) {
/* 3753 */                          fI00100l0 = lO0Iil10.I00100l0(i7, parcel);
                                } else if (c4 == 3) {
/* 3748 */                          iI0010I0i2 = lO0Iil10.I0010I0i(i7, parcel);
                                } else if (c4 != 4) {
/* 3739 */                          lO0Iil10.I001IO000(i7, parcel);
                                } else {
/* 3743 */                          fI00100l02 = lO0Iil10.I00100l0(i7, parcel);
                                }
                            }
/* 3763 */                  lO0Iil10.I000l1(iI001i1O0Ol7, parcel);
/* 3768 */                  i1il0o i1il0oVar = new i1il0o();
/* 3771 */                  i1il0oVar.I00iOIl = strI000II13;
/* 3773 */                  i1il0oVar.I00iiI = fI00100l0;
/* 3775 */                  i1il0oVar.I00iiO = iI0010I0i2;
/* 3777 */                  i1il0oVar.I00iio = fI00100l02;
/* 3779 */                  VarHandle.storeStoreFence();
/* 3782 */                  return i1il0oVar;
                        case 7:
/* 3667 */                  int iI001i1O0Ol8 = lO0Iil10.I001i1O0Ol(parcel);
/* 3671 */                  String strI000II14 = null;
/* 3676 */                  while (parcel.dataPosition() < iI001i1O0Ol8) {
/* 3678 */                      int i8 = parcel.readInt();
/* 3682 */                      char c5 = (char) i8;
/* 3683 */                      if (c5 == 2) {
/* 3696 */                          iI0010I0i2 = lO0Iil10.I0010I0i(i8, parcel);
                                } else if (c5 != 3) {
/* 3687 */                          lO0Iil10.I001IO000(i8, parcel);
                                } else {
/* 3691 */                          strI000II14 = lO0Iil10.I000II(i8, parcel);
                                }
                            }
/* 3701 */                  lO0Iil10.I000l1(iI001i1O0Ol8, parcel);
/* 3706 */                  ll0oilIOo0o ll0oilioo0o = new ll0oilIOo0o();
/* 3709 */                  ll0oilioo0o.I00iOIl = iI0010I0i2;
/* 3711 */                  ll0oilioo0o.I00iiI = strI000II14;
/* 3713 */                  return ll0oilioo0o;
                        case 8:
/* 3619 */                  int iI001i1O0Ol9 = lO0Iil10.I001i1O0Ol(parcel);
/* 3623 */                  String strI000II15 = null;
/* 3624 */                  String strI000II16 = null;
/* 3629 */                  while (parcel.dataPosition() < iI001i1O0Ol9) {
/* 3631 */                      int i9 = parcel.readInt();
/* 3635 */                      char c6 = (char) i9;
/* 3636 */                      if (c6 == 2) {
/* 3649 */                          strI000II16 = lO0Iil10.I000II(i9, parcel);
                                } else if (c6 != 3) {
/* 3640 */                          lO0Iil10.I001IO000(i9, parcel);
                                } else {
/* 3644 */                          strI000II15 = lO0Iil10.I000II(i9, parcel);
                                }
                            }
/* 3654 */                  lO0Iil10.I000l1(iI001i1O0Ol9, parcel);
/* 3659 */                  lli1OIoi11i lli1oioi11i = new lli1OIoi11i();
/* 3662 */                  lli1oioi11i.I00iOIl = strI000II16;
/* 3664 */                  lli1oioi11i.I00iiI = strI000II15;
/* 3666 */                  return lli1oioi11i;
                        case 9:
/* 3052 */                  int iI001i1O0Ol10 = lO0Iil10.I001i1O0Ol(parcel);
/* 3056 */                  int iI0010I0i6 = -1;
/* 3058 */                  int iI0010I0i7 = -1;
/* 3060 */                  double dI000o00OoI0I3 = 0.0d;
/* 3062 */                  double dI000o00OoI0I4 = 0.0d;
/* 3064 */                  long jI0010o = 0;
/* 3065 */                  long jI0010o2 = 0;
/* 3066 */                  long jI0010o3 = 0;
/* 3068 */                  long jI0010o4 = 0;
/* 3070 */                  long jI0010o5 = 0;
/* 3072 */                  long jI0010o6 = 0;
/* 3074 */                  long jI0010o7 = 0;
/* 3076 */                  long jI0010o8 = 0;
/* 3078 */                  long jI0010o9 = 0;
/* 3080 */                  long jI0010o10 = 0;
/* 3082 */                  long jI0010o11 = 0;
/* 3084 */                  float fI00100l03 = 0.0f;
/* 3086 */                  int iI0010I0i8 = 0;
/* 3087 */                  int iI0010I0i9 = 0;
/* 3088 */                  int iI0010I0i10 = 0;
/* 3089 */                  int iI0010I0i11 = 0;
/* 3090 */                  int iI0010I0i12 = 0;
/* 3091 */                  int iI0010I0i13 = 0;
/* 3093 */                  int iI0010I0i14 = 0;
/* 3095 */                  int iI0010I0i15 = 0;
/* 3097 */                  int iI0010I0i16 = 0;
/* 3099 */                  boolean zI000lI = false;
/* 3101 */                  int iI0010I0i17 = 0;
/* 3103 */                  int iI0010I0i18 = 0;
/* 3105 */                  int iI0010I0i19 = 0;
/* 3107 */                  int iI0010I0i20 = 0;
/* 3109 */                  int iI0010I0i21 = 0;
/* 3111 */                  int iI0010I0i22 = 0;
/* 3113 */                  int iI0010I0i23 = 0;
/* 3115 */                  int iI0010I0i24 = 0;
/* 3117 */                  int iI0010I0i25 = 0;
/* 3119 */                  int iI0010I0i26 = 0;
/* 3121 */                  int iI0010I0i27 = 0;
/* 3123 */                  byte[] bArrI00000oOI = null;
/* 3125 */                  int[] iArrI0000oI00 = null;
/* 3127 */                  long jI0010o12 = 0;
/* 3129 */                  int iI0010I0i28 = 0;
/* 3131 */                  int iI0010I0i29 = 0;
/* 3136 */                  while (parcel.dataPosition() < iI001i1O0Ol10) {
/* 3138 */                      int i10 = parcel.readInt();
/* 3142 */                      long j = jI0010o2;
                                switch ((char) i10) {
                                    case 1:
/* 3449 */                              iI0010I0i28 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 2:
/* 3443 */                              iI0010I0i29 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 3:
/* 3437 */                              iI0010I0i8 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 4:
/* 3431 */                              iI0010I0i9 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 5:
/* 3425 */                              jI0010o12 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case 6:
/* 3418 */                              iI0010I0i11 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 7:
/* 3411 */                              iI0010I0i12 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '\b':
/* 3404 */                              iI0010I0i10 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '\t':
/* 3398 */                              jI0010o2 = lO0Iil10.I0010o(i10, parcel);
                                        continue;
                                    case '\n':
/* 3390 */                              jI0010o7 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case 11:
/* 3382 */                              jI0010o6 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case '\f':
/* 3374 */                              jI0010o5 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case '\r':
/* 3366 */                              jI0010o4 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case 14:
/* 3358 */                              jI0010o3 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case 15:
/* 3350 */                              iI0010I0i13 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 16:
/* 3342 */                              iI0010I0i14 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case 17:
/* 3334 */                              iI0010I0i15 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_PINKY:
/* 3326 */                              iI0010I0i16 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case PoseLandmark.LEFT_INDEX:
/* 3318 */                              zI000lI = lO0Iil10.I000lI(i10, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_INDEX:
/* 3310 */                              iI0010I0i17 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case PoseLandmark.LEFT_THUMB:
/* 3302 */                              jI0010o8 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_THUMB:
/* 3294 */                              dI000o00OoI0I4 = lO0Iil10.I000o00OoI0I(i10, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HIP:
/* 3286 */                              dI000o00OoI0I3 = lO0Iil10.I000o00OoI0I(i10, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_HIP:
/* 3278 */                              iI0010I0i18 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case PoseLandmark.LEFT_KNEE:
/* 3271 */                              fI00100l03 = lO0Iil10.I00100l0(i10, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_KNEE:
/* 3264 */                              bArrI00000oOI = lO0Iil10.I00000oOI(i10, parcel);
                                        break;
                                    case 27:
/* 3257 */                              iI0010I0i19 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 3250 */                              iI0010I0i20 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HEEL:
/* 3243 */                              jI0010o9 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case 30:
/* 3236 */                              jI0010o10 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 3229 */                              iI0010I0i6 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case ' ':
/* 3222 */                              iI0010I0i21 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '!':
/* 3215 */                              iI0010I0i22 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '\"':
/* 3208 */                              iI0010I0i23 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 3201 */                              iI0010I0i24 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '$':
/* 3194 */                              iI0010I0i25 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '%':
/* 3187 */                              iI0010I0i7 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '&':
/* 3180 */                              iI0010I0i26 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    case '\'':
/* 3173 */                              jI0010o11 = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case '(':
/* 3168 */                              jI0010o = lO0Iil10.I0010o(i10, parcel);
                                        break;
                                    case ')':
/* 3161 */                              iArrI0000oI00 = lO0Iil10.I0000oI00(i10, parcel);
                                        break;
                                    case '*':
/* 3154 */                              iI0010I0i27 = lO0Iil10.I0010I0i(i10, parcel);
                                        break;
                                    default:
/* 3148 */                              lO0Iil10.I001IO000(i10, parcel);
                                        break;
                                }
/* 3151 */                      jI0010o2 = j;
                            }
/* 3457 */                  lO0Iil10.I000l1(iI001i1O0Ol10, parcel);
/* 3462 */                  i1ll1I1llOl0 i1ll1i1llol0 = new i1ll1I1llOl0();
/* 3465 */                  i1ll1i1llol0.I00iOIl = iI0010I0i28;
/* 3467 */                  i1ll1i1llol0.I00iiI = jI0010o;
/* 3469 */                  i1ll1i1llol0.I00iiO = iI0010I0i29;
/* 3471 */                  i1ll1i1llol0.I00iio = iI0010I0i8;
/* 3473 */                  i1ll1i1llol0.I00ilI0I1 = iI0010I0i9;
/* 3475 */                  i1ll1i1llol0.I00ilO0 = jI0010o12;
/* 3477 */                  i1ll1i1llol0.I00io1l = iI0010I0i11;
/* 3479 */                  i1ll1i1llol0.I00ioIO = iI0010I0i12;
/* 3481 */                  i1ll1i1llol0.I00l0I0l0lO1 = iI0010I0i10;
/* 3485 */                  i1ll1i1llol0.I00l0OO0IO = jI0010o2;
/* 3489 */                  i1ll1i1llol0.I00li1OI = jI0010o7;
/* 3493 */                  i1ll1i1llol0.I00ll1 = jI0010o6;
/* 3497 */                  i1ll1i1llol0.I00lli11 = jI0010o5;
/* 3501 */                  i1ll1i1llol0.I00lll10 = jI0010o4;
/* 3505 */                  i1ll1i1llol0.I00o0iI0io1 = jI0010o3;
/* 3509 */                  i1ll1i1llol0.I00o0l1o1o0 = iI0010I0i13;
/* 3513 */                  i1ll1i1llol0.I00o101lO = iI0010I0i14;
/* 3517 */                  i1ll1i1llol0.I00oI0i = iI0010I0i15;
/* 3521 */                  i1ll1i1llol0.I00oII = iI0010I0i16;
/* 3525 */                  i1ll1i1llol0.I00oIiI10 = zI000lI;
/* 3529 */                  i1ll1i1llol0.I00oO101o = iI0010I0i17;
/* 3533 */                  i1ll1i1llol0.I00oOio10iI1 = jI0010o8;
/* 3537 */                  i1ll1i1llol0.I00ol1 = dI000o00OoI0I4;
/* 3541 */                  i1ll1i1llol0.I00olI = dI000o00OoI0I3;
/* 3545 */                  i1ll1i1llol0.I00oli = iI0010I0i18;
/* 3549 */                  i1ll1i1llol0.I00oliIiO01i = fI00100l03;
/* 3553 */                  i1ll1i1llol0.I00oo1iO0ll = bArrI00000oOI;
/* 3557 */                  i1ll1i1llol0.I00ooIo0 = iI0010I0i19;
/* 3561 */                  i1ll1i1llol0.I00ooiO1I = iI0010I0i20;
/* 3565 */                  i1ll1i1llol0.I00oooO = jI0010o9;
/* 3569 */                  i1ll1i1llol0.I0100i = jI0010o10;
/* 3573 */                  i1ll1i1llol0.I0100o111I = iI0010I0i6;
/* 3577 */                  i1ll1i1llol0.I010101Oo1lO = iI0010I0i21;
/* 3581 */                  i1ll1i1llol0.I010I0 = iI0010I0i22;
/* 3585 */                  i1ll1i1llol0.I010II = iI0010I0i23;
/* 3589 */                  i1ll1i1llol0.I010OIo1l = iI0010I0i24;
/* 3593 */                  i1ll1i1llol0.I010i10l = iI0010I0i25;
/* 3597 */                  i1ll1i1llol0.I010iIIOlo = iI0010I0i7;
/* 3601 */                  i1ll1i1llol0.I010ioo = iI0010I0i26;
/* 3605 */                  i1ll1i1llol0.I010l10O = jI0010o11;
/* 3609 */                  i1ll1i1llol0.I010l1O = iArrI0000oI00;
/* 3613 */                  i1ll1i1llol0.I010l1ol111 = iI0010I0i27;
/* 3615 */                  VarHandle.storeStoreFence();
/* 3618 */                  return i1ll1i1llol0;
                        case 10:
/* 2485 */                  int iI001i1O0Ol11 = lO0Iil10.I001i1O0Ol(parcel);
/* 2489 */                  int iI0010I0i30 = -1;
/* 2491 */                  int iI0010I0i31 = -1;
/* 2493 */                  double dI000o00OoI0I5 = 0.0d;
/* 2495 */                  double dI000o00OoI0I6 = 0.0d;
/* 2497 */                  long jI0010o13 = 0;
/* 2498 */                  long jI0010o14 = 0;
/* 2499 */                  long jI0010o15 = 0;
/* 2501 */                  long jI0010o16 = 0;
/* 2503 */                  long jI0010o17 = 0;
/* 2505 */                  long jI0010o18 = 0;
/* 2507 */                  long jI0010o19 = 0;
/* 2509 */                  long jI0010o20 = 0;
/* 2511 */                  long jI0010o21 = 0;
/* 2513 */                  long jI0010o22 = 0;
/* 2515 */                  long jI0010o23 = 0;
/* 2517 */                  float fI00100l04 = 0.0f;
/* 2519 */                  int iI0010I0i32 = 0;
/* 2520 */                  int iI0010I0i33 = 0;
/* 2521 */                  int iI0010I0i34 = 0;
/* 2522 */                  int iI0010I0i35 = 0;
/* 2523 */                  int iI0010I0i36 = 0;
/* 2524 */                  int iI0010I0i37 = 0;
/* 2526 */                  int iI0010I0i38 = 0;
/* 2528 */                  int iI0010I0i39 = 0;
/* 2530 */                  int iI0010I0i40 = 0;
/* 2532 */                  boolean zI000lI2 = false;
/* 2534 */                  int iI0010I0i41 = 0;
/* 2536 */                  int iI0010I0i42 = 0;
/* 2538 */                  int iI0010I0i43 = 0;
/* 2540 */                  int iI0010I0i44 = 0;
/* 2542 */                  int iI0010I0i45 = 0;
/* 2544 */                  int iI0010I0i46 = 0;
/* 2546 */                  int iI0010I0i47 = 0;
/* 2548 */                  int iI0010I0i48 = 0;
/* 2550 */                  int iI0010I0i49 = 0;
/* 2552 */                  int iI0010I0i50 = 0;
/* 2554 */                  int iI0010I0i51 = 0;
/* 2556 */                  byte[] bArrI00000oOI2 = null;
/* 2558 */                  int[] iArrI0000oI002 = null;
/* 2560 */                  long jI0010o24 = 0;
/* 2562 */                  int iI0010I0i52 = 0;
/* 2564 */                  int iI0010I0i53 = 0;
/* 2569 */                  while (parcel.dataPosition() < iI001i1O0Ol11) {
/* 2571 */                      int i11 = parcel.readInt();
/* 2575 */                      long j2 = jI0010o14;
                                switch ((char) i11) {
                                    case 1:
/* 2882 */                              iI0010I0i52 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 2:
/* 2876 */                              iI0010I0i53 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 3:
/* 2870 */                              iI0010I0i32 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 4:
/* 2864 */                              iI0010I0i33 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 5:
/* 2858 */                              jI0010o24 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case 6:
/* 2851 */                              iI0010I0i35 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 7:
/* 2844 */                              iI0010I0i36 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case '\b':
/* 2837 */                              iI0010I0i34 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case '\t':
/* 2831 */                              jI0010o14 = lO0Iil10.I0010o(i11, parcel);
                                        continue;
                                    case '\n':
/* 2823 */                              jI0010o19 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case 11:
/* 2815 */                              jI0010o18 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case '\f':
/* 2807 */                              jI0010o17 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case '\r':
/* 2799 */                              jI0010o16 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case 14:
/* 2791 */                              jI0010o15 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case 15:
/* 2783 */                              iI0010I0i37 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 16:
/* 2775 */                              iI0010I0i38 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case 17:
/* 2767 */                              iI0010I0i39 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_PINKY:
/* 2759 */                              iI0010I0i40 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case PoseLandmark.LEFT_INDEX:
/* 2751 */                              zI000lI2 = lO0Iil10.I000lI(i11, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_INDEX:
/* 2743 */                              iI0010I0i41 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case PoseLandmark.LEFT_THUMB:
/* 2735 */                              jI0010o20 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_THUMB:
/* 2727 */                              dI000o00OoI0I6 = lO0Iil10.I000o00OoI0I(i11, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HIP:
/* 2719 */                              dI000o00OoI0I5 = lO0Iil10.I000o00OoI0I(i11, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_HIP:
/* 2711 */                              iI0010I0i42 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case PoseLandmark.LEFT_KNEE:
/* 2704 */                              fI00100l04 = lO0Iil10.I00100l0(i11, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_KNEE:
/* 2697 */                              bArrI00000oOI2 = lO0Iil10.I00000oOI(i11, parcel);
                                        break;
                                    case 27:
/* 2690 */                              iI0010I0i43 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 2683 */                              iI0010I0i44 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HEEL:
/* 2676 */                              jI0010o21 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case 30:
/* 2669 */                              jI0010o22 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 2662 */                              iI0010I0i30 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case ' ':
/* 2655 */                              iI0010I0i45 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case '!':
/* 2648 */                              iI0010I0i46 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case '\"':
/* 2641 */                              iI0010I0i47 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 2634 */                              iI0010I0i48 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case '$':
/* 2627 */                              iI0010I0i49 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case '%':
/* 2620 */                              iI0010I0i31 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case '&':
/* 2613 */                              iI0010I0i50 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    case '\'':
/* 2606 */                              jI0010o23 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case '(':
/* 2601 */                              jI0010o13 = lO0Iil10.I0010o(i11, parcel);
                                        break;
                                    case ')':
/* 2594 */                              iArrI0000oI002 = lO0Iil10.I0000oI00(i11, parcel);
                                        break;
                                    case '*':
/* 2587 */                              iI0010I0i51 = lO0Iil10.I0010I0i(i11, parcel);
                                        break;
                                    default:
/* 2581 */                              lO0Iil10.I001IO000(i11, parcel);
                                        break;
                                }
/* 2584 */                      jI0010o14 = j2;
                            }
/* 2890 */                  lO0Iil10.I000l1(iI001i1O0Ol11, parcel);
/* 2895 */                  i1llOOiillll i1llooiillll = new i1llOOiillll();
/* 2898 */                  i1llooiillll.I00iOIl = iI0010I0i52;
/* 2900 */                  i1llooiillll.I00iiI = jI0010o13;
/* 2902 */                  i1llooiillll.I00iiO = iI0010I0i53;
/* 2904 */                  i1llooiillll.I00iio = iI0010I0i32;
/* 2906 */                  i1llooiillll.I00ilI0I1 = iI0010I0i33;
/* 2908 */                  i1llooiillll.I00ilO0 = jI0010o24;
/* 2910 */                  i1llooiillll.I00io1l = iI0010I0i35;
/* 2912 */                  i1llooiillll.I00ioIO = iI0010I0i36;
/* 2914 */                  i1llooiillll.I00l0I0l0lO1 = iI0010I0i34;
/* 2918 */                  i1llooiillll.I00l0OO0IO = jI0010o14;
/* 2922 */                  i1llooiillll.I00li1OI = jI0010o19;
/* 2926 */                  i1llooiillll.I00ll1 = jI0010o18;
/* 2930 */                  i1llooiillll.I00lli11 = jI0010o17;
/* 2934 */                  i1llooiillll.I00lll10 = jI0010o16;
/* 2938 */                  i1llooiillll.I00o0iI0io1 = jI0010o15;
/* 2942 */                  i1llooiillll.I00o0l1o1o0 = iI0010I0i37;
/* 2946 */                  i1llooiillll.I00o101lO = iI0010I0i38;
/* 2950 */                  i1llooiillll.I00oI0i = iI0010I0i39;
/* 2954 */                  i1llooiillll.I00oII = iI0010I0i40;
/* 2958 */                  i1llooiillll.I00oIiI10 = zI000lI2;
/* 2962 */                  i1llooiillll.I00oO101o = iI0010I0i41;
/* 2966 */                  i1llooiillll.I00oOio10iI1 = jI0010o20;
/* 2970 */                  i1llooiillll.I00ol1 = dI000o00OoI0I6;
/* 2974 */                  i1llooiillll.I00olI = dI000o00OoI0I5;
/* 2978 */                  i1llooiillll.I00oli = iI0010I0i42;
/* 2982 */                  i1llooiillll.I00oliIiO01i = fI00100l04;
/* 2986 */                  i1llooiillll.I00oo1iO0ll = bArrI00000oOI2;
/* 2990 */                  i1llooiillll.I00ooIo0 = iI0010I0i43;
/* 2994 */                  i1llooiillll.I00ooiO1I = iI0010I0i44;
/* 2998 */                  i1llooiillll.I00oooO = jI0010o21;
/* 3002 */                  i1llooiillll.I0100i = jI0010o22;
/* 3006 */                  i1llooiillll.I0100o111I = iI0010I0i30;
/* 3010 */                  i1llooiillll.I010101Oo1lO = iI0010I0i45;
/* 3014 */                  i1llooiillll.I010I0 = iI0010I0i46;
/* 3018 */                  i1llooiillll.I010II = iI0010I0i47;
/* 3022 */                  i1llooiillll.I010OIo1l = iI0010I0i48;
/* 3026 */                  i1llooiillll.I010i10l = iI0010I0i49;
/* 3030 */                  i1llooiillll.I010iIIOlo = iI0010I0i31;
/* 3034 */                  i1llooiillll.I010ioo = iI0010I0i50;
/* 3038 */                  i1llooiillll.I010l10O = jI0010o23;
/* 3042 */                  i1llooiillll.I010l1O = iArrI0000oI002;
/* 3046 */                  i1llooiillll.I010l1ol111 = iI0010I0i51;
/* 3048 */                  VarHandle.storeStoreFence();
/* 3051 */                  return i1llooiillll;
                        case 11:
/* 2418 */                  int iI001i1O0Ol12 = lO0Iil10.I001i1O0Ol(parcel);
/* 2422 */                  iII0O0OIo iii0o0oio = null;
/* 2423 */                  ArrayList arrayListI000iOII = null;
/* 2424 */                  ArrayList arrayListI000OOo1O = null;
/* 2429 */                  while (parcel.dataPosition() < iI001i1O0Ol12) {
/* 2431 */                      int i12 = parcel.readInt();
/* 2435 */                      char c7 = (char) i12;
/* 2436 */                      if (c7 == 1) {
/* 2462 */                          arrayListI000OOo1O = lO0Iil10.I000OOo1O(i12, parcel);
                                } else if (c7 == 2) {
/* 2459 */                          iii0o0oio = (iII0O0OIo) lO0Iil10.I0001Ioi1lo(parcel, i12, iII0O0OIo.CREATOR);
                                } else if (c7 != 3) {
/* 2442 */                          lO0Iil10.I001IO000(i12, parcel);
                                } else {
/* 2448 */                          arrayListI000iOII = lO0Iil10.I000iOII(parcel, i12, iIOoi0Ii0.CREATOR);
                                }
                            }
/* 2467 */                  lO0Iil10.I000l1(iI001i1O0Ol12, parcel);
/* 2472 */                  i1oloIIl i1oloiil = new i1oloIIl();
/* 2475 */                  i1oloiil.I00iOIl = arrayListI000OOo1O;
/* 2477 */                  i1oloiil.I00iiI = iii0o0oio;
/* 2479 */                  i1oloiil.I00iiO = arrayListI000iOII;
/* 2481 */                  VarHandle.storeStoreFence();
/* 2484 */                  return i1oloiil;
                        case 12:
/* 1851 */                  int iI001i1O0Ol13 = lO0Iil10.I001i1O0Ol(parcel);
/* 1855 */                  int iI0010I0i54 = -1;
/* 1857 */                  int iI0010I0i55 = -1;
/* 1859 */                  double dI000o00OoI0I7 = 0.0d;
/* 1861 */                  double dI000o00OoI0I8 = 0.0d;
/* 1863 */                  long jI0010o25 = 0;
/* 1864 */                  long jI0010o26 = 0;
/* 1865 */                  long jI0010o27 = 0;
/* 1867 */                  long jI0010o28 = 0;
/* 1869 */                  long jI0010o29 = 0;
/* 1871 */                  long jI0010o30 = 0;
/* 1873 */                  long jI0010o31 = 0;
/* 1875 */                  long jI0010o32 = 0;
/* 1877 */                  long jI0010o33 = 0;
/* 1879 */                  long jI0010o34 = 0;
/* 1881 */                  long jI0010o35 = 0;
/* 1883 */                  float fI00100l05 = 0.0f;
/* 1885 */                  int iI0010I0i56 = 0;
/* 1886 */                  int iI0010I0i57 = 0;
/* 1887 */                  int iI0010I0i58 = 0;
/* 1888 */                  int iI0010I0i59 = 0;
/* 1889 */                  int iI0010I0i60 = 0;
/* 1890 */                  int iI0010I0i61 = 0;
/* 1892 */                  int iI0010I0i62 = 0;
/* 1894 */                  int iI0010I0i63 = 0;
/* 1896 */                  int iI0010I0i64 = 0;
/* 1898 */                  boolean zI000lI3 = false;
/* 1900 */                  int iI0010I0i65 = 0;
/* 1902 */                  int iI0010I0i66 = 0;
/* 1904 */                  int iI0010I0i67 = 0;
/* 1906 */                  int iI0010I0i68 = 0;
/* 1908 */                  int iI0010I0i69 = 0;
/* 1910 */                  int iI0010I0i70 = 0;
/* 1912 */                  int iI0010I0i71 = 0;
/* 1914 */                  int iI0010I0i72 = 0;
/* 1916 */                  int iI0010I0i73 = 0;
/* 1918 */                  int iI0010I0i74 = 0;
/* 1920 */                  int iI0010I0i75 = 0;
/* 1922 */                  byte[] bArrI00000oOI3 = null;
/* 1924 */                  int[] iArrI0000oI003 = null;
/* 1926 */                  long jI0010o36 = 0;
/* 1928 */                  int iI0010I0i76 = 0;
/* 1930 */                  int iI0010I0i77 = 0;
/* 1935 */                  while (parcel.dataPosition() < iI001i1O0Ol13) {
/* 1937 */                      int i13 = parcel.readInt();
/* 1941 */                      long j3 = jI0010o26;
                                switch ((char) i13) {
                                    case 1:
/* 2248 */                              iI0010I0i76 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 2:
/* 2242 */                              iI0010I0i77 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 3:
/* 2236 */                              iI0010I0i56 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 4:
/* 2230 */                              iI0010I0i57 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 5:
/* 2224 */                              jI0010o36 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case 6:
/* 2217 */                              iI0010I0i59 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 7:
/* 2210 */                              iI0010I0i60 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case '\b':
/* 2203 */                              iI0010I0i58 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case '\t':
/* 2197 */                              jI0010o26 = lO0Iil10.I0010o(i13, parcel);
                                        continue;
                                    case '\n':
/* 2189 */                              jI0010o31 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case 11:
/* 2181 */                              jI0010o30 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case '\f':
/* 2173 */                              jI0010o29 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case '\r':
/* 2165 */                              jI0010o28 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case 14:
/* 2157 */                              jI0010o27 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case 15:
/* 2149 */                              iI0010I0i61 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 16:
/* 2141 */                              iI0010I0i62 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case 17:
/* 2133 */                              iI0010I0i63 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_PINKY:
/* 2125 */                              iI0010I0i64 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case PoseLandmark.LEFT_INDEX:
/* 2117 */                              zI000lI3 = lO0Iil10.I000lI(i13, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_INDEX:
/* 2109 */                              iI0010I0i65 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case PoseLandmark.LEFT_THUMB:
/* 2101 */                              jI0010o32 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_THUMB:
/* 2093 */                              dI000o00OoI0I8 = lO0Iil10.I000o00OoI0I(i13, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HIP:
/* 2085 */                              dI000o00OoI0I7 = lO0Iil10.I000o00OoI0I(i13, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_HIP:
/* 2077 */                              iI0010I0i66 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case PoseLandmark.LEFT_KNEE:
/* 2070 */                              fI00100l05 = lO0Iil10.I00100l0(i13, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_KNEE:
/* 2063 */                              bArrI00000oOI3 = lO0Iil10.I00000oOI(i13, parcel);
                                        break;
                                    case 27:
/* 2056 */                              iI0010I0i67 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 2049 */                              iI0010I0i68 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HEEL:
/* 2042 */                              jI0010o33 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case 30:
/* 2035 */                              jI0010o34 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 2028 */                              iI0010I0i54 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case ' ':
/* 2021 */                              iI0010I0i69 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case '!':
/* 2014 */                              iI0010I0i70 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case '\"':
/* 2007 */                              iI0010I0i71 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 2000 */                              iI0010I0i72 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case '$':
/* 1993 */                              iI0010I0i73 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case '%':
/* 1986 */                              iI0010I0i55 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case '&':
/* 1979 */                              iI0010I0i74 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    case '\'':
/* 1972 */                              jI0010o35 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case '(':
/* 1967 */                              jI0010o25 = lO0Iil10.I0010o(i13, parcel);
                                        break;
                                    case ')':
/* 1960 */                              iArrI0000oI003 = lO0Iil10.I0000oI00(i13, parcel);
                                        break;
                                    case '*':
/* 1953 */                              iI0010I0i75 = lO0Iil10.I0010I0i(i13, parcel);
                                        break;
                                    default:
/* 1947 */                              lO0Iil10.I001IO000(i13, parcel);
                                        break;
                                }
/* 1950 */                      jI0010o26 = j3;
                            }
/* 2256 */                  lO0Iil10.I000l1(iI001i1O0Ol13, parcel);
/* 2261 */                  i1oloIlo0o1o i1oloilo0o1o = new i1oloIlo0o1o();
/* 2264 */                  i1oloilo0o1o.I00iOIl = iI0010I0i76;
/* 2266 */                  i1oloilo0o1o.I00iiI = jI0010o25;
/* 2268 */                  i1oloilo0o1o.I00iiO = iI0010I0i77;
/* 2270 */                  i1oloilo0o1o.I00iio = iI0010I0i56;
/* 2272 */                  i1oloilo0o1o.I00ilI0I1 = iI0010I0i57;
/* 2274 */                  i1oloilo0o1o.I00ilO0 = jI0010o36;
/* 2276 */                  i1oloilo0o1o.I00io1l = iI0010I0i59;
/* 2278 */                  i1oloilo0o1o.I00ioIO = iI0010I0i60;
/* 2280 */                  i1oloilo0o1o.I00l0I0l0lO1 = iI0010I0i58;
/* 2284 */                  i1oloilo0o1o.I00l0OO0IO = jI0010o26;
/* 2288 */                  i1oloilo0o1o.I00li1OI = jI0010o31;
/* 2292 */                  i1oloilo0o1o.I00ll1 = jI0010o30;
/* 2296 */                  i1oloilo0o1o.I00lli11 = jI0010o29;
/* 2300 */                  i1oloilo0o1o.I00lll10 = jI0010o28;
/* 2304 */                  i1oloilo0o1o.I00o0iI0io1 = jI0010o27;
/* 2308 */                  i1oloilo0o1o.I00o0l1o1o0 = iI0010I0i61;
/* 2312 */                  i1oloilo0o1o.I00o101lO = iI0010I0i62;
/* 2316 */                  i1oloilo0o1o.I00oI0i = iI0010I0i63;
/* 2320 */                  i1oloilo0o1o.I00oII = iI0010I0i64;
/* 2324 */                  i1oloilo0o1o.I00oIiI10 = zI000lI3;
/* 2328 */                  i1oloilo0o1o.I00oO101o = iI0010I0i65;
/* 2332 */                  i1oloilo0o1o.I00oOio10iI1 = jI0010o32;
/* 2336 */                  i1oloilo0o1o.I00ol1 = dI000o00OoI0I8;
/* 2340 */                  i1oloilo0o1o.I00olI = dI000o00OoI0I7;
/* 2344 */                  i1oloilo0o1o.I00oli = iI0010I0i66;
/* 2348 */                  i1oloilo0o1o.I00oliIiO01i = fI00100l05;
/* 2352 */                  i1oloilo0o1o.I00oo1iO0ll = bArrI00000oOI3;
/* 2356 */                  i1oloilo0o1o.I00ooIo0 = iI0010I0i67;
/* 2360 */                  i1oloilo0o1o.I00ooiO1I = iI0010I0i68;
/* 2364 */                  i1oloilo0o1o.I00oooO = jI0010o33;
/* 2368 */                  i1oloilo0o1o.I0100i = jI0010o34;
/* 2372 */                  i1oloilo0o1o.I0100o111I = iI0010I0i54;
/* 2376 */                  i1oloilo0o1o.I010101Oo1lO = iI0010I0i69;
/* 2380 */                  i1oloilo0o1o.I010I0 = iI0010I0i70;
/* 2384 */                  i1oloilo0o1o.I010II = iI0010I0i71;
/* 2388 */                  i1oloilo0o1o.I010OIo1l = iI0010I0i72;
/* 2392 */                  i1oloilo0o1o.I010i10l = iI0010I0i73;
/* 2396 */                  i1oloilo0o1o.I010iIIOlo = iI0010I0i55;
/* 2400 */                  i1oloilo0o1o.I010ioo = iI0010I0i74;
/* 2404 */                  i1oloilo0o1o.I010l10O = jI0010o35;
/* 2408 */                  i1oloilo0o1o.I010l1O = iArrI0000oI003;
/* 2412 */                  i1oloilo0o1o.I010l1ol111 = iI0010I0i75;
/* 2414 */                  VarHandle.storeStoreFence();
/* 2417 */                  return i1oloilo0o1o;
                        case 13:
/* 1803 */                  int iI001i1O0Ol14 = lO0Iil10.I001i1O0Ol(parcel);
/* 1807 */                  String strI000II17 = null;
/* 1808 */                  String strI000II18 = null;
/* 1813 */                  while (parcel.dataPosition() < iI001i1O0Ol14) {
/* 1815 */                      int i14 = parcel.readInt();
/* 1819 */                      char c8 = (char) i14;
/* 1820 */                      if (c8 == 2) {
/* 1833 */                          strI000II18 = lO0Iil10.I000II(i14, parcel);
                                } else if (c8 != 3) {
/* 1824 */                          lO0Iil10.I001IO000(i14, parcel);
                                } else {
/* 1828 */                          strI000II17 = lO0Iil10.I000II(i14, parcel);
                                }
                            }
/* 1838 */                  lO0Iil10.I000l1(iI001i1O0Ol14, parcel);
/* 1843 */                  lo00o1OOI lo00o1ooi = new lo00o1OOI();
/* 1846 */                  lo00o1ooi.I00iOIl = strI000II18;
/* 1848 */                  lo00o1ooi.I00iiI = strI000II17;
/* 1850 */                  return lo00o1ooi;
                        case 14:
/* 1744 */                  int iI001i1O0Ol15 = lO0Iil10.I001i1O0Ol(parcel);
/* 1748 */                  long jI0010o37 = 0;
/* 1750 */                  long jI0010o38 = 0;
/* 1752 */                  int iI0010I0i78 = 0;
/* 1757 */                  while (parcel.dataPosition() < iI001i1O0Ol15) {
/* 1759 */                      int i15 = parcel.readInt();
/* 1763 */                      char c9 = (char) i15;
/* 1764 */                      if (c9 == 1) {
/* 1787 */                          jI0010o37 = lO0Iil10.I0010o(i15, parcel);
                                } else if (c9 == 2) {
/* 1781 */                          iI0010I0i78 = lO0Iil10.I0010I0i(i15, parcel);
                                } else if (c9 != 3) {
/* 1770 */                          lO0Iil10.I001IO000(i15, parcel);
                                } else {
/* 1774 */                          jI0010o38 = lO0Iil10.I0010o(i15, parcel);
                                }
                            }
/* 1794 */                  lO0Iil10.I000l1(iI001i1O0Ol15, parcel);
/* 1799 */                  return new iI0iiII1i(iI0010I0i78, jI0010o37, jI0010o38);
                        case 15:
/* 1500 */                  int iI001i1O0Ol16 = lO0Iil10.I001i1O0Ol(parcel);
/* 1504 */                  int iI0010I0i79 = 0;
/* 1505 */                  int iI0010I0i80 = 0;
/* 1506 */                  int iI0010I0i81 = 0;
/* 1507 */                  int iI0010I0i82 = 0;
/* 1508 */                  int iI0010I0i83 = 0;
/* 1509 */                  int iI0010I0i84 = 0;
/* 1511 */                  int iI0010I0i85 = 0;
/* 1513 */                  String strI000II19 = null;
/* 1514 */                  String strI000II20 = null;
/* 1515 */                  IBinder iBinderI00100o1O0lo = null;
/* 1516 */                  IBinder iBinderI00100o1O0lo2 = null;
/* 1517 */                  String strI000II21 = null;
/* 1518 */                  String strI000II22 = null;
/* 1519 */                  ArrayList arrayListI000iOII2 = null;
/* 1521 */                  ArrayList arrayListI000iOII3 = null;
/* 1527 */                  while (parcel.dataPosition() < iI001i1O0Ol16) {
/* 1529 */                      int i16 = parcel.readInt();
/* 1533 */                      int i17 = iI0010I0i83;
                                switch ((char) i16) {
                                    case 1:
/* 1629 */                              arrayListI000iOII2 = lO0Iil10.I000iOII(parcel, i16, i1IO1Ol.CREATOR);
                                        break;
                                    case 2:
/* 1622 */                              fI00100l0 = lO0Iil10.I00100l0(i16, parcel);
                                        break;
                                    case 3:
/* 1617 */                              iI0010I0i2 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 4:
/* 1612 */                              iI0010I0i79 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 5:
/* 1607 */                              iBinderI00100o1O0lo = lO0Iil10.I00100o1O0lo(i16, parcel);
                                        break;
                                    case 6:
/* 1602 */                              iI0010I0i80 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 7:
/* 1597 */                              iBinderI00100o1O0lo2 = lO0Iil10.I00100o1O0lo(i16, parcel);
                                        break;
                                    case '\b':
/* 1592 */                              arrayListI000iOII3 = lO0Iil10.I000iOII(parcel, i16, ParcelFileDescriptor.CREATOR);
                                        break;
                                    case '\t':
/* 1585 */                              iI0010I0i81 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case '\n':
/* 1580 */                              iI0010I0i82 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 11:
/* 1575 */                              strI000II21 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case '\f':
/* 1570 */                              strI000II20 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case '\r':
/* 1565 */                              strI000II22 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 14:
/* 1560 */                              strI000II19 = lO0Iil10.I000II(i16, parcel);
                                        break;
                                    case 15:
/* 1555 */                              iI0010I0i83 = lO0Iil10.I0010I0i(i16, parcel);
                                        continue;
                                    case 16:
/* 1550 */                              iI0010I0i85 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    case 17:
/* 1545 */                              iI0010I0i84 = lO0Iil10.I0010I0i(i16, parcel);
                                        break;
                                    default:
/* 1539 */                              lO0Iil10.I001IO000(i16, parcel);
                                        break;
                                }
/* 1542 */                      iI0010I0i83 = i17;
                            }
/* 1634 */                  int i18 = iI0010I0i83;
/* 1636 */                  lO0Iil10.I000l1(iI001i1O0Ol16, parcel);
/* 1641 */                  iI0lIOOiil ii0liooiil = new iI0lIOOiil();
/* 1648 */                  ii0liooiil.I00iOIl = lOI1lll1l10.I000o00OoI0I(arrayListI000iOII2);
/* 1650 */                  ii0liooiil.I00iiI = fI00100l0;
/* 1652 */                  ii0liooiil.I00iiO = iI0010I0i2;
/* 1654 */                  ii0liooiil.I00iio = iI0010I0i79;
/* 1658 */                  if (iBinderI00100o1O0lo == null) {
/* 1660 */                      ii00ioi00i1i = null;
                            } else {
/* 1664 */                      IInterface iInterfaceQueryLocalInterface = iBinderI00100o1O0lo.queryLocalInterface("com.google.android.apps.aicore.aidl.ICortanaStreamingCallback");
/* 1677 */                      ii00ioi00i1i = iInterfaceQueryLocalInterface instanceof ii00IOi00i1i ? (ii00IOi00i1i) iInterfaceQueryLocalInterface : new ii00IOi00i1i(iBinderI00100o1O0lo, "com.google.android.apps.aicore.aidl.ICortanaStreamingCallback", 12);
                            }
/* 1680 */                  ii0liooiil.I00o101lO = ii00ioi00i1i;
/* 1682 */                  ii0liooiil.I00ilI0I1 = iI0010I0i80;
/* 1684 */                  if (iBinderI00100o1O0lo2 == null) {
/* 1686 */                      ioo0loioi = null;
                            } else {
/* 1690 */                      IInterface iInterfaceQueryLocalInterface2 = iBinderI00100o1O0lo2.queryLocalInterface("com.google.android.apps.aicore.aidl.ICortanaStateCallback");
/* 1704 */                      ioo0loioi = iInterfaceQueryLocalInterface2 instanceof iOolill0lii ? (iOolill0lii) iInterfaceQueryLocalInterface2 : new iOo0lOioi(iBinderI00100o1O0lo2, "com.google.android.apps.aicore.aidl.ICortanaStateCallback", 12);
                            }
/* 1708 */                  ii0liooiil.I00ilO0 = ioo0loioi;
/* 1714 */                  ii0liooiil.I00io1l = lOI1lll1l10.I000o00OoI0I(arrayListI000iOII3);
/* 1716 */                  ii0liooiil.I00ioIO = iI0010I0i81;
/* 1718 */                  ii0liooiil.I00l0I0l0lO1 = iI0010I0i82;
/* 1720 */                  ii0liooiil.I00l0OO0IO = strI000II21;
/* 1722 */                  ii0liooiil.I00li1OI = strI000II20;
/* 1724 */                  ii0liooiil.I00ll1 = strI000II22;
/* 1726 */                  ii0liooiil.I00lli11 = strI000II19;
/* 1730 */                  ii0liooiil.I00lll10 = i18;
/* 1734 */                  ii0liooiil.I00o0iI0io1 = iI0010I0i85;
/* 1738 */                  ii0liooiil.I00o0l1o1o0 = iI0010I0i84;
/* 1740 */                  VarHandle.storeStoreFence();
/* 1743 */                  return ii0liooiil;
                        case 16:
/* 1443 */                  int iI001i1O0Ol17 = lO0Iil10.I001i1O0Ol(parcel);
/* 1447 */                  String strI000II23 = null;
/* 1448 */                  String strI000II24 = null;
/* 1453 */                  while (parcel.dataPosition() < iI001i1O0Ol17) {
/* 1455 */                      int i19 = parcel.readInt();
/* 1459 */                      char c10 = (char) i19;
/* 1460 */                      if (c10 == 2) {
/* 1480 */                          strI000II24 = lO0Iil10.I000II(i19, parcel);
                                } else if (c10 == 3) {
/* 1475 */                          strI000II23 = lO0Iil10.I000II(i19, parcel);
                                } else if (c10 != 4) {
/* 1466 */                          lO0Iil10.I001IO000(i19, parcel);
                                } else {
/* 1470 */                          iI0010I0i2 = lO0Iil10.I0010I0i(i19, parcel);
                                }
                            }
/* 1485 */                  lO0Iil10.I000l1(iI001i1O0Ol17, parcel);
/* 1490 */                  loO1OIOlI0O1 loo1oioli0o1 = new loO1OIOlI0O1();
/* 1493 */                  loo1oioli0o1.I00iOIl = strI000II24;
/* 1495 */                  loo1oioli0o1.I00iiI = strI000II23;
/* 1497 */                  loo1oioli0o1.I00iiO = iI0010I0i2;
/* 1499 */                  return loo1oioli0o1;
                        case 17:
/* 1371 */                  int iI001i1O0Ol18 = lO0Iil10.I001i1O0Ol(parcel);
/* 1375 */                  int iI0010I0i86 = 0;
/* 1376 */                  int iI0010I0i87 = 0;
/* 1378 */                  int iI0010I0i88 = 0;
/* 1380 */                  boolean zI000lI4 = false;
/* 1382 */                  boolean zI000lI5 = false;
/* 1388 */                  while (parcel.dataPosition() < iI001i1O0Ol18) {
/* 1390 */                      int i20 = parcel.readInt();
/* 1394 */                      char c11 = (char) i20;
/* 1395 */                      if (c11 == 1) {
/* 1429 */                          iI0010I0i86 = lO0Iil10.I0010I0i(i20, parcel);
                                } else if (c11 == 2) {
/* 1424 */                          zI000lI4 = lO0Iil10.I000lI(i20, parcel);
                                } else if (c11 == 3) {
/* 1419 */                          zI000lI5 = lO0Iil10.I000lI(i20, parcel);
                                } else if (c11 == 4) {
/* 1414 */                          iI0010I0i87 = lO0Iil10.I0010I0i(i20, parcel);
                                } else if (c11 != 5) {
/* 1405 */                          lO0Iil10.I001IO000(i20, parcel);
                                } else {
/* 1409 */                          iI0010I0i88 = lO0Iil10.I0010I0i(i20, parcel);
                                }
                            }
/* 1434 */                  lO0Iil10.I000l1(iI001i1O0Ol18, parcel);
/* 1439 */                  return new Oi1oo0(iI0010I0i86, iI0010I0i87, iI0010I0i88, zI000lI4, zI000lI5);
                        case PoseLandmark.RIGHT_PINKY:
/* 1302 */                  int iI001i1O0Ol19 = lO0Iil10.I001i1O0Ol(parcel);
/* 1306 */                  float fI00100l06 = 0.0f;
/* 1307 */                  String strI000II25 = null;
/* 1312 */                  while (parcel.dataPosition() < iI001i1O0Ol19) {
/* 1314 */                      int i21 = parcel.readInt();
/* 1318 */                      char c12 = (char) i21;
/* 1319 */                      if (c12 == 1) {
/* 1346 */                          strI000II25 = lO0Iil10.I000II(i21, parcel);
                                } else if (c12 == 2) {
/* 1341 */                          fI00100l0 = lO0Iil10.I00100l0(i21, parcel);
                                } else if (c12 == 3) {
/* 1336 */                          iI0010I0i2 = lO0Iil10.I0010I0i(i21, parcel);
                                } else if (c12 != 4) {
/* 1327 */                          lO0Iil10.I001IO000(i21, parcel);
                                } else {
/* 1331 */                          fI00100l06 = lO0Iil10.I00100l0(i21, parcel);
                                }
                            }
/* 1351 */                  lO0Iil10.I000l1(iI001i1O0Ol19, parcel);
/* 1356 */                  iI1IIiI1oo1 ii1iiii1oo1 = new iI1IIiI1oo1();
/* 1359 */                  ii1iiii1oo1.I00iOIl = strI000II25;
/* 1361 */                  ii1iiii1oo1.I00iiI = fI00100l0;
/* 1363 */                  ii1iiii1oo1.I00iiO = iI0010I0i2;
/* 1365 */                  ii1iiii1oo1.I00iio = fI00100l06;
/* 1367 */                  VarHandle.storeStoreFence();
/* 1370 */                  return ii1iiii1oo1;
                        case PoseLandmark.LEFT_INDEX:
/* 1156 */                  int iI001i1O0Ol20 = lO0Iil10.I001i1O0Ol(parcel);
/* 1160 */                  long jI0010o39 = 0;
/* 1162 */                  long jI0010o40 = 0;
/* 1164 */                  long jI0010o41 = 0;
/* 1166 */                  boolean zI000lI6 = false;
/* 1168 */                  String strI000II26 = null;
/* 1170 */                  String strI000II27 = null;
/* 1172 */                  lio0llOI0 lio0lloi0 = null;
/* 1174 */                  String strI000II28 = null;
/* 1176 */                  ii0oooi0IO0l ii0oooi0io0l = null;
/* 1178 */                  ii0oooi0IO0l ii0oooi0io0l2 = null;
/* 1180 */                  ii0oooi0IO0l ii0oooi0io0l3 = null;
/* 1186 */                  while (parcel.dataPosition() < iI001i1O0Ol20) {
/* 1188 */                      int i22 = parcel.readInt();
                                switch ((char) i22) {
                                    case 2:
/* 1286 */                              strI000II26 = lO0Iil10.I000II(i22, parcel);
                                        break;
                                    case 3:
/* 1279 */                              strI000II27 = lO0Iil10.I000II(i22, parcel);
                                        break;
                                    case 4:
/* 1274 */                              lio0lloi0 = (lio0llOI0) lO0Iil10.I0001Ioi1lo(parcel, i22, lio0llOI0.CREATOR);
                                        break;
                                    case 5:
/* 1261 */                              jI0010o39 = lO0Iil10.I0010o(i22, parcel);
                                        break;
                                    case 6:
/* 1254 */                              zI000lI6 = lO0Iil10.I000lI(i22, parcel);
                                        break;
                                    case 7:
/* 1247 */                              strI000II28 = lO0Iil10.I000II(i22, parcel);
                                        break;
                                    case '\b':
/* 1242 */                              ii0oooi0io0l = (ii0oooi0IO0l) lO0Iil10.I0001Ioi1lo(parcel, i22, ii0oooi0IO0l.CREATOR);
                                        break;
                                    case '\t':
/* 1229 */                              jI0010o40 = lO0Iil10.I0010o(i22, parcel);
                                        break;
                                    case '\n':
/* 1224 */                              ii0oooi0io0l2 = (ii0oooi0IO0l) lO0Iil10.I0001Ioi1lo(parcel, i22, ii0oooi0IO0l.CREATOR);
                                        break;
                                    case 11:
/* 1211 */                              jI0010o41 = lO0Iil10.I0010o(i22, parcel);
                                        break;
                                    case '\f':
/* 1206 */                              ii0oooi0io0l3 = (ii0oooi0IO0l) lO0Iil10.I0001Ioi1lo(parcel, i22, ii0oooi0IO0l.CREATOR);
                                        break;
                                    default:
/* 1196 */                              lO0Iil10.I001IO000(i22, parcel);
                                        break;
                                }
                            }
/* 1293 */                  lO0Iil10.I000l1(iI001i1O0Ol20, parcel);
/* 1298 */                  return new iII000ol000(strI000II26, strI000II27, lio0lloi0, jI0010o39, zI000lI6, strI000II28, ii0oooi0io0l, jI0010o40, ii0oooi0io0l2, jI0010o41, ii0oooi0io0l3);
                        case PoseLandmark.RIGHT_INDEX:
/* 581 */                   int iI001i1O0Ol21 = lO0Iil10.I001i1O0Ol(parcel);
/* 585 */                   int i23 = -1;
/* 587 */                   int iI0010I0i89 = -1;
/* 589 */                   double dI000o00OoI0I9 = 0.0d;
/* 591 */                   double dI000o00OoI0I10 = 0.0d;
/* 593 */                   long jI0010o42 = 0;
/* 594 */                   long j4 = 0;
/* 595 */                   long jI0010o43 = 0;
/* 597 */                   long jI0010o44 = 0;
/* 599 */                   long jI0010o45 = 0;
/* 601 */                   long jI0010o46 = 0;
/* 603 */                   long jI0010o47 = 0;
/* 605 */                   long jI0010o48 = 0;
/* 607 */                   long jI0010o49 = 0;
/* 609 */                   long jI0010o50 = 0;
/* 611 */                   long jI0010o51 = 0;
/* 613 */                   float fI00100l07 = 0.0f;
/* 615 */                   int iI0010I0i90 = 0;
/* 616 */                   int iI0010I0i91 = 0;
/* 617 */                   int iI0010I0i92 = 0;
/* 618 */                   int iI0010I0i93 = 0;
/* 619 */                   int iI0010I0i94 = 0;
/* 620 */                   int iI0010I0i95 = 0;
/* 622 */                   int iI0010I0i96 = 0;
/* 624 */                   int iI0010I0i97 = 0;
/* 626 */                   boolean zI000lI7 = false;
/* 628 */                   int iI0010I0i98 = 0;
/* 630 */                   int iI0010I0i99 = 0;
/* 632 */                   int iI0010I0i100 = 0;
/* 634 */                   int iI0010I0i101 = 0;
/* 636 */                   int iI0010I0i102 = 0;
/* 638 */                   int iI0010I0i103 = 0;
/* 640 */                   int iI0010I0i104 = 0;
/* 642 */                   int iI0010I0i105 = 0;
/* 644 */                   int iI0010I0i106 = 0;
/* 646 */                   int iI0010I0i107 = 0;
/* 648 */                   int iI0010I0i108 = 0;
/* 650 */                   int iI0010I0i109 = 0;
/* 652 */                   byte[] bArrI00000oOI4 = null;
/* 654 */                   int[] iArrI0000oI004 = null;
/* 656 */                   long jI0010o52 = 0;
/* 658 */                   int iI0010I0i110 = 0;
/* 660 */                   int iI0010I0i111 = 0;
/* 665 */                   while (parcel.dataPosition() < iI001i1O0Ol21) {
/* 667 */                       int i24 = parcel.readInt();
/* 671 */                       long jI0010o53 = j4;
                                switch ((char) i24) {
                                    case 1:
/* 980 */                               iI0010I0i110 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 2:
/* 974 */                               iI0010I0i111 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 3:
/* 968 */                               iI0010I0i90 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 4:
/* 962 */                               iI0010I0i91 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 5:
/* 956 */                               jI0010o52 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 6:
/* 949 */                               iI0010I0i93 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 7:
/* 942 */                               iI0010I0i94 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '\b':
/* 935 */                               iI0010I0i92 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '\t':
/* 927 */                               jI0010o53 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '\n':
/* 919 */                               jI0010o51 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 11:
/* 911 */                               jI0010o50 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '\f':
/* 903 */                               jI0010o49 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '\r':
/* 895 */                               jI0010o48 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 14:
/* 887 */                               jI0010o47 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 15:
/* 879 */                               iI0010I0i109 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 16:
/* 871 */                               iI0010I0i95 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case 17:
/* 863 */                               iI0010I0i96 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_PINKY:
/* 855 */                               iI0010I0i97 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_INDEX:
/* 847 */                               zI000lI7 = lO0Iil10.I000lI(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_INDEX:
/* 839 */                               iI0010I0i98 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_THUMB:
/* 831 */                               jI0010o43 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_THUMB:
/* 823 */                               dI000o00OoI0I10 = lO0Iil10.I000o00OoI0I(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HIP:
/* 815 */                               dI000o00OoI0I9 = lO0Iil10.I000o00OoI0I(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_HIP:
/* 807 */                               iI0010I0i99 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_KNEE:
/* 800 */                               fI00100l07 = lO0Iil10.I00100l0(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_KNEE:
/* 793 */                               bArrI00000oOI4 = lO0Iil10.I00000oOI(i24, parcel);
                                        break;
                                    case 27:
/* 786 */                               iI0010I0i100 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 779 */                               iI0010I0i101 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_HEEL:
/* 772 */                               jI0010o44 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case 30:
/* 765 */                               jI0010o45 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 759 */                               iI0010I0i = lO0Iil10.I0010I0i(i24, parcel);
                                        continue;
/* 986 */                               i23 = iI0010I0i;
/* 988 */                               j4 = jI0010o53;
                                    case ' ':
/* 752 */                               iI0010I0i102 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '!':
/* 745 */                               iI0010I0i103 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '\"':
/* 738 */                               iI0010I0i104 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 731 */                               iI0010I0i105 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '$':
/* 724 */                               iI0010I0i106 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '%':
/* 717 */                               iI0010I0i89 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '&':
/* 710 */                               iI0010I0i107 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    case '\'':
/* 703 */                               jI0010o46 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case '(':
/* 698 */                               jI0010o42 = lO0Iil10.I0010o(i24, parcel);
                                        break;
                                    case ')':
/* 691 */                               iArrI0000oI004 = lO0Iil10.I0000oI00(i24, parcel);
                                        break;
                                    case '*':
/* 684 */                               iI0010I0i108 = lO0Iil10.I0010I0i(i24, parcel);
                                        break;
                                    default:
/* 677 */                               lO0Iil10.I001IO000(i24, parcel);
                                        break;
                                }
/* 680 */                       iI0010I0i = i23;
/* 986 */                       i23 = iI0010I0i;
/* 988 */                       j4 = jI0010o53;
                            }
/* 994 */                   lO0Iil10.I000l1(iI001i1O0Ol21, parcel);
/* 999 */                   iII0O0OIo iii0o0oio2 = new iII0O0OIo();
/* 1002 */                  iii0o0oio2.I00iOIl = iI0010I0i110;
/* 1004 */                  iii0o0oio2.I00iiI = jI0010o42;
/* 1006 */                  iii0o0oio2.I00iiO = iI0010I0i111;
/* 1008 */                  iii0o0oio2.I00iio = iI0010I0i90;
/* 1010 */                  iii0o0oio2.I00ilI0I1 = iI0010I0i91;
/* 1012 */                  iii0o0oio2.I00ilO0 = jI0010o52;
/* 1014 */                  iii0o0oio2.I00io1l = iI0010I0i93;
/* 1016 */                  iii0o0oio2.I00ioIO = iI0010I0i94;
/* 1018 */                  iii0o0oio2.I00l0I0l0lO1 = iI0010I0i92;
/* 1022 */                  iii0o0oio2.I00l0OO0IO = j4;
/* 1026 */                  iii0o0oio2.I00li1OI = jI0010o51;
/* 1030 */                  iii0o0oio2.I00ll1 = jI0010o50;
/* 1034 */                  iii0o0oio2.I00lli11 = jI0010o49;
/* 1038 */                  iii0o0oio2.I00lll10 = jI0010o48;
/* 1042 */                  iii0o0oio2.I00o0iI0io1 = jI0010o47;
/* 1046 */                  iii0o0oio2.I00o0l1o1o0 = iI0010I0i109;
/* 1050 */                  iii0o0oio2.I00o101lO = iI0010I0i95;
/* 1054 */                  iii0o0oio2.I00oI0i = iI0010I0i96;
/* 1058 */                  iii0o0oio2.I00oII = iI0010I0i97;
/* 1062 */                  iii0o0oio2.I00oIiI10 = zI000lI7;
/* 1066 */                  iii0o0oio2.I00oO101o = iI0010I0i98;
/* 1070 */                  iii0o0oio2.I00oOio10iI1 = jI0010o43;
/* 1074 */                  iii0o0oio2.I00ol1 = dI000o00OoI0I10;
/* 1078 */                  iii0o0oio2.I00olI = dI000o00OoI0I9;
/* 1082 */                  iii0o0oio2.I00oli = iI0010I0i99;
/* 1086 */                  iii0o0oio2.I00oliIiO01i = fI00100l07;
/* 1090 */                  iii0o0oio2.I00oo1iO0ll = bArrI00000oOI4;
/* 1094 */                  iii0o0oio2.I00ooIo0 = iI0010I0i100;
/* 1098 */                  iii0o0oio2.I00ooiO1I = iI0010I0i101;
/* 1102 */                  iii0o0oio2.I00oooO = jI0010o44;
/* 1106 */                  iii0o0oio2.I0100i = jI0010o45;
/* 1110 */                  iii0o0oio2.I0100o111I = i23;
/* 1114 */                  iii0o0oio2.I010101Oo1lO = iI0010I0i102;
/* 1118 */                  iii0o0oio2.I010I0 = iI0010I0i103;
/* 1122 */                  iii0o0oio2.I010II = iI0010I0i104;
/* 1126 */                  iii0o0oio2.I010OIo1l = iI0010I0i105;
/* 1130 */                  iii0o0oio2.I010i10l = iI0010I0i106;
/* 1134 */                  iii0o0oio2.I010iIIOlo = iI0010I0i89;
/* 1138 */                  iii0o0oio2.I010ioo = iI0010I0i107;
/* 1142 */                  iii0o0oio2.I010l10O = jI0010o46;
/* 1146 */                  iii0o0oio2.I010l1O = iArrI0000oI004;
/* 1150 */                  iii0o0oio2.I010l1ol111 = iI0010I0i108;
/* 1152 */                  VarHandle.storeStoreFence();
/* 1155 */                  return iii0o0oio2;
                        case PoseLandmark.LEFT_THUMB:
/* 511 */                   int iI001i1O0Ol22 = lO0Iil10.I001i1O0Ol(parcel);
/* 515 */                   iiOi1illIO1o iioi1illio1o = null;
/* 516 */                   ArrayList arrayListI000iOII4 = null;
/* 521 */                   while (parcel.dataPosition() < iI001i1O0Ol22) {
/* 523 */                       int i25 = parcel.readInt();
/* 527 */                       char c13 = (char) i25;
/* 528 */                       if (c13 == 1) {
/* 554 */                           arrayListI000iOII4 = lO0Iil10.I000iOII(parcel, i25, i1il0o.CREATOR);
                                } else if (c13 == 2) {
/* 549 */                           iioi1illio1o = (iiOi1illIO1o) lO0Iil10.I0001Ioi1lo(parcel, i25, iiOi1illIO1o.CREATOR);
                                } else if (c13 != 3) {
/* 534 */                           lO0Iil10.I001IO000(i25, parcel);
                                } else {
/* 538 */                           iI0010I0i2 = lO0Iil10.I0010I0i(i25, parcel);
                                }
                            }
/* 559 */                   lO0Iil10.I000l1(iI001i1O0Ol22, parcel);
/* 564 */                   iII0OII iii0oii = new iII0OII();
/* 571 */                   iii0oii.I00iOIl = lOI1lll1l10.I000o00OoI0I(arrayListI000iOII4);
/* 573 */                   iii0oii.I00iiI = iioi1illio1o;
/* 575 */                   iii0oii.I00iiO = iI0010I0i2;
/* 577 */                   VarHandle.storeStoreFence();
/* 580 */                   return iii0oii;
                        case PoseLandmark.RIGHT_THUMB:
/* 450 */                   int iI001i1O0Ol23 = lO0Iil10.I001i1O0Ol(parcel);
/* 454 */                   i1ll1I1llOl0 i1ll1i1llol02 = null;
/* 455 */                   ArrayList arrayListI000iOII5 = null;
/* 460 */                   while (parcel.dataPosition() < iI001i1O0Ol23) {
/* 462 */                       int i26 = parcel.readInt();
/* 466 */                       char c14 = (char) i26;
/* 467 */                       if (c14 == 1) {
/* 486 */                           arrayListI000iOII5 = lO0Iil10.I000iOII(parcel, i26, iIOolIO1ooI.CREATOR);
                                } else if (c14 != 2) {
/* 471 */                           lO0Iil10.I001IO000(i26, parcel);
                                } else {
/* 481 */                           i1ll1i1llol02 = (i1ll1I1llOl0) lO0Iil10.I0001Ioi1lo(parcel, i26, i1ll1I1llOl0.CREATOR);
                                }
                            }
/* 491 */                   lO0Iil10.I000l1(iI001i1O0Ol23, parcel);
/* 496 */                   iII0OO1I1 iii0oo1i1 = new iII0OO1I1();
/* 503 */                   iii0oo1i1.I00iOIl = io0OIIlOli1.I000o00OoI0I(arrayListI000iOII5);
/* 505 */                   iii0oo1i1.I00iiI = i1ll1i1llol02;
/* 507 */                   VarHandle.storeStoreFence();
/* 510 */                   return iii0oo1i1;
                        case PoseLandmark.LEFT_HIP:
/* 389 */                   int iI001i1O0Ol24 = lO0Iil10.I001i1O0Ol(parcel);
/* 393 */                   i1llOOiillll i1llooiillll2 = null;
/* 394 */                   ArrayList arrayListI000iOII6 = null;
/* 399 */                   while (parcel.dataPosition() < iI001i1O0Ol24) {
/* 401 */                       int i27 = parcel.readInt();
/* 405 */                       char c15 = (char) i27;
/* 406 */                       if (c15 == 1) {
/* 425 */                           arrayListI000iOII6 = lO0Iil10.I000iOII(parcel, i27, iIOolo1l.CREATOR);
                                } else if (c15 != 2) {
/* 410 */                           lO0Iil10.I001IO000(i27, parcel);
                                } else {
/* 420 */                           i1llooiillll2 = (i1llOOiillll) lO0Iil10.I0001Ioi1lo(parcel, i27, i1llOOiillll.CREATOR);
                                }
                            }
/* 430 */                   lO0Iil10.I000l1(iI001i1O0Ol24, parcel);
/* 435 */                   iII0lllIOl1I iii0llliol1i = new iII0lllIOl1I();
/* 442 */                   iii0llliol1i.I00iOIl = io0OO101I.I000o00OoI0I(arrayListI000iOII6);
/* 444 */                   iii0llliol1i.I00iiI = i1llooiillll2;
/* 446 */                   VarHandle.storeStoreFence();
/* 449 */                   return iii0llliol1i;
                        case PoseLandmark.RIGHT_HIP:
/* 342 */                   int iI001i1O0Ol25 = lO0Iil10.I001i1O0Ol(parcel);
/* 346 */                   boolean zI000lI8 = false;
/* 351 */                   while (parcel.dataPosition() < iI001i1O0Ol25) {
/* 353 */                       int i28 = parcel.readInt();
/* 357 */                       char c16 = (char) i28;
/* 358 */                       if (c16 == 2) {
/* 371 */                           iI0010I0i2 = lO0Iil10.I0010I0i(i28, parcel);
                                } else if (c16 != 3) {
/* 362 */                           lO0Iil10.I001IO000(i28, parcel);
                                } else {
/* 366 */                           zI000lI8 = lO0Iil10.I000lI(i28, parcel);
                                }
                            }
/* 376 */                   lO0Iil10.I000l1(iI001i1O0Ol25, parcel);
/* 381 */                   iI1oi10OOO ii1oi10ooo = new iI1oi10OOO();
/* 384 */                   ii1oi10ooo.I00iOIl = iI0010I0i2;
/* 386 */                   ii1oi10ooo.I00iiI = zI000lI8;
/* 388 */                   return ii1oi10ooo;
                        case PoseLandmark.LEFT_KNEE:
/* 298 */                   int iI001i1O0Ol26 = lO0Iil10.I001i1O0Ol(parcel);
/* 302 */                   ArrayList arrayListI000OOo1O2 = null;
/* 303 */                   ArrayList arrayListI000OOo1O3 = null;
/* 308 */                   while (parcel.dataPosition() < iI001i1O0Ol26) {
/* 310 */                       int i29 = parcel.readInt();
/* 314 */                       char c17 = (char) i29;
/* 315 */                       if (c17 == 1) {
/* 328 */                           arrayListI000OOo1O3 = lO0Iil10.I000OOo1O(i29, parcel);
                                } else if (c17 != 2) {
/* 319 */                           lO0Iil10.I001IO000(i29, parcel);
                                } else {
/* 323 */                           arrayListI000OOo1O2 = lO0Iil10.I000OOo1O(i29, parcel);
                                }
                            }
/* 333 */                   lO0Iil10.I000l1(iI001i1O0Ol26, parcel);
/* 338 */                   return new iIIoIliI0I11(arrayListI000OOo1O3, arrayListI000OOo1O2);
                        case PoseLandmark.RIGHT_KNEE:
/* 229 */                   int iI001i1O0Ol27 = lO0Iil10.I001i1O0Ol(parcel);
/* 233 */                   float fI00100l08 = 0.0f;
/* 234 */                   String strI000II29 = null;
/* 239 */                   while (parcel.dataPosition() < iI001i1O0Ol27) {
/* 241 */                       int i30 = parcel.readInt();
/* 245 */                       char c18 = (char) i30;
/* 246 */                       if (c18 == 1) {
/* 273 */                           strI000II29 = lO0Iil10.I000II(i30, parcel);
                                } else if (c18 == 2) {
/* 268 */                           fI00100l0 = lO0Iil10.I00100l0(i30, parcel);
                                } else if (c18 == 3) {
/* 263 */                           iI0010I0i2 = lO0Iil10.I0010I0i(i30, parcel);
                                } else if (c18 != 4) {
/* 254 */                           lO0Iil10.I001IO000(i30, parcel);
                                } else {
/* 258 */                           fI00100l08 = lO0Iil10.I00100l0(i30, parcel);
                                }
                            }
/* 278 */                   lO0Iil10.I000l1(iI001i1O0Ol27, parcel);
/* 283 */                   iIOoi0Ii0 iiooi0ii0 = new iIOoi0Ii0();
/* 286 */                   iiooi0ii0.I00iOIl = strI000II29;
/* 288 */                   iiooi0ii0.I00iiI = fI00100l0;
/* 290 */                   iiooi0ii0.I00iiO = iI0010I0i2;
/* 292 */                   iiooi0ii0.I00iio = fI00100l08;
/* 294 */                   VarHandle.storeStoreFence();
/* 297 */                   return iiooi0ii0;
                        case 27:
/* 160 */                   int iI001i1O0Ol28 = lO0Iil10.I001i1O0Ol(parcel);
/* 164 */                   ll0oil ll0oilVar = null;
/* 165 */                   iiOi1illIO1o iioi1illio1o2 = null;
/* 170 */                   while (parcel.dataPosition() < iI001i1O0Ol28) {
/* 172 */                       int i31 = parcel.readInt();
/* 176 */                       char c19 = (char) i31;
/* 177 */                       if (c19 == 1) {
/* 206 */                           iI0010I0i2 = lO0Iil10.I0010I0i(i31, parcel);
                                } else if (c19 == 2) {
/* 203 */                           iioi1illio1o2 = (iiOi1illIO1o) lO0Iil10.I0001Ioi1lo(parcel, i31, iiOi1illIO1o.CREATOR);
                                } else if (c19 != 3) {
/* 183 */                           lO0Iil10.I001IO000(i31, parcel);
                                } else {
/* 193 */                           ll0oilVar = (ll0oil) lO0Iil10.I0001Ioi1lo(parcel, i31, ll0oil.CREATOR);
                                }
                            }
/* 211 */                   lO0Iil10.I000l1(iI001i1O0Ol28, parcel);
/* 216 */                   iIOoiIIoi iiooiiioi = new iIOoiIIoi();
/* 219 */                   iiooiiioi.I00iOIl = iI0010I0i2;
/* 221 */                   iiooiiioi.I00iiI = iioi1illio1o2;
/* 223 */                   iiooiiioi.I00iiO = ll0oilVar;
/* 225 */                   VarHandle.storeStoreFence();
/* 228 */                   return iiooiiioi;
                        case PoseLandmark.RIGHT_ANKLE:
/* 91 */                    int iI001i1O0Ol29 = lO0Iil10.I001i1O0Ol(parcel);
/* 95 */                    int iI0010I0i112 = 0;
/* 96 */                    String strI000II30 = null;
/* 101 */                   while (parcel.dataPosition() < iI001i1O0Ol29) {
/* 103 */                       int i32 = parcel.readInt();
/* 107 */                       char c20 = (char) i32;
/* 108 */                       if (c20 == 1) {
/* 135 */                           strI000II30 = lO0Iil10.I000II(i32, parcel);
                                } else if (c20 == 2) {
/* 130 */                           iI0010I0i2 = lO0Iil10.I0010I0i(i32, parcel);
                                } else if (c20 == 3) {
/* 125 */                           iI0010I0i112 = lO0Iil10.I0010I0i(i32, parcel);
                                } else if (c20 != 4) {
/* 116 */                           lO0Iil10.I001IO000(i32, parcel);
                                } else {
/* 120 */                           fI00100l0 = lO0Iil10.I00100l0(i32, parcel);
                                }
                            }
/* 140 */                   lO0Iil10.I000l1(iI001i1O0Ol29, parcel);
/* 145 */                   iIOolIO1ooI iioolio1ooi = new iIOolIO1ooI();
/* 148 */                   iioolio1ooi.I00iOIl = strI000II30;
/* 150 */                   iioolio1ooi.I00iiI = iI0010I0i2;
/* 152 */                   iioolio1ooi.I00iiO = iI0010I0i112;
/* 154 */                   iioolio1ooi.I00iio = fI00100l0;
/* 156 */                   VarHandle.storeStoreFence();
/* 159 */                   return iioolio1ooi;
                        default:
/* 22 */                    int iI001i1O0Ol30 = lO0Iil10.I001i1O0Ol(parcel);
/* 26 */                    int iI0010I0i113 = 0;
/* 27 */                    String strI000II31 = null;
/* 32 */                    while (parcel.dataPosition() < iI001i1O0Ol30) {
/* 34 */                        int i33 = parcel.readInt();
/* 38 */                        char c21 = (char) i33;
/* 39 */                        if (c21 == 1) {
/* 66 */                            strI000II31 = lO0Iil10.I000II(i33, parcel);
                                } else if (c21 == 2) {
/* 61 */                            iI0010I0i2 = lO0Iil10.I0010I0i(i33, parcel);
                                } else if (c21 == 3) {
/* 56 */                            iI0010I0i113 = lO0Iil10.I0010I0i(i33, parcel);
                                } else if (c21 != 4) {
/* 47 */                            lO0Iil10.I001IO000(i33, parcel);
                                } else {
/* 51 */                            fI00100l0 = lO0Iil10.I00100l0(i33, parcel);
                                }
                            }
/* 71 */                    lO0Iil10.I000l1(iI001i1O0Ol30, parcel);
/* 76 */                    iIOolo1l iioolo1l = new iIOolo1l();
/* 79 */                    iioolo1l.I00iOIl = strI000II31;
/* 81 */                    iioolo1l.I00iiI = iI0010I0i2;
/* 83 */                    iioolo1l.I00iiO = iI0010I0i113;
/* 85 */                    iioolo1l.I00iio = fI00100l0;
/* 87 */                    VarHandle.storeStoreFence();
/* 90 */                    return iioolo1l;
                    }
                }

                @Override
                public final Object[] newArray(int i) {
                    switch (this.I00000oIO) {
                        case 0:
/* 93 */                    return new IOO1o0[i];
                        case 1:
/* 90 */                    return new IOlo10lO1iOl[i];
                        case 2:
/* 87 */                    return new lOi1lo[i];
                        case 3:
/* 84 */                    return new i1IO1Ol[i];
                        case 4:
/* 81 */                    return new li0l01iIOo[i];
                        case 5:
/* 78 */                    return new liiii1looii[i];
                        case 6:
/* 75 */                    return new i1il0o[i];
                        case 7:
/* 72 */                    return new ll0oilIOo0o[i];
                        case 8:
/* 69 */                    return new lli1OIoi11i[i];
                        case 9:
/* 66 */                    return new i1ll1I1llOl0[i];
                        case 10:
/* 63 */                    return new i1llOOiillll[i];
                        case 11:
/* 60 */                    return new i1oloIIl[i];
                        case 12:
/* 57 */                    return new i1oloIlo0o1o[i];
                        case 13:
/* 54 */                    return new lo00o1OOI[i];
                        case 14:
/* 51 */                    return new iI0iiII1i[i];
                        case 15:
/* 48 */                    return new iI0lIOOiil[i];
                        case 16:
/* 45 */                    return new loO1OIOlI0O1[i];
                        case 17:
/* 42 */                    return new Oi1oo0[i];
                        case PoseLandmark.RIGHT_PINKY:
/* 39 */                    return new iI1IIiI1oo1[i];
                        case PoseLandmark.LEFT_INDEX:
/* 36 */                    return new iII000ol000[i];
                        case PoseLandmark.RIGHT_INDEX:
/* 33 */                    return new iII0O0OIo[i];
                        case PoseLandmark.LEFT_THUMB:
/* 30 */                    return new iII0OII[i];
                        case PoseLandmark.RIGHT_THUMB:
/* 27 */                    return new iII0OO1I1[i];
                        case PoseLandmark.LEFT_HIP:
/* 24 */                    return new iII0lllIOl1I[i];
                        case PoseLandmark.RIGHT_HIP:
/* 21 */                    return new iI1oi10OOO[i];
                        case PoseLandmark.LEFT_KNEE:
/* 18 */                    return new iIIoIliI0I11[i];
                        case PoseLandmark.RIGHT_KNEE:
/* 15 */                    return new iIOoi0Ii0[i];
                        case 27:
/* 12 */                    return new iIOoiIIoi[i];
                        case PoseLandmark.RIGHT_ANKLE:
/* 9 */                     return new iIOolIO1ooI[i];
                        default:
/* 6 */                     return new iIOolo1l[i];
                    }
                }
            }
