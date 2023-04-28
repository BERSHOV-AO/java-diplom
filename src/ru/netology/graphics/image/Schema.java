package ru.netology.graphics.image;

public class Schema implements TextColorSchema {

    static final String COLOR_INTENSITY = "#$@%*+'";

    @Override
    public char convert(int color) {
        // поскольку количество символов меньше 255, будем использовать проценты
        int charValue = (int) Math.round(COLOR_INTENSITY.length() / 255.0 * color);
        charValue = Math.max(charValue, 0);
        charValue = Math.min(charValue, COLOR_INTENSITY.length() - 1);
        return COLOR_INTENSITY.charAt(charValue);
    }
}
