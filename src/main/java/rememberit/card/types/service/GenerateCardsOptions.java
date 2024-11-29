package rememberit.card.types.service;

import java.util.List;

public class GenerateCardsOptions {
    public List<GenerateCardsTranslationsOptions> translations;
    public String spreadsheetUrl;
    public String backgroundColor;
    public String textColor;
    public String translatedTextColor;
    public String sourceLanguage;
    public String targetLanguage;

    public GenerateCardsOptions(Builder builder) {
        this.translations = builder.translations;
        this.spreadsheetUrl = builder.spreadsheetUrl;
        this.backgroundColor = builder.backgroundColor;
        this.textColor = builder.textColor;
        this.translatedTextColor = builder.translatedTextColor;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
    }

    public static class Builder {
        private List<GenerateCardsTranslationsOptions> translations;
        private String spreadsheetUrl;
        private String backgroundColor;
        private String textColor;
        private String translatedTextColor;
        private String sourceLanguage;
        private String targetLanguage;

        public Builder translations(List<GenerateCardsTranslationsOptions> translations) {
            this.translations = translations;
            return this;
        }

        public Builder spreadsheetUrl(String spreadsheetUrl) {
            this.spreadsheetUrl = spreadsheetUrl;
            return this;
        }

        public Builder backgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Builder textColor(String textColor) {
            this.textColor = textColor;
            return this;
        }

        public Builder translatedTextColor(String translatedTextColor) {
            this.translatedTextColor = translatedTextColor;
            return this;
        }

        public Builder sourceLanguage(String sourceLanguage) {
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        public Builder targetLanguage(String targetLanguage) {
            this.targetLanguage = targetLanguage;
            return this;
        }

        public GenerateCardsOptions build() {
            return new GenerateCardsOptions(this);
        }
    }
}

