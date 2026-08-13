            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.net.URL;
            import java.net.URLConnection;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class O0i1lI0o1io {
                public static final OI1Iio0ii1 I0000oI00 = OI1Iio0ii1.I000II("<built-ins module>");
                public OI0011 I00000oIO;
                public final O1I0II11i I00000oOI;
                public final O1I00llOi I0000Il00O;
                public final O1I0OloI I0000O;

                public O0i1lI0o1io(O1I0OloI o1I0OloI) {
/* 4 */             this.I0000O = o1I0OloI;
/* 9 */             O0i1ilIl1Ol o0i1ilIl1Ol = new O0i1ilIl1Ol(0);
/* 12 */            o0i1ilIl1Ol.I00iiI = this;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            o1I0OloI.I00000oIO(o0i1ilIl1Ol);
/* 22 */            int i = 1;
/* 23 */            O0i1ilIl1Ol o0i1ilIl1Ol2 = new O0i1ilIl1Ol(i);
/* 26 */            o0i1ilIl1Ol2.I00iiI = this;
/* 28 */            VarHandle.storeStoreFence();
/* 36 */            this.I00000oOI = new O1I0II11i(o1I0OloI, o0i1ilIl1Ol2);
/* 40 */            I11IIi i11IIi = new I11IIi(i);
/* 43 */            i11IIi.I00iiI = this;
/* 45 */            VarHandle.storeStoreFence();
/* 52 */            this.I0000Il00O = o1I0OloI.I00000oOI(i11IIi);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(int i) {
                    String str;
                    int i2;
/* 21 */            if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            default:
                                                switch (i) {
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case Barcode.FORMAT_EAN_8:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                        break;
                                                    default:
/* 51 */                                                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                                        break;
                                                }
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                                break;
                                        }
                                    case PoseLandmark.RIGHT_PINKY:
                                    case PoseLandmark.LEFT_INDEX:
                                    case PoseLandmark.RIGHT_INDEX:
                                    case PoseLandmark.LEFT_THUMB:
                                    case PoseLandmark.RIGHT_THUMB:
                                    case PoseLandmark.LEFT_HIP:
                                    case PoseLandmark.RIGHT_HIP:
                                    case PoseLandmark.LEFT_KNEE:
                                    case PoseLandmark.RIGHT_KNEE:
                                    case 27:
                                    case PoseLandmark.RIGHT_ANKLE:
                                    case PoseLandmark.LEFT_HEEL:
                                    case 30:
                                    case PoseLandmark.LEFT_FOOT_INDEX:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case BuildConfig.VERSION_CODE:
                                    case 46:
                                        break;
                                }
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                break;
                        }
                    } else {
/* 54 */                str = "@NotNull method %s.%s must not return null";
                    }
/* 57 */            if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            default:
                                                switch (i) {
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case Barcode.FORMAT_EAN_8:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                        break;
                                                    default:
/* 87 */                                                i2 = 3;
                                                        break;
                                                }
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                                break;
                                        }
                                    case PoseLandmark.RIGHT_PINKY:
                                    case PoseLandmark.LEFT_INDEX:
                                    case PoseLandmark.RIGHT_INDEX:
                                    case PoseLandmark.LEFT_THUMB:
                                    case PoseLandmark.RIGHT_THUMB:
                                    case PoseLandmark.LEFT_HIP:
                                    case PoseLandmark.RIGHT_HIP:
                                    case PoseLandmark.LEFT_KNEE:
                                    case PoseLandmark.RIGHT_KNEE:
                                    case 27:
                                    case PoseLandmark.RIGHT_ANKLE:
                                    case PoseLandmark.LEFT_HEEL:
                                    case 30:
                                    case PoseLandmark.LEFT_FOOT_INDEX:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case BuildConfig.VERSION_CODE:
                                    case 46:
                                        break;
                                }
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                break;
                        }
                    } else {
/* 89 */                i2 = 2;
                    }
/* 90 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
                        case 72:
/* 188 */                   objArr[0] = "module";
                            break;
                        case 2:
/* 183 */                   objArr[0] = "computation";
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 11:
                        case 13:
                        case 15:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        case PoseLandmark.RIGHT_KNEE:
                        case 27:
                        case PoseLandmark.RIGHT_ANKLE:
                        case PoseLandmark.LEFT_HEEL:
                        case 30:
                        case PoseLandmark.LEFT_FOOT_INDEX:
                        case 32:
                        case 33:
                        case 34:
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case BuildConfig.VERSION_CODE:
                        case 46:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case Barcode.FORMAT_EAN_8:
                        case 65:
                        case 66:
                        case 67:
                        case 69:
                        case 74:
                        case 81:
                        case 84:
                        case 86:
                        case 87:
/* 178 */                   objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                            break;
                        case 9:
                        case 10:
                        case 76:
                        case 77:
                        case 89:
                        case 96:
                        case 103:
                        case 107:
                        case 108:
                        case 143:
                        case 146:
                        case 147:
                        case 149:
                        case 157:
                        case 158:
                        case 159:
/* 175 */                   objArr[0] = "descriptor";
                            break;
                        case 12:
                        case 98:
                        case 100:
                        case 102:
                        case 104:
                        case 106:
                        case 135:
/* 170 */                   objArr[0] = "fqName";
                            break;
                        case 14:
/* 165 */                   objArr[0] = "simpleName";
                            break;
                        case 16:
                        case 17:
                        case 54:
                        case 88:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 97:
                        case 99:
                        case 105:
                        case 109:
                        case 110:
                        case 111:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case Barcode.FORMAT_ITF:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                        case 140:
                        case 141:
                        case 142:
                        case 144:
                        case 145:
                        case 148:
                        case 150:
                        case 151:
                        case 152:
                        case 153:
                        case 154:
                        case 155:
                        case 156:
                        case 161:
