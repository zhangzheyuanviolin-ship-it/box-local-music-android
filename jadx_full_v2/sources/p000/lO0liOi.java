            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            
            public abstract class lO0liOi {
                /* JADX WARN: Failed to find 'out' block for switch in B:35:0x004c. Please report as an issue. */
                /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0052. Please report as an issue. */
                public static int I00000oIO(int i, CharSequence charSequence) {
/* 1 */             boolean z = false;
/* 3 */             int i2 = 0;
/* 4 */             int i3 = 0;
/* 5 */             int i4 = -1;
/* 6 */             int i5 = 0;
/* 11 */            while (i < charSequence.length()) {
/* 13 */                char cCharAt = charSequence.charAt(i);
/* 19 */                if (cCharAt != ',') {
/* 23 */                    if (cCharAt == '[') {
/* 127 */                       i2++;
                            } else {
/* 27 */                        if (cCharAt != ']') {
/* 31 */                            if (cCharAt != '`') {
/* 35 */                                if (cCharAt == '{') {
/* 119 */                                   i3++;
                                        } else if (cCharAt == '}') {
                                            i3--;
/* 116 */                                   if (i3 < 0) {
                                            }
/* 97 */                                    i4 = i;
                                        } else if (cCharAt != 8239 && cCharAt != 8287 && cCharAt != 12288) {
/* 55 */                                    if (cCharAt == '.') {
                                                continue;
                                            } else if (cCharAt != '/') {
/* 63 */                                        if (cCharAt != '>') {
/* 67 */                                            if (cCharAt != '?') {
/* 71 */                                                if (cCharAt != 8232 && cCharAt != 8233) {
                                                            switch (cCharAt) {
                                                                case 0:
                                                                case 1:
                                                                case 2:
                                                                case 3:
                                                                case 4:
                                                                case 5:
                                                                case 6:
                                                                case 7:
                                                                case '\b':
                                                                case '\t':
                                                                case '\n':
                                                                case 11:
                                                                case '\f':
                                                                case '\r':
                                                                case 14:
                                                                case 15:
                                                                case 16:
                                                                case 17:
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
                                                                case ' ':
                                                                case '\"':
                                                                    break;
                                                                case '!':
                                                                    break;
                                                                default:
                                                                    switch (cCharAt) {
                                                                        case '\'':
                                                                            boolean z2 = !z;
/* 104 */                                                                   if (z) {
/* 106 */                                                                       i4 = i;
                                                                            }
/* 107 */                                                                   z = z2;
                                                                            continue;
                                                                        case '(':
/* 99 */                                                                    i5++;
                                                                            continue;
                                                                        case ')':
                                                                            i5--;
/* 95 */                                                                    if (i5 < 0) {
                                                                                break;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            switch (cCharAt) {
                                                                                case ':':
                                                                                case ';':
                                                                                    break;
                                                                                case '<':
                                                                                    break;
                                                                                default:
                                                                                    switch (cCharAt) {
                                                                                        case 127:
                                                                                        case Barcode.FORMAT_ITF:
                                                                                        case 129:
                                                                                        case 130:
                                                                                        case 131:
                                                                                        case 132:
                                                                                        case 133:
                                                                                        case 134:
                                                                                        case 135:
                                                                                        case 136:
                                                                                        case 137:
                                                                                        case 138:
                                                                                        case 139:
                                                                                        case 140:
                                                                                        case 141:
                                                                                        case 142:
                                                                                        case 143:
                                                                                        case 144:
                                                                                        case 145:
                                                                                        case 146:
                                                                                        case 147:
                                                                                        case 148:
                                                                                        case 149:
                                                                                        case 150:
                                                                                        case 151:
                                                                                        case 152:
                                                                                        case 153:
                                                                                        case 154:
                                                                                        case 155:
                                                                                        case 156:
                                                                                        case 157:
                                                                                        case 158:
                                                                                        case 159:
                                                                                        case 160:
                                                                                            break;
                                                                                        default:
                                                                                            switch (cCharAt) {
                                                                                            }
                                                                                    }
                                                                            }
                                                                    }
/* 97 */                                                            i4 = i;
                                                                    break;
                                                            }
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                            } else if (i4 == i - 1) {
/* 97 */                                        i4 = i;
                                            }
                                        }
                                    }
/* 132 */                           return i4;
                                }
                                i2--;
/* 124 */                       if (i2 < 0) {
/* 132 */                           return i4;
                                }
/* 97 */                        i4 = i;
                            }
                        }
/* 129 */               i++;
                    }
/* 132 */           return i4;
                }
            }