/* 160 */                   objArr[0] = "type";
                            break;
                        case 47:
/* 155 */                   objArr[0] = "classSimpleName";
                            break;
                        case 68:
                        case 70:
/* 150 */                   objArr[0] = "arrayType";
                            break;
                        case 71:
/* 145 */                   objArr[0] = "notNullArrayType";
                            break;
                        case 73:
/* 140 */                   objArr[0] = "primitiveType";
                            break;
                        case 75:
/* 135 */                   objArr[0] = "kotlinType";
                            break;
                        case 78:
                        case 82:
/* 130 */                   objArr[0] = "projectionType";
                            break;
                        case 79:
                        case 83:
                        case 85:
/* 125 */                   objArr[0] = "argument";
                            break;
                        case 80:
/* 120 */                   objArr[0] = "annotations";
                            break;
                        case 101:
/* 115 */                   objArr[0] = "typeConstructor";
                            break;
                        case 112:
/* 110 */                   objArr[0] = "classDescriptor";
                            break;
                        case 160:
/* 105 */                   objArr[0] = "declarationDescriptor";
                            break;
                        default:
/* 100 */                   objArr[0] = "storageManager";
                            break;
                    }
/* 208 */           if (i == 11) {
/* 575 */               objArr[1] = "getBuiltInsPackageScope";
                    } else if (i == 13) {
/* 570 */               objArr[1] = "getBuiltInClassByFqName";
                    } else if (i == 15) {
/* 567 */               objArr[1] = "getBuiltInClassByName";
                    } else if (i == 69) {
/* 564 */               objArr[1] = "getArrayElementType";
                    } else if (i == 74) {
/* 561 */               objArr[1] = "getPrimitiveArrayKotlinType";
                    } else if (i == 81 || i == 84) {
/* 558 */               objArr[1] = "getArrayType";
                    } else if (i == 86) {
/* 555 */               objArr[1] = "getEnumType";
                    } else if (i != 87) {
                        switch (i) {
                            case 3:
/* 547 */                       objArr[1] = "getAdditionalClassPartsProvider";
                                break;
                            case 4:
/* 542 */                       objArr[1] = "getPlatformDependentDeclarationFilter";
                                break;
                            case 5:
/* 537 */                       objArr[1] = "getClassDescriptorFactories";
                                break;
                            case 6:
/* 532 */                       objArr[1] = "getStorageManager";
                                break;
                            case 7:
/* 527 */                       objArr[1] = "getBuiltInsModule";
                                break;
                            case 8:
/* 522 */                       objArr[1] = "getBuiltInPackagesImportedByDefault";
                                break;
                            default:
                                switch (i) {
                                    case PoseLandmark.RIGHT_PINKY:
/* 517 */                               objArr[1] = "getSuspendFunction";
                                        break;
                                    case PoseLandmark.LEFT_INDEX:
/* 512 */                               objArr[1] = "getKFunction";
                                        break;
                                    case PoseLandmark.RIGHT_INDEX:
/* 507 */                               objArr[1] = "getKSuspendFunction";
                                        break;
                                    case PoseLandmark.LEFT_THUMB:
/* 502 */                               objArr[1] = "getKClass";
                                        break;
                                    case PoseLandmark.RIGHT_THUMB:
/* 497 */                               objArr[1] = "getKType";
                                        break;
                                    case PoseLandmark.LEFT_HIP:
/* 492 */                               objArr[1] = "getKCallable";
                                        break;
                                    case PoseLandmark.RIGHT_HIP:
/* 486 */                               objArr[1] = "getKProperty";
                                        break;
                                    case PoseLandmark.LEFT_KNEE:
/* 480 */                               objArr[1] = "getKProperty0";
                                        break;
                                    case PoseLandmark.RIGHT_KNEE:
/* 474 */                               objArr[1] = "getKProperty1";
                                        break;
                                    case 27:
/* 468 */                               objArr[1] = "getKProperty2";
                                        break;
                                    case PoseLandmark.RIGHT_ANKLE:
/* 462 */                               objArr[1] = "getKMutableProperty0";
                                        break;
                                    case PoseLandmark.LEFT_HEEL:
/* 456 */                               objArr[1] = "getKMutableProperty1";
                                        break;
                                    case 30:
/* 450 */                               objArr[1] = "getKMutableProperty2";
                                        break;
                                    case PoseLandmark.LEFT_FOOT_INDEX:
/* 444 */                               objArr[1] = "getIterator";
                                        break;
                                    case 32:
/* 438 */                               objArr[1] = "getIterable";
                                        break;
                                    case 33:
/* 432 */                               objArr[1] = "getMutableIterable";
                                        break;
                                    case 34:
/* 426 */                               objArr[1] = "getMutableIterator";
                                        break;
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
/* 420 */                               objArr[1] = "getCollection";
                                        break;
                                    case 36:
/* 414 */                               objArr[1] = "getMutableCollection";
                                        break;
                                    case 37:
/* 408 */                               objArr[1] = "getList";
                                        break;
                                    case 38:
/* 402 */                               objArr[1] = "getMutableList";
                                        break;
                                    case 39:
/* 396 */                               objArr[1] = "getSet";
                                        break;
                                    case 40:
/* 390 */                               objArr[1] = "getMutableSet";
                                        break;
                                    case 41:
/* 384 */                               objArr[1] = "getMap";
                                        break;
                                    case 42:
/* 378 */                               objArr[1] = "getMutableMap";
                                        break;
                                    case 43:
/* 372 */                               objArr[1] = "getMapEntry";
                                        break;
                                    case 44:
/* 366 */                               objArr[1] = "getMutableMapEntry";
                                        break;
                                    case BuildConfig.VERSION_CODE:
/* 360 */                               objArr[1] = "getListIterator";
                                        break;
                                    case 46:
/* 354 */                               objArr[1] = "getMutableListIterator";
                                        break;
                                    default:
                                        switch (i) {
                                            case 48:
/* 348 */                                       objArr[1] = "getBuiltInTypeByClassName";
                                                break;
                                            case 49:
/* 344 */                                       objArr[1] = "getNothingType";
                                                break;
                                            case 50:
/* 338 */                                       objArr[1] = "getNullableNothingType";
                                                break;
                                            case 51:
/* 332 */                                       objArr[1] = "getAnyType";
                                                break;
                                            case 52:
/* 326 */                                       objArr[1] = "getNullableAnyType";
                                                break;
                                            case 53:
/* 320 */                                       objArr[1] = "getDefaultBound";
                                                break;
                                            default:
                                                switch (i) {
                                                    case 55:
/* 314 */                                               objArr[1] = "getPrimitiveKotlinType";
                                                        break;
                                                    case 56:
/* 310 */                                               objArr[1] = "getNumberType";
                                                        break;
                                                    case 57:
/* 304 */                                               objArr[1] = "getByteType";
                                                        break;
                                                    case 58:
/* 298 */                                               objArr[1] = "getShortType";
                                                        break;
                                                    case 59:
/* 292 */                                               objArr[1] = "getIntType";
                                                        break;
                                                    case 60:
/* 286 */                                               objArr[1] = "getLongType";
                                                        break;
                                                    case 61:
/* 280 */                                               objArr[1] = "getFloatType";
                                                        break;
                                                    case 62:
/* 274 */                                               objArr[1] = "getDoubleType";
                                                        break;
                                                    case 63:
/* 268 */                                               objArr[1] = "getCharType";
                                                        break;
                                                    case Barcode.FORMAT_EAN_8:
/* 262 */                                               objArr[1] = "getBooleanType";
                                                        break;
                                                    case 65:
/* 256 */                                               objArr[1] = "getUnitType";
                                                        break;
                                                    case 66:
/* 250 */                                               objArr[1] = "getStringType";
                                                        break;
                                                    case 67:
/* 244 */                                               objArr[1] = "getIterableType";
                                                        break;
                                                    default:
/* 238 */                                               objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
/* 552 */               objArr[1] = "getAnnotationType";
                    }
                    switch (i) {
                        case 1:
/* 1026 */                  objArr[2] = "setBuiltInsModule";
                            break;
                        case 2:
/* 1021 */                  objArr[2] = "setPostponedBuiltinsModuleComputation";
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 11:
                        case 13:
                        case 15:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        case PoseLandmark.RIGHT_KNEE:
                        case 27:
                        case PoseLandmark.RIGHT_ANKLE:
                        case PoseLandmark.LEFT_HEEL:
                        case 30:
                        case PoseLandmark.LEFT_FOOT_INDEX:
                        case 32:
                        case 33:
                        case 34:
                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case BuildConfig.VERSION_CODE:
                        case 46:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case Barcode.FORMAT_EAN_8:
                        case 65:
                        case 66:
                        case 67:
                        case 69:
                        case 74:
                        case 81:
                        case 84:
                        case 86:
                        case 87:
                            break;
                        case 9:
/* 1016 */                  objArr[2] = "isBuiltIn";
                            break;
                        case 10:
/* 1011 */                  objArr[2] = "isUnderKotlinPackage";
                            break;
                        case 12:
/* 1006 */                  objArr[2] = "getBuiltInClassByFqName";
                            break;
                        case 14:
/* 1003 */                  objArr[2] = "getBuiltInClassByName";
                            break;
                        case 16:
/* 1000 */                  objArr[2] = "getPrimitiveClassDescriptor";
                            break;
                        case 17:
/* 995 */                   objArr[2] = "getPrimitiveArrayClassDescriptor";
                            break;
                        case 47:
/* 990 */                   objArr[2] = "getBuiltInTypeByClassName";
                            break;
                        case 54:
/* 987 */                   objArr[2] = "getPrimitiveKotlinType";
                            break;
                        case 68:
/* 984 */                   objArr[2] = "getArrayElementType";
                            break;
                        case 70:
/* 981 */                   objArr[2] = "getArrayElementTypeOrNull";
                            break;
                        case 71:
                        case 72:
/* 976 */                   objArr[2] = "getElementTypeForUnsignedArray";
                            break;
                        case 73:
/* 971 */                   objArr[2] = "getPrimitiveArrayKotlinType";
                            break;
                        case 75:
/* 968 */                   objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                            break;
                        case 76:
                        case 93:
/* 963 */                   objArr[2] = "getPrimitiveType";
                            break;
                        case 77:
/* 958 */                   objArr[2] = "getPrimitiveArrayType";
                            break;
                        case 78:
                        case 79:
                        case 80:
                        case 82:
                        case 83:
/* 953 */                   objArr[2] = "getArrayType";
                            break;
                        case 85:
/* 950 */                   objArr[2] = "getEnumType";
                            break;
                        case 88:
/* 947 */                   objArr[2] = "isArray";
                            break;
                        case 89:
                        case 90:
/* 942 */                   objArr[2] = "isArrayOrPrimitiveArray";
                            break;
                        case 91:
/* 936 */                   objArr[2] = "isPrimitiveArray";
                            break;
                        case 92:
/* 930 */                   objArr[2] = "getPrimitiveArrayElementType";
                            break;
                        case 94:
/* 924 */                   objArr[2] = "isPrimitiveType";
                            break;
                        case 95:
/* 918 */                   objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                            break;
                        case 96:
/* 912 */                   objArr[2] = "isPrimitiveClass";
                            break;
                        case 97:
                        case 98:
                        case 99:
                        case 100:
/* 906 */                   objArr[2] = "isConstructedFromGivenClass";
                            break;
                        case 101:
                        case 102:
/* 900 */                   objArr[2] = "isTypeConstructorForGivenClass";
                            break;
                        case 103:
                        case 104:
/* 894 */                   objArr[2] = "classFqNameEquals";
                            break;
                        case 105:
                        case 106:
/* 888 */                   objArr[2] = "isNotNullConstructedFromGivenClass";
                            break;
                        case 107:
/* 882 */                   objArr[2] = "isSpecialClassWithNoSupertypes";
                            break;
                        case 108:
                        case 109:
/* 876 */                   objArr[2] = "isAny";
                            break;
                        case 110:
                        case 112:
/* 870 */                   objArr[2] = "isBoolean";
                            break;
                        case 111:
/* 864 */                   objArr[2] = "isBooleanOrNullableBoolean";
                            break;
                        case 113:
/* 858 */                   objArr[2] = "isNumber";
                            break;
                        case 114:
/* 852 */                   objArr[2] = "isChar";
                            break;
                        case 115:
/* 846 */                   objArr[2] = "isCharOrNullableChar";
                            break;
                        case 116:
/* 840 */                   objArr[2] = "isInt";
                            break;
                        case 117:
/* 834 */                   objArr[2] = "isByte";
                            break;
                        case 118:
/* 828 */                   objArr[2] = "isLong";
                            break;
                        case 119:
/* 822 */                   objArr[2] = "isLongOrNullableLong";
                            break;
                        case 120:
/* 816 */                   objArr[2] = "isShort";
                            break;
                        case 121:
/* 810 */                   objArr[2] = "isFloat";
                            break;
                        case 122:
/* 804 */                   objArr[2] = "isFloatOrNullableFloat";
                            break;
                        case 123:
/* 798 */                   objArr[2] = "isDouble";
                            break;
                        case 124:
/* 792 */                   objArr[2] = "isUByte";
                            break;
                        case 125:
/* 786 */                   objArr[2] = "isUShort";
                            break;
                        case 126:
/* 780 */                   objArr[2] = "isUInt";
                            break;
                        case 127:
/* 774 */                   objArr[2] = "isULong";
                            break;
                        case Barcode.FORMAT_ITF:
/* 768 */                   objArr[2] = "isUByteArray";
                            break;
                        case 129:
/* 762 */                   objArr[2] = "isUShortArray";
                            break;
                        case 130:
/* 756 */                   objArr[2] = "isUIntArray";
                            break;
                        case 131:
/* 750 */                   objArr[2] = "isULongArray";
                            break;
                        case 132:
/* 744 */                   objArr[2] = "isUnsignedArrayType";
                            break;
                        case 133:
/* 738 */                   objArr[2] = "isDoubleOrNullableDouble";
                            break;
                        case 134:
                        case 135:
/* 732 */                   objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                            break;
                        case 136:
/* 726 */                   objArr[2] = "isNothing";
                            break;
                        case 137:
/* 720 */                   objArr[2] = "isNullableNothing";
                            break;
                        case 138:
/* 714 */                   objArr[2] = "isNothingOrNullableNothing";
                            break;
                        case 139:
/* 708 */                   objArr[2] = "isAnyOrNullableAny";
                            break;
                        case 140:
/* 702 */                   objArr[2] = "isNullableAny";
                            break;
                        case 141:
/* 696 */                   objArr[2] = "isDefaultBound";
                            break;
                        case 142:
/* 690 */                   objArr[2] = "isUnit";
                            break;
                        case 143:
/* 684 */                   objArr[2] = "mayReturnNonUnitValue";
                            break;
                        case 144:
/* 678 */                   objArr[2] = "isUnitOrNullableUnit";
                            break;
                        case 145:
/* 672 */                   objArr[2] = "isBooleanOrSubtype";
                            break;
                        case 146:
/* 666 */                   objArr[2] = "isMemberOfAny";
                            break;
                        case 147:
                        case 148:
/* 660 */                   objArr[2] = "isEnum";
                            break;
                        case 149:
                        case 150:
/* 654 */                   objArr[2] = "isComparable";
                            break;
                        case 151:
/* 648 */                   objArr[2] = "isCollectionOrNullableCollection";
                            break;
                        case 152:
/* 642 */                   objArr[2] = "isListOrNullableList";
                            break;
                        case 153:
/* 636 */                   objArr[2] = "isSetOrNullableSet";
                            break;
                        case 154:
/* 630 */                   objArr[2] = "isMapOrNullableMap";
                            break;
                        case 155:
/* 624 */                   objArr[2] = "isIterableOrNullableIterable";
                            break;
                        case 156:
/* 618 */                   objArr[2] = "isThrowableOrNullableThrowable";
                            break;
                        case 157:
/* 612 */                   objArr[2] = "isThrowable";
                            break;
                        case 158:
/* 606 */                   objArr[2] = "isKClass";
                            break;
                        case 159:
/* 600 */                   objArr[2] = "isNonPrimitiveArray";
                            break;
                        case 160:
/* 594 */                   objArr[2] = "isDeprecated";
                            break;
                        case 161:
/* 588 */                   objArr[2] = "isNotNullOrNullableFunctionSupertype";
                            break;
                        default:
/* 582 */                   objArr[2] = "<init>";
                            break;
                    }
/* 1028 */          String str2 = String.format(str, objArr);
/* 1032 */          if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
                        switch (i) {
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                break;
                            default:
                                switch (i) {
                                    case PoseLandmark.RIGHT_PINKY:
                                    case PoseLandmark.LEFT_INDEX:
                                    case PoseLandmark.RIGHT_INDEX:
                                    case PoseLandmark.LEFT_THUMB:
                                    case PoseLandmark.RIGHT_THUMB:
                                    case PoseLandmark.LEFT_HIP:
                                    case PoseLandmark.RIGHT_HIP:
                                    case PoseLandmark.LEFT_KNEE:
                                    case PoseLandmark.RIGHT_KNEE:
                                    case 27:
                                    case PoseLandmark.RIGHT_ANKLE:
                                    case PoseLandmark.LEFT_HEEL:
                                    case 30:
                                    case PoseLandmark.LEFT_FOOT_INDEX:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case BuildConfig.VERSION_CODE:
                                    case 46:
                                        break;
                                    default:
                                        switch (i) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case Barcode.FORMAT_EAN_8:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                        break;
                                                    default:
/* 1073 */                                              throw new IllegalArgumentException(str2);
                                                }
                                        }
                                }
                        }
                    }
/* 1073 */          throw new IllegalStateException(str2);
                }

                public static boolean I00000oOI(OI000ilOol oI000ilOol, Ill0OI0lo ill0OI0lo) {
/* 2 */             if (oI000ilOol == null) {
/* 42 */                I00000oIO(103);
/* 89 */                throw null;
                    }
/* 4 */             if (ill0OI0lo != null) {
                        return oI000ilOol.getName().equals(ill0OI0lo.I000II()) && ill0OI0lo.equals(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol));
                    }
/* 36 */            I00000oIO(104);
/* 39 */            throw null;
                }

                public static OOIil01OI I0010I0i(IOIiO1lIl0l iOIiO1lIl0l) {
/* 11 */            if (OlIllOO11lOl.I00i01iIIliI.contains(iOIiO1lIl0l.getName())) {
/* 23 */                return (OOIil01OI) OlIllOO11lOl.I00i0ilIl0i.get(IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0l));
                    }
/* 26 */            return null;
                }

                public static OOIil01OI I00111O(OI000ilOol oI000ilOol) {
/* 11 */            if (OlIllOO11lOl.I00OloOo.contains(oI000ilOol.getName())) {
/* 23 */                return (OOIil01OI) OlIllOO11lOl.I00i0O.get(IiOiIO0i1Oil.I0001Ioi1lo(oI000ilOol));
                    }
/* 26 */            return null;
                }

                public static boolean I001i1lo1io(O0iIl1 o0iIl1) {
/* 1 */             if (o0iIl1 != null) {
/* 5 */                 return I001lIiIIo1O(o0iIl1, OlIllOO11lOl.I00000oIO);
                    }
/* 12 */            I00000oIO(139);
/* 49 */            throw null;
                }

                public static boolean I001iOo1i0O(O0iIl1 o0iIl1) {
/* 1 */             if (o0iIl1 != null) {
/* 5 */                 return I001lIiIIo1O(o0iIl1, OlIllOO11lOl.I000II);
                    }
/* 12 */            I00000oIO(88);
/* 49 */            throw null;
                }

                public static boolean I001l0I00(Ii1Ool1 ii1Ool1) {
/* 1 */             if (ii1Ool1 != null) {
                        return IiOiIO0i1Oil.I000O01llI0(ii1Ool1, IIIOiol.class, false) != null;
                    }
/* 17 */            I00000oIO(9);
/* 49 */            throw null;
                }

                public static boolean I001lIiIIo1O(O0iIl1 o0iIl1, Ill0OI0lo ill0OI0lo) {
/* 2 */             if (o0iIl1 == null) {
/* 23 */                I00000oIO(97);
/* 89 */                throw null;
                    }
/* 4 */             if (ill0OI0lo != null) {
/* 10 */                return I00IOO(o0iIl1.I00iOIl(), ill0OI0lo);
                    }
/* 17 */            I00000oIO(98);
/* 20 */            throw null;
                }

                public static boolean I001lllioOl(O0iIl1 o0iIl1, Ill0OI0lo ill0OI0lo) {
/* 1 */             if (ill0OI0lo != null) {
                        return I001lIiIIo1O(o0iIl1, ill0OI0lo) && !o0iIl1.I00iiI();
                    }
/* 21 */            I00000oIO(135);
/* 89 */            throw null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static boolean I001lloI(Ii1i0IO0 ii1i0IO0) {
/* 15 */            if (ii1i0IO0.I010i10l().getAnnotations().I001l0I00(OlIllOO11lOl.I000lI)) {
/* 54 */                return true;
                    }
/* 20 */            if (!(ii1i0IO0 instanceof OOOO01l)) {
/* 56 */                return false;
                    }
/* 22 */            OOOO01l oOOO01l = (OOOO01l) ii1i0IO0;
/* 24 */            boolean zI00OIo = oOOO01l.I00OIo();
/* 28 */            OOOOI1ioIo oOOOI1ioIoI00000oOI = oOOO01l.I00000oOI();
/* 32 */            OOOOOO0O oooooo0oI0000Il00O = oOOO01l.I0000Il00O();
/* 36 */            if (oOOOI1ioIoI00000oOI == null || !I001lloI(oOOOI1ioIoI00000oOI)) {
/* 56 */                return false;
                    }
/* 44 */            if (zI00OIo) {
                        return oooooo0oI0000Il00O != null && I001lloI(oooooo0oI0000Il00O);
                    }
/* 54 */            return true;
                }

                public static boolean I00II0Ol1O0l(O0iIl1 o0iIl1, Ill0OI0lo ill0OI0lo) {
/* 2 */             if (o0iIl1 == null) {
/* 30 */                I00000oIO(105);
/* 89 */                throw null;
                    }
/* 4 */             if (ill0OI0lo != null) {
                        return !o0iIl1.I00iiI() && I001lIiIIo1O(o0iIl1, ill0OI0lo);
                    }
/* 24 */            I00000oIO(106);
/* 27 */            throw null;
                }

                public static boolean I00II0oii1o(O0iIl1 o0iIl1) {
/* 1 */             if (o0iIl1 != null) {
                        return I001lIiIIo1O(o0iIl1, OlIllOO11lOl.I00000oOI) && !OoOilo0Oliii.I0000oI00(o0iIl1);
                    }
/* 23 */            I00000oIO(136);
/* 49 */            throw null;
                }

                public static boolean I00IO1(O0iIl1 o0iIl1) {
/* 5 */             if (o0iIl1.I00iiI()) {
/* 29 */                return false;
                    }
/* 11 */            IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
                    return (iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol) && I00111O((OI000ilOol) iOIiO1lIl0lI00100o1O0lo) != null;
                }

                public static boolean I00IO1oi11O(O0iIl1 o0iIl1) {
                    return I00II0Ol1O0l(o0iIl1, OlIllOO11lOl.I0001Ioi1lo);
                }

                public static boolean I00IOO(OoOIOoO1I ooOIOoO1I, Ill0OI0lo ill0OI0lo) {
/* 2 */             if (ooOIOoO1I == null) {
/* 34 */                I00000oIO(101);
/* 89 */                throw null;
                    }
/* 4 */             if (ill0OI0lo != null) {
/* 6 */                 IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ooOIOoO1I.I00100o1O0lo();
                        return (iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol) && I00000oOI((OI000ilOol) iOIiO1lIl0lI00100o1O0lo, ill0OI0lo);
                    }
/* 28 */            I00000oIO(102);
/* 31 */            throw null;
                }

                public static boolean I00IioO0OiOi(Ii1Ool1 ii1Ool1) {
/* 1 */             while (ii1Ool1 != null) {
/* 5 */                 if (ii1Ool1 instanceof OIo0il) {
/* 11 */                    Ill0IO ill0IO = ((OIo0l0) ((OIo0il) ii1Ool1)).I00ilI0I1;
/* 17 */                    return ill0IO.I00000oIO.I000O01llI0(OlIlllOI1.I000iOII);
                        }
/* 22 */                ii1Ool1 = ii1Ool1.I000lI();
                    }
/* 27 */            return false;
                }

                public final void I0000Il00O() throws IOException {
                    InputStream inputStream;
/* 7 */             OI1Iio0ii1 oI1Iio0ii1 = I0000oI00;
/* 9 */             O1I0OloI o1I0OloI = this.I0000O;
/* 11 */            OI0011 oi0011 = new OI0011(oI1Iio0ii1, o1I0OloI, this, 48);
/* 14 */            this.I00000oIO = oi0011;
/* 18 */            IIIOiO.I00000oIO.getClass();
/* 27 */            IIIOiO iIIOiO = (IIIOiO) IIIOOOO1lo.I00000oOI.getValue();
/* 29 */            OI0011 oi00112 = this.I00000oIO;
/* 31 */            Iterable iterableI000lI = I000lI();
/* 35 */            OO1I1O0ooilo oO1I1O0ooiloI00100l0 = I00100l0();
/* 39 */            I0OI00O i0oi00oI0000O = I0000O();
/* 45 */            ((IIIOiilO0) iIIOiO).getClass();
/* 48 */            Set<Ill0IO> set = OlIlllOI1.I0010I0i;
/* 54 */            ArrayList arrayList = new ArrayList();
/* 65 */            for (Ill0IO ill0IO : set) {
/* 75 */                IIIOIlo1oo0.I000lI.getClass();
/* 78 */                String strI00000oIO = IIIOIlo1oo0.I00000oIO(ill0IO);
/* 84 */                ClassLoader classLoader = IIIOlol.class.getClassLoader();
/* 89 */                if (classLoader == null) {
/* 91 */                    inputStream = ClassLoader.getSystemResourceAsStream(strI00000oIO);
                        } else {
/* 96 */                    URL resource = classLoader.getResource(strI00000oIO);
/* 100 */                   if (resource == null) {
/* 102 */                       inputStream = null;
                            } else {
/* 104 */                       URLConnection uRLConnectionOpenConnection = resource.openConnection();
/* 109 */                       uRLConnectionOpenConnection.setUseCaches(false);
/* 112 */                       inputStream = uRLConnectionOpenConnection.getInputStream();
                            }
                        }
/* 118 */               IIIOiol iIIOiolI00000oIO = inputStream != null ? iOi1iIoO.I00000oIO(ill0IO, oi00112, inputStream) : null;
/* 122 */               if (iIIOiolI00000oIO != null) {
/* 124 */                   arrayList.add(iIIOiolI00000oIO);
                        }
                    }
/* 130 */           OIo0liIiiOlI oIo0liIiiOlI = new OIo0liIiiOlI();
/* 133 */           oIo0liIiiOlI.I00000oIO = arrayList;
/* 135 */           VarHandle.storeStoreFence();
/* 140 */           o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0(o1I0OloI, oi00112);
/* 149 */           IIloOI iIloOI = new IIloOI(oIo0liIiiOlI, 12);
/* 154 */           IIIOIlo1oo0 iIIOIlo1oo0 = IIIOIlo1oo0.I000lI;
/* 156 */           I1I0i0Ilo1Oi i1I0i0Ilo1Oi = new I1I0i0Ilo1Oi(oi00112, o01l1iooo0, iIIOIlo1oo0);
/* 159 */           Il1lll0iI il1lll0iI = iIIOIlo1oo0.I00000oIO;
/* 161 */           String str = O1I0OloI.I0000O;
/* 173 */           new ConcurrentHashMap(3, 1.0f, 2);
/* 181 */           Ii10lIo0l1 ii10lIo0l1 = new Ii10lIo0l1(o1I0OloI, oi00112, iIloOI, i1I0i0Ilo1Oi, oIo0liIiiOlI, iterableI000lI, o01l1iooo0, i0oi00oI0000O, oO1I1O0ooiloI00100l0, il1lll0iI, null, 851968);
/* 184 */           Iterator it = arrayList.iterator();
/* 192 */           while (it.hasNext()) {
/* 200 */               ((IIIOiol) it.next()).I010ioo(ii10lIo0l1);
                    }
/* 204 */           oi0011.I00ioIO = oIo0liIiiOlI;
/* 206 */           OI0011 oi00113 = this.I00000oIO;
/* 212 */           oi00113.getClass();
/* 215 */           List listI00IioO0OiOi = I1IoiO1l.I00IioO0OiOi(new OI0011[]{oi00113});
/* 223 */           O1OIll00i o1OIll00i = new O1OIll00i(18);
/* 226 */           o1OIll00i.I00iiI = listI00IioO0OiOi;
/* 228 */           VarHandle.storeStoreFence();
/* 231 */           oi00113.I00io1l = o1OIll00i;
                }

                public I0OI00O I0000O() {
/* 1 */             return Iioi0lilII.I00iiI;
                }

                public final Ol0O0iI0l0O I0000oI00() {
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0OI00Ol10 = I000iOII("Any").I00Ol10();
/* 11 */            if (ol0O0iI0l0OI00Ol10 != null) {
/* 13 */                return ol0O0iI0l0OI00Ol10;
                    }
/* 16 */            I00000oIO(51);
/* 29 */            throw null;
                }

                public final O0iIl1 I0001Ioi1lo(O0iIl1 o0iIl1) {
/* 2 */             if (o0iIl1 == null) {
/* 19 */                I00000oIO(68);
/* 49 */                throw null;
                    }
/* 4 */             O0iIl1 o0iIl1I000II = I000II(o0iIl1);
/* 8 */             if (o0iIl1I000II != null) {
/* 10 */                return o0iIl1I000II;
                    }
/* 13 */            IoOOl0iOl1io.I000OOo1O("not array: ", o0iIl1);
/* 1 */             return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x008b A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O0iIl1 I000II(O0iIl1 o0iIl1) {
                    IOIOill iOIOillI0001Ioi1lo;
                    IOIOill iOIOill;
                    OI000ilOol oI000ilOolI00000oIO;
                    Ol0O0iI0l0O ol0O0iI0l0OI00Ol10;
/* 2 */             if (o0iIl1 == null) {
/* 144 */               I00000oIO(70);
/* 186 */               throw null;
                    }
/* 9 */             if (!I001iOo1i0O(o0iIl1)) {
/* 39 */                Ooioo0o1l0 ooioo0o1l0I000O01llI0 = OoOilo0Oliii.I000O01llI0(o0iIl1, false);
/* 57 */                O0iIl1 o0iIl12 = (O0iIl1) ((O0i1lI) this.I00000oOI.invoke()).I00000oOI.get(ooioo0o1l0I000O01llI0);
/* 59 */                if (o0iIl12 != null) {
/* 61 */                    return o0iIl12;
                        }
/* 62 */                int i = IiOiIO0i1Oil.I00000oIO;
/* 68 */                IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ooioo0o1l0I000O01llI0.I00iOIl().I00100o1O0lo();
/* 76 */                OI0010oo1o oI0010oo1oI0000O = iOIiO1lIl0lI00100o1O0lo == null ? null : IiOiIO0i1Oil.I0000O(iOIiO1lIl0lI00100o1O0lo);
/* 80 */                if (oI0010oo1oI0000O != null) {
/* 86 */                    IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = ooioo0o1l0I000O01llI0.I00iOIl().I00100o1O0lo();
/* 90 */                    if (iOIiO1lIl0lI00100o1O0lo2 == null) {
/* 92 */                        ol0O0iI0l0OI00Ol10 = null;
/* 138 */                       if (ol0O0iI0l0OI00Ol10 == null) {
/* 140 */                           return ol0O0iI0l0OI00Ol10;
                                }
                            } else {
/* 94 */                        Set set = OoillIolOoll.I00000oIO;
/* 106 */                       if (OoillIolOoll.I0000O.contains(iOIiO1lIl0lI00100o1O0lo2.getName()) && (iOIOillI0001Ioi1lo = IiOiOOIo.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo2)) != null && (iOIOill = (IOIOill) OoillIolOoll.I00000oOI.get(iOIOillI0001Ioi1lo)) != null && (oI000ilOolI00000oIO = ilOOOOloO.I00000oIO(oI0010oo1oI0000O, iOIOill)) != null) {
/* 134 */                           ol0O0iI0l0OI00Ol10 = oI000ilOolI00000oIO.I00Ol10();
                                }
/* 138 */                       if (ol0O0iI0l0OI00Ol10 == null) {
                                }
                            }
                        }
                    } else if (o0iIl1.I00OIl().size() == 1) {
/* 34 */                return ((OoOi1Ol) o0iIl1.I00OIl().get(0)).I00000oOI();
                    }
/* 1 */             return null;
                }

                public final Ol0O0iI0l0O I000O01llI0(O0iIl1 o0iIl1) {
/* 1 */             Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
/* 3 */             if (o0iIl1 != null) {
/* 7 */                 return I000OOo1O(ooo0Ioii0o0, o0iIl1, i1i0olI.I00iiO);
                    }
/* 14 */            I00000oIO(83);
/* 49 */            throw null;
                }

                public final Ol0O0iI0l0O I000OOo1O(Ooo0Ioii0o0 ooo0Ioii0o0, O0iIl1 o0iIl1, I11IlOOO i11IlOOO) {
/* 1 */             if (o0iIl1 != null) {
/* 22 */                return l0loOIIo0iOo.I00000oOI(lOoOoloI01i0.I00000oOI(i11IlOOO), I000iOII("Array"), Collections.singletonList(new OlIo1I(o0iIl1, ooo0Ioii0o0)));
                    }
/* 29 */            I00000oIO(79);
/* 215 */           throw null;
                }

                public final OI000ilOol I000OiO(Ill0IO ill0IO) {
/* 2 */             if (ill0IO == null) {
/* 25 */                I00000oIO(12);
/* 49 */                throw null;
                    }
/* 4 */             OI0011 oi0011I000l1 = I000l1();
/* 8 */             OIIl0iOOlo oIIl0iOOlo = OIIl0iOOlo.I00iOIl;
/* 10 */            OI000ilOol oI000ilOolI00000oOI = il110i0l.I00000oOI(oi0011I000l1, ill0IO);
/* 14 */            if (oI000ilOolI00000oOI != null) {
/* 16 */                return oI000ilOolI00000oOI;
                    }
/* 19 */            I00000oIO(13);
/* 22 */            throw null;
                }

                public final OI000ilOol I000iOII(String str) {
/* 1 */             if (str != null) {
/* 13 */                return (OI000ilOol) this.I0000Il00O.invoke(OI1Iio0ii1.I0000oI00(str));
                    }
/* 18 */            I00000oIO(14);
/* 49 */            throw null;
                }

                public final OI0011 I000l1() {
/* 3 */             this.I00000oIO.getClass();
/* 6 */             OI0011 oi0011 = this.I00000oIO;
/* 8 */             if (oi0011 != null) {
/* 10 */                return oi0011;
                    }
/* 12 */            I00000oIO(7);
/* 29 */            throw null;
                }

                public Iterable I000lI() {
/* 12 */            List listSingletonList = Collections.singletonList(new IIIOIiIlI(this.I0000O, I000l1()));
/* 16 */            if (listSingletonList != null) {
/* 18 */                return listSingletonList;
                    }
/* 20 */            I00000oIO(5);
/* 29 */            throw null;
                }

                public final Ol0O0iI0l0O I000o00OoI0I() {
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0OI00Ol10 = I000iOII("Nothing").I00Ol10();
/* 11 */            if (ol0O0iI0l0OI00Ol10 != null) {
/* 13 */                return ol0O0iI0l0OI00Ol10;
                    }
/* 16 */            I00000oIO(49);
/* 29 */            throw null;
                }

                public final Ol0O0iI0l0O I000oI1ioi() {
/* 6 */             Ol0O0iI0l0O ol0O0iI0l0OI00lll10 = I0000oI00().I00li1OI(true);
/* 10 */            if (ol0O0iI0l0OI00lll10 != null) {
/* 12 */                return ol0O0iI0l0OI00lll10;
                    }
/* 15 */            I00000oIO(52);
/* 29 */            throw null;
                }

                public OO1I1O0ooilo I00100l0() {
/* 1 */             return lolIo0.I00io1l;
                }

                public final Ol0O0iI0l0O I00100o1O0lo(OOIil01OI oOIil01OI) {
/* 2 */             if (oOIil01OI == null) {
/* 31 */                I00000oIO(73);
/* 49 */                throw null;
                    }
/* 18 */            Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) ((O0i1lI) this.I00000oOI.invoke()).I00000oIO.get(oOIil01OI);
/* 20 */            if (ol0O0iI0l0O != null) {
/* 22 */                return ol0O0iI0l0O;
                    }
/* 25 */            I00000oIO(74);
/* 28 */            throw null;
                }

                public final Ol0O0iI0l0O I0010o(OOIil01OI oOIil01OI) {
/* 2 */             if (oOIil01OI == null) {
/* 29 */                I00000oIO(54);
/* 49 */                throw null;
                    }
/* 14 */            Ol0O0iI0l0O ol0O0iI0l0OI00Ol10 = I000iOII(oOIil01OI.I00iOIl.I00000oOI()).I00Ol10();
/* 18 */            if (ol0O0iI0l0OI00Ol10 != null) {
/* 20 */                return ol0O0iI0l0OI00Ol10;
                    }
/* 23 */            I00000oIO(55);
/* 26 */            throw null;
                }

                public final Ol0O0iI0l0O I001IIilI0O() {
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0OI00Ol10 = I000iOII("String").I00Ol10();
/* 11 */            if (ol0O0iI0l0OI00Ol10 != null) {
/* 13 */                return ol0O0iI0l0OI00Ol10;
                    }
/* 16 */            I00000oIO(66);
/* 29 */            throw null;
                }

                public final OI000ilOol I001IO000(int i) {
/* 27 */            return I000OiO(OlIlllOI1.I0001Ioi1lo.I00000oIO(OI1Iio0ii1.I0000oI00(Illo0liIIii.I0000Il00O.I00000oOI + i)));
                }

                public final Ol0O0iI0l0O I001i1O0Ol() {
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0OI00Ol10 = I000iOII("Unit").I00Ol10();
/* 11 */            if (ol0O0iI0l0OI00Ol10 != null) {
/* 13 */                return ol0O0iI0l0OI00Ol10;
                    }
/* 16 */            I00000oIO(65);
/* 29 */            throw null;
                }
            }
